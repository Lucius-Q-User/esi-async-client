package luser.esi.client;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.databind.node.ObjectNode;


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
        ObjectNode authBody = ApiClientBase.GLOBAL_OBJECT_MAPPER.createObjectNode();
        authBody.put("grant_type", "authorization_code");
        authBody.put("code", code);
        try {
            String body = ApiClientBase.GLOBAL_OBJECT_MAPPER.writeValueAsString(authBody);
            String method = "POST";
            boolean needsAuth = false;
            ResponseParser<TokenExchangeResponse> responseParser = (resp) -> {
                return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, TokenExchangeResponse.class);
            };
            return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public CompletableFuture<EsiResponseWrapper<TokenVerifyResponse>> verifyToken() {
        String url = "https://login.eveonline.com/oauth/verify";
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInUrl = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(0);
        String method = "GET";
        boolean needsAuth = true;
        String body = null;
        ResponseParser<TokenVerifyResponse> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, TokenVerifyResponse.class);
        };
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
