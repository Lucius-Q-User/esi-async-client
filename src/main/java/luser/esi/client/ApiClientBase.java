package luser.esi.client;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.StreamSupport;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.IntContainer;
import com.carrotsearch.hppc.LongContainer;
import com.carrotsearch.hppc.cursors.IntCursor;
import com.carrotsearch.hppc.cursors.LongCursor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hppc.HppcModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.netty.handler.codec.http.HttpHeaders;

abstract class ApiClientBase implements AutoCloseable {

    private String clientId;
    private String clientSecret;
    private String authToken;
    private String refreshToken;
    private Instant authTokenExpiry;
    private CompletableFuture<String> inflightRefresh;
    private AsyncHttpClient asyncHttpClient;

    private boolean disposed = false;
    private DatasourceEnum datasource;
    private String userAgent;
    public ApiClientBase() {
        asyncHttpClient = Dsl.asyncHttpClient(Dsl.config().setUserAgent(null).setConnectTimeout(Integer.MAX_VALUE));
    }
    @Override
    public synchronized void close() {
        if (!disposed) {
            disposed = true;
            try {
                asyncHttpClient.close();
            } catch (Exception e) {
                throw new Error(e);
            }
        }
    }
    @Override
    protected void finalize() throws Throwable {
        close();
    }
    static final ObjectMapper GLOBAL_OBJECT_MAPPER = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .registerModule(new HppcModule())
            .enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING)
            .enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    public synchronized String getClientId() {
        return clientId;
    }
    public synchronized void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    public synchronized String getUserAgent() {
        return userAgent;
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
    public DatasourceEnum getDatasource() {
        return datasource;
    }
    public void setDatasource(DatasourceEnum datasource) {
        this.datasource = datasource;
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
    String getAuthorizationString() {
        return "Basic " + Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));
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
        String authVal = getAuthorizationString();
        RequestBuilder builder = Dsl.post("https://login.eveonline.com/oauth/token");
        builder.addHeader("Authorization", authVal);
        builder.addHeader("Content-Type", "application/json");
        builder.setBody(renderToBody(TokenRequest.forRefToken(refreshToken)));
        TypeReference<TokenExchangeResponse> responseTypeRef = new TypeReference<TokenExchangeResponse>() {};
        inflightRefresh = invokeApi(builder, false, responseTypeRef).thenCompose((wr) -> {
            TokenExchangeResponse js = wr.get();
            synchronized (this) {
                if (inflightRefresh != null) {
                    inflightRefresh = null;
                    authToken = js.getAccessToken();
                    authTokenExpiry = Instant.now().plus(js.getExpiresIn(), ChronoUnit.SECONDS);
                }
            }
            return CompletableFuture.completedFuture(authToken);
        });
        return inflightRefresh;
    }

    private <T> CompletableFuture<EsiResponseWrapper<T>> invokeApi(RequestBuilder builder, TypeReference<T> responseTypeRef) {
        String userAgent = getUserAgent();
        if (userAgent != null) {
            builder.addHeader("User-Agent", userAgent);
        }
        if (datasource != null) {
            builder.addQueryParam("datasource", datasource.stringValue);
        }
        CompletableFuture<EsiResponseWrapper<T>> ftr = asyncHttpClient.executeRequest(builder).toCompletableFuture().thenCompose((resp) -> {
            int statusCode = resp.getStatusCode();
            String resultBody = resp.getResponseBody();
            Map<String, List<String>> headers = headersToMap(resp.getHeaders());
            if (statusCode / 100 != 2) {
                CompletableFuture<EsiResponseWrapper<T>> future = new CompletableFuture<>();

                future.completeExceptionally(new ApiException(statusCode, headers, resultBody));
                return future;
            } else {
                try {
                    T parsedResponse;
                    if (responseTypeRef != null) {
                        parsedResponse = GLOBAL_OBJECT_MAPPER.readValue(resultBody, responseTypeRef);
                    } else {
                        parsedResponse = null;
                    }
                    return CompletableFuture.completedFuture(new EsiResponseWrapper<>(statusCode, headers, parsedResponse));
                } catch (IOException e) {
                    CompletableFuture<EsiResponseWrapper<T>> future = new CompletableFuture<>();
                    future.completeExceptionally(e);
                    return future;
                }
            }
        });
        return ftr;
    }


    <T> CompletableFuture<EsiResponseWrapper<T>> invokeApi(RequestBuilder builder, boolean needsAuth, TypeReference<T> responseTypeRef) {
        if (!needsAuth) {
            return invokeApi(builder, responseTypeRef);
        }
        return getAuth().thenCompose((authToken) -> {
            builder.addHeader("Authorization", "Bearer " + authToken);
            return invokeApi(builder, responseTypeRef);
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

    static String renderArrayToQuery(IntContainer ints, Object o) {
        ArrayList<String> strs = new ArrayList<>(ints.size());
        for (IntCursor cursor : ints) {
            strs.add(String.valueOf(cursor.value));
        }
        return String.join(",", strs);
    }

    static String renderArrayToQuery(LongContainer longs, Object o) {
        ArrayList<String> strs = new ArrayList<>(longs.size());
        for (LongCursor cursor : longs) {
            strs.add(String.valueOf(cursor.value));
        }
        return String.join(",", strs);
    }

    static String renderArrayToQuery(Iterable<CategoriesEnum> categories, CategoriesEnum typeTrace) {
        Iterable<String> it = StreamSupport.stream(categories.spliterator(), false).map(CategoriesEnum::toString)::iterator;
        return String.join(",", it);
    }

    static String renderArrayToQuery(Iterable<IntArrayList> connections, IntArrayList typeTrace) {
        Iterable<String> it = StreamSupport.stream(connections.spliterator(), false).map((c) -> {
            return c.get(0) + "|" + c.get(1);
        })::iterator;
        return String.join(",", it);
    }

    static String renderToBody(Object jsc) {
        try {
            return GLOBAL_OBJECT_MAPPER.writeValueAsString(jsc);
        } catch (JsonProcessingException e) {
            throw new Error(e);
        }

    }
    static <T> CompletableFuture<List<T>> pagingHelper(Function<Integer, CompletableFuture<EsiResponseWrapper<List<T>>>> fn, List<T> typeTrace) {
        CompletableFuture<EsiResponseWrapper<List<T>>> page1 = fn.apply(null);
        return page1.thenCompose((wr) -> {
            List<T> ret = new ArrayList<>();
            ret.addAll(wr.get());
            List<CompletableFuture<EsiResponseWrapper<List<T>>>> ift = new ArrayList<>();
            for (int i = 2; i <= wr.getXPages(); i++) {
                ift.add(fn.apply(i));
            }
            return CompletableFuture.allOf(ift.toArray(new CompletableFuture[0])).thenCompose((v) -> {
                for (CompletableFuture<EsiResponseWrapper<List<T>>> ft: ift) {
                    try {
                        List<T> ts = ft.get().get();
                        ret.addAll(ts);
                    } catch (ExecutionException e) {
                        CompletableFuture<List<T>> eft = new CompletableFuture<>();
                        eft.completeExceptionally(e.getCause());
                        return eft;
                    } catch (InterruptedException e) {
                        // TODO: handle exception
                    }
                }
                return CompletableFuture.completedFuture(ret);
            });
        });

    }
    static CompletableFuture<IntArrayList> pagingHelper(Function<Integer, CompletableFuture<EsiResponseWrapper<IntArrayList>>> fn, IntArrayList typeTrace) {
        CompletableFuture<EsiResponseWrapper<IntArrayList>> page1 = fn.apply(null);
        return page1.thenCompose((wr) -> {
            IntArrayList ret = new IntArrayList();
            ret.addAll(wr.get());
            List<CompletableFuture<EsiResponseWrapper<IntArrayList>>> ift = new ArrayList<>();
            for (int i = 2; i <= wr.getXPages(); i++) {
                ift.add(fn.apply(i));
            }
            return CompletableFuture.allOf(ift.toArray(new CompletableFuture[0])).thenCompose((v) -> {
                for (CompletableFuture<EsiResponseWrapper<IntArrayList>> ft: ift) {
                    try {
                        IntArrayList ts = ft.get().get();
                        ret.addAll(ts);
                    } catch (ExecutionException e) {
                        CompletableFuture<IntArrayList> eft = new CompletableFuture<>();
                        eft.completeExceptionally(e.getCause());
                        return eft;
                    } catch (InterruptedException e) {
                        // TODO: handle exception
                    }
                }
                return CompletableFuture.completedFuture(ret);
            });
        });

    }

}
