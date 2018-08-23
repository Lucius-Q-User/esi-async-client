package luser.esi.client;

import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class StatusApiImpl implements StatusApi {
    
    private ApiClient apiClient;
    StatusApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<ServerStatus>> getStatus(String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/status/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<ServerStatus> responseTypeRef = new TypeReference<ServerStatus>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
