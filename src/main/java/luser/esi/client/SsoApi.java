package luser.esi.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;


public class SsoApi {
    private ApiClient apiClient;
    SsoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public CompletableFuture<EsiResponseWrapper<TokenExchangeResponse>> finishFlowWithCode(String code) {
        String url = "https://login.eveonline.com/oauth/token";
        Map<String, String> parametersInHeaders = new HashMap<>(2);
        String authVal = apiClient.getAuthorizationString();
        parametersInHeaders.put("Authorization", authVal);
        parametersInHeaders.put("Content-Type", "application/json");
        Map<String, String> parametersInUrl = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(0);
        TokenRequest authBody = TokenRequest.forCode(code);
        String body = ApiClientBase.renderToBody(authBody);
        String method = "POST";
        boolean needsAuth = false;
        TypeReference<TokenExchangeResponse> respTypRef = new TypeReference<TokenExchangeResponse>() {};
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, respTypRef);
    }

    public CompletableFuture<EsiResponseWrapper<TokenVerifyResponse>> verifyToken() {
        String url = "https://login.eveonline.com/oauth/verify";
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInUrl = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(0);
        String method = "GET";
        boolean needsAuth = true;
        String body = null;
        TypeReference<TokenVerifyResponse> respTypRef = new TypeReference<TokenVerifyResponse>() {};
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, respTypRef);
    }
}
