package luser.esi.client;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

public class SsoApi {
    private ApiClient apiClient;
    SsoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public CompletableFuture<EsiResponseWrapper<TokenExchangeResponse>> finishFlowWithCode(String code) {
        String url = "https://login.eveonline.com/oauth/token";
        Map<String, String> parametersInHeaders = new HashMap<>(2);
        String authVal = "Basic " + Base64.getEncoder()
            .encodeToString((apiClient.getClientId() + ":" + apiClient.getClientSecret()).getBytes(StandardCharsets.UTF_8));
        parametersInHeaders.put("Authorization", authVal);
        parametersInHeaders.put("Content-Type", "application/json");
        Map<String, String> parametersInUrl = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(0);
        String body = Json.object("grant_type", "authorization_code", "code", code).toString();
        String method = "POST";
        boolean needsAuth = false;
        Function<String, TokenExchangeResponse> responseParser = (resp) -> {
            Json json = Json.read(resp);
            return TokenExchangeResponse.fromJson(json);
        };
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    public CompletableFuture<EsiResponseWrapper<TokenVerifyResponse>> verifyToken() {
        String url = "https://login.eveonline.com/oauth/verify";
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInUrl = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(0);
        String method = "GET";
        boolean needsAuth = true;
        String body = null;
        Function<String, TokenVerifyResponse> responseParser = (resp) -> {
            Json json = Json.read(resp);
            return TokenVerifyResponse.fromJson(json);
        };
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }

}
