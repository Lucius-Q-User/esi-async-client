package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class SovereigntyApiImpl implements SovereigntyApi {
    
    private ApiClient apiClient;
    SovereigntyApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<SovereigntyCampaign>>> getSovereigntyCampaigns(String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/sovereignty/campaigns/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<SovereigntyCampaign>> responseTypeRef = new TypeReference<List<SovereigntyCampaign>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<SovMap>>> getSovereigntyMap(String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/sovereignty/map/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<SovMap>> responseTypeRef = new TypeReference<List<SovMap>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<SovStructures>>> getSovereigntyStructures(String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/sovereignty/structures/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<SovStructures>> responseTypeRef = new TypeReference<List<SovStructures>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
