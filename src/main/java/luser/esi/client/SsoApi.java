package luser.esi.client;

import java.util.concurrent.CompletableFuture;

import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

import com.fasterxml.jackson.core.type.TypeReference;


public class SsoApi {
    private ApiClient apiClient;
    SsoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public CompletableFuture<EsiResponseWrapper<TokenExchangeResponse>> finishFlowWithCode(String code) {
        RequestBuilder builder = Dsl.post("https://login.eveonline.com/oauth/token");
        String authVal = apiClient.getAuthorizationString();
        builder.addHeader("Authorization", authVal);
        builder.addHeader("Content-Type", "application/json");
        TokenRequest authBody = TokenRequest.forCode(code);
        builder.setBody(ApiClientBase.renderToBody(authBody));
        boolean needsAuth = false;
        TypeReference<TokenExchangeResponse> respTypRef = new TypeReference<TokenExchangeResponse>() {};
        return apiClient.invokeApi(builder, needsAuth, respTypRef);
    }

    public CompletableFuture<EsiResponseWrapper<TokenVerifyResponse>> verifyToken() {
        RequestBuilder builder = Dsl.get("https://login.eveonline.com/oauth/token");
        boolean needsAuth = true;
        TypeReference<TokenVerifyResponse> respTypRef = new TypeReference<TokenVerifyResponse>() {};
        return apiClient.invokeApi(builder, needsAuth, respTypRef);
    }
}
