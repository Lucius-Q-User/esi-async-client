package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class LoyaltyApiImpl implements LoyaltyApi {
    
    private ApiClient apiClient;
    LoyaltyApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<LoyaltyPointsInfo>>> getLoyaltyPoints(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/loyalty/points/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<LoyaltyPointsInfo>> responseTypeRef = new TypeReference<List<LoyaltyPointsInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<LoyaltyStoreOffer>>> getLoyaltyStoreOffers(int corporationId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/loyalty/stores/" + corporationId + "/offers/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<LoyaltyStoreOffer>> responseTypeRef = new TypeReference<List<LoyaltyStoreOffer>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
