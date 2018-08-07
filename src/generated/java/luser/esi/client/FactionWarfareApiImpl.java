package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class FactionWarfareApiImpl implements FactionWarfareApi {
    private ApiClient apiClient;
    FactionWarfareApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CharacterFwStats>> getFwStats(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/fw/stats/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CharacterFwStats> responseTypeRef = new TypeReference<CharacterFwStats>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CorporationFwStatsResponse>> getCorporationFwStats(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/fw/stats/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CorporationFwStatsResponse> responseTypeRef = new TypeReference<CorporationFwStatsResponse>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<FwFactionLeaderboards>> getFwFactionLeaderboards(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/fw/leaderboards/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<FwFactionLeaderboards> responseTypeRef = new TypeReference<FwFactionLeaderboards>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<FwCharacterLeaderboards>> getFwCharacterLeaderboards(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/fw/leaderboards/characters/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<FwCharacterLeaderboards> responseTypeRef = new TypeReference<FwCharacterLeaderboards>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<FWCorporationLeaderboards>> getFwCorporationLeaderboards(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/fw/leaderboards/corporations/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<FWCorporationLeaderboards> responseTypeRef = new TypeReference<FWCorporationLeaderboards>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<GlobalFwStats>>> getFwStats(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/fw/stats/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<GlobalFwStats>> responseTypeRef = new TypeReference<List<GlobalFwStats>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<FwActiveWars>>> getFwWars(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/fw/wars/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<FwActiveWars>> responseTypeRef = new TypeReference<List<FwActiveWars>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<FwSystemsList>>> getFwSystems(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v2/fw/systems/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<FwSystemsList>> responseTypeRef = new TypeReference<List<FwSystemsList>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
