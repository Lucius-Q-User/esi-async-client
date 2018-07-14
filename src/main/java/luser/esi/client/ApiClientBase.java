package luser.esi.client;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.StreamSupport;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.netty.handler.codec.http.HttpHeaders;

abstract class ApiClientBase implements AutoCloseable {

    private String clientId;
    private String clientSecret;
    private String authToken;
    private String refreshToken;
    private Instant authTokenExpiry;
    private CompletableFuture<String> inflightRefresh;
    private static AsyncHttpClient asyncHttpClient = null;
    private static long activeClients = 0;
    private static final Object LOCK = new Object();
    private boolean disposed = false;
    public ApiClientBase() {
        synchronized (LOCK) {
            if (activeClients == 0) {
                asyncHttpClient = Dsl.asyncHttpClient();
            }
            activeClients++;
        }
    }
    @Override
    public synchronized void close() {
        if (!disposed) {
            disposed = true;
            synchronized (LOCK) {
                activeClients--;
                if (activeClients == 0) {
                    try {
                        asyncHttpClient.close();
                    } catch (Exception e) {
                        throw new Error(e);
                    }
                }
            }
        }
    }
    @Override
    protected void finalize() throws Throwable {
        close();
    }
    static final ObjectMapper GLOBAL_OBJECT_MAPPER = new ObjectMapper().registerModule(new JavaTimeModule());
    public synchronized String getClientId() {
        return clientId;
    }

    public synchronized void setClientId(String clientId) {
        this.clientId = clientId;
        authTokenExpiry = Instant.MIN;
        inflightRefresh = null;
    }

    public synchronized String getClientSecret() {
        return clientSecret;
    }

    public synchronized void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        authTokenExpiry = Instant.MIN;
        inflightRefresh = null;
    }

    public synchronized String getAuthToken() {
        return authToken;
    }

    public synchronized void setAuthToken(String authToken) {
        this.authToken = authToken;
        authTokenExpiry = Instant.MAX;
        inflightRefresh = null;
    }

    public synchronized String getRefreshToken() {
        return refreshToken;
    }

    public synchronized void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        authTokenExpiry = Instant.MIN;
        inflightRefresh = null;
    }

    private SsoApi ssoApi = new SsoApi((ApiClient)this);
    public SsoApi getSsoApi() {
        return ssoApi;
    }

    private synchronized CompletableFuture<String> getAuth() {
        if (inflightRefresh != null) {
            return inflightRefresh;
        }
        if (refreshToken == null) {
            return CompletableFuture.completedFuture(authToken);
        }
        if (authTokenExpiry.isAfter(Instant.now())) {
            return CompletableFuture.completedFuture(authToken);
        }
        try {
            String authVal = "Basic " + Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));
            ObjectNode authBody = GLOBAL_OBJECT_MAPPER.createObjectNode();
            authBody.put("grant_type", "refresh_token");
            authBody.put("refresh_token", refreshToken);
            RequestBuilder builder = Dsl.post("https://login.eveonline.com/oauth/token")
                    .addHeader("Authorization", authVal)
                    .addHeader("Content-Type", "application/json")
                    .setBody(GLOBAL_OBJECT_MAPPER.writeValueAsString(authBody));
            inflightRefresh = asyncHttpClient.executeRequest(builder).toCompletableFuture().thenCompose((resp) -> {
                try {
                    ObjectNode js = (ObjectNode) GLOBAL_OBJECT_MAPPER.readTree(resp.getResponseBody());
                    synchronized (this) {
                        inflightRefresh = null;
                        authToken = js.get("access_token").asText();
                        authTokenExpiry = Instant.now().plus(js.get("expires_in").asLong(), ChronoUnit.SECONDS);
                    }
                    return CompletableFuture.completedFuture(authToken);
                } catch (IOException e) {
                    CompletableFuture<String> err = new CompletableFuture<>();
                    err.completeExceptionally(e);
                    return err;
                }
            });
            return inflightRefresh;
        } catch (JsonProcessingException e) {
            throw new Error(e);
        }
    }





    private <T> CompletableFuture<EsiResponseWrapper<T>> invokeApi(RequestBuilder builder, ResponseParser<T> responseParser) {
        return asyncHttpClient.executeRequest(builder).toCompletableFuture().thenCompose((resp) -> {
            int statusCode = resp.getStatusCode();
            String resultBody = resp.getResponseBody();
            Map<String, List<String>> headers = headersToMap(resp.getHeaders());
            if (statusCode / 100 != 2) {
                CompletableFuture<EsiResponseWrapper<T>> future = new CompletableFuture<>();

                future.completeExceptionally(new ApiException(statusCode, headers, resultBody));
                return future;
            } else {
                try {
                    T parsedResponse = responseParser.apply(resultBody);
                    return CompletableFuture.completedFuture(new EsiResponseWrapper<>(statusCode, headers, parsedResponse));
                } catch (IOException e) {
                    CompletableFuture<EsiResponseWrapper<T>> future = new CompletableFuture<>();
                    future.completeExceptionally(e);
                    return future;
                }
            }
        }).exceptionally((ex) -> {
            ex.printStackTrace();
            return null;
        });
    }

    <T> CompletableFuture<EsiResponseWrapper<T>> invokeApi(String url, Map<String, String> parametersInHeaders, Map<String, String> parametersInUrl, Map<String, String> parametersInQuery, String body, String method,
            boolean needsAuth, ResponseParser<T> responseParser) {
        for (Entry<String, String> e : parametersInUrl.entrySet()) {
            url = url.replace("{" + e.getKey() + "}", e.getValue());
        }
        RequestBuilder builder = Dsl.request(method, url);
        for (Entry<String, String> e : parametersInQuery.entrySet()) {
            builder = builder.addQueryParam(e.getKey(), e.getValue());
        }
        for (Entry<String, String> e : parametersInHeaders.entrySet()) {
            builder = builder.addHeader(e.getKey(), e.getValue());
        }
        if (body != null) {
            builder = builder.setBody(body);
        }
        //fixing the "local var must be effectively final"
        RequestBuilder builder0 = builder;
        if (!needsAuth) {
            return invokeApi(builder0, responseParser);
        }
        return getAuth().thenCompose((authToken) -> {
            builder0.addHeader("Authorization", "Bearer " + authToken);
            return invokeApi(builder0, responseParser);
        });
    }

    private static Map<String, List<String>> headersToMap(HttpHeaders hdr) {
        Map<String, List<String>> ret = new HashMap<>();
        for (Entry<String, String> e : hdr) {
            ret.compute(e.getKey(), (k, v) -> {
                if (v == null) {
                    return Arrays.asList(e.getValue());
                } else {
                    v.add(e.getValue());
                    return v;
                }
            });
        }
        return ret;
    }

    static String renderArrayToQuery(int[] labels, Object o) {
        Iterable<String> it = Arrays.stream(labels).mapToObj(String::valueOf)::iterator;
        return String.join(",", it);
    }

    static String renderArrayToQuery(long[] labelIds, Object o) {
        Iterable<String> it = Arrays.stream(labelIds).mapToObj(String::valueOf)::iterator;
        return String.join(",", it);
    }

    static String renderArrayToQuery(Iterable<CategoriesEnum> categories, CategoriesEnum typeTrace) {
        Iterable<String> it = StreamSupport.stream(categories.spliterator(), false).map(CategoriesEnum::getStringValue)::iterator;
        return String.join(",", it);
    }

    static String renderArrayToQuery(Iterable<IntArrayList> connections, IntArrayList typeTrace) {
        Iterable<String> it = StreamSupport.stream(connections.spliterator(), false).map((c) -> {
            return c.get(0) + "|" + c.get(1);
        })::iterator;
        return String.join(",", it);
    }

    static String renderToBody(int[] characters) {
        return "[" + renderArrayToQuery(characters, null) + "]";
    }

    static String renderToBody(long[] itemIds) {
        return "[" + renderArrayToQuery(itemIds, null) + "]";
    }

    static String renderToBody(List<String> names) {
        try {
            return GLOBAL_OBJECT_MAPPER.writeValueAsString(names);
        } catch (JsonProcessingException e) {
            throw new Error(e);
        }
    }
    static String renderToBody(ApiParameterObject jsc) {
        try {
            return GLOBAL_OBJECT_MAPPER.writeValueAsString(jsc);
        } catch (JsonProcessingException e) {
            throw new Error(e);
        }
    }

}
