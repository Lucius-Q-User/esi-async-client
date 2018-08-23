package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class FittingsApiImpl implements FittingsApi {
    
    private ApiClient apiClient;
    FittingsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<SavedFitting>>> getFittings(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/fittings/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<SavedFitting>> responseTypeRef = new TypeReference<List<SavedFitting>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<FittingCreatedResponse>> createFitting(int characterId, NewStoredFitting fitting) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/fittings/";
        RequestBuilder builder = Dsl.post(url);
        builder.setBody(ApiClientBase.renderToBody(fitting));
        TypeReference<FittingCreatedResponse> responseTypeRef = new TypeReference<FittingCreatedResponse>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFitting(int characterId, int fittingId) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/fittings/" + fittingId + "/";
        RequestBuilder builder = Dsl.delete(url);
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
