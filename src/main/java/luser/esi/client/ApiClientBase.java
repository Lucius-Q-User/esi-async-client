package luser.esi.client;

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
import java.util.function.Function;
import java.util.stream.StreamSupport;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

import io.netty.handler.codec.http.HttpHeaders;
import mjson.Json;

abstract class ApiClientBase {

    private String clientId;
    private String clientSecret;
    private String authToken;
    private String refreshToken;
    private Instant authTokenExpiry;
    private CompletableFuture<String> inflightRefresh;

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
        String authVal = "Basic " + Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));
        Json authBody = Json.object("grant_type", "refresh_token", "refresh_token", refreshToken);
        RequestBuilder builder = Dsl.post("https://login.eveonline.com/oauth/token")
                .addHeader("Authorization", authVal)
                .addHeader("Content-Type", "application/json")
                .setBody(authBody.toString());
        inflightRefresh = asyncHttpClient.executeRequest(builder).toCompletableFuture().thenApply((resp) -> {
            Map<String, Json> js = Json.read(resp.getResponseBody()).asJsonMap();
            synchronized (this) {
                inflightRefresh = null;
                authToken = js.get("access_token").asString();
                authTokenExpiry = Instant.now().plus(js.get("expires_in").asLong(), ChronoUnit.SECONDS);
            }
            return authToken;
        });
        return inflightRefresh;
    }

    private static final AsyncHttpClient asyncHttpClient = Dsl.asyncHttpClient();

    private <T> CompletableFuture<EsiResponseWrapper<T>> invokeApi(RequestBuilder builder, Function<String, T> responseParser) {
        return asyncHttpClient.executeRequest(builder).toCompletableFuture().thenCompose((resp) -> {
            int statusCode = resp.getStatusCode();
            String resultBody = resp.getResponseBody();
            Map<String, List<String>> headers = headersToMap(resp.getHeaders());
            if (statusCode / 100 != 2) {
                CompletableFuture<EsiResponseWrapper<T>> future = new CompletableFuture<>();
                future.completeExceptionally(new ApiException(statusCode, headers, resultBody));
                return future;
            } else {
                T parsedResponse = responseParser.apply(resultBody);
                return CompletableFuture.completedFuture(new EsiResponseWrapper<>(statusCode, headers, parsedResponse));
            }
        });
    }

    <T> CompletableFuture<EsiResponseWrapper<T>> invokeApi(String url, Map<String, String> parametersInHeaders, Map<String, String> parametersInUrl, Map<String, String> parametersInQuery, String body, String method,
            boolean needsAuth, Function<String, T> responseParser) {
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

    static String renderArrayToQuery(Iterable<int[]> connections, int[] typeTrace) {
        Iterable<String> it = StreamSupport.stream(connections.spliterator(), false).map((c) -> {
            return c[0] + "|" + c[1];
        })::iterator;
        return String.join(",", it);
    }

    static String renderToBody(int[] characters) {
        return "[" + renderArrayToQuery(characters, null) + "]";
    }

    static String renderToBody(long[] itemIds) {
        return "[" + renderArrayToQuery(itemIds, null) + "]";
    }

    static String renderToBody(Iterable<String> names) {
        Json ar = Json.array();
        for (String name : names) {
            ar.add(Json.make(name));
        }
        return ar.toString();
    }

    static String renderToBody(JsonConvertible jsc) {
        return jsc.toJson().toString();
    }
    static Double optGetDouble(Json js) {
        if (js == null) {
            return null;
        }
        return js.asDouble();
    }
    static Float optGetFloat(Json js) {
        if (js == null) {
            return null;
        }
        return js.asFloat();
    }
    static Integer optGetInteger(Json js) {
        if (js == null) {
            return null;
        }
        return js.asInteger();
    }
    static Long optGetLong(Json js) {
        if (js == null) {
            return null;
        }
        return js.asLong();
    }
    static Boolean optGetBoolean(Json js) {
        if (js == null) {
            return null;
        }
        return js.asBoolean();
    }
    static String optGetString(Json js) {
        if (js == null) {
            return null;
        }
        return js.asString();
    }

}