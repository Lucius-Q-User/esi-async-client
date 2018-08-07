package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class KillmailsApiImpl implements KillmailsApi {
    private ApiClient apiClient;
    KillmailsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<KillmailRef>>> getCharacterRecentKillmails(int characterId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/killmails/recent/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<KillmailRef>> responseTypeRef = new TypeReference<List<KillmailRef>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<KillmailRef>>> getCorporationRecentKillmails(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/killmails/recent/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<KillmailRef>> responseTypeRef = new TypeReference<List<KillmailRef>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<KillmailData>> getKillmail(String ifNoneMatch, String killmailHash, int killmailId) {         
        String url = "https://esi.evetech.net/v1/killmails/" + killmailId + "/" + killmailHash + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<KillmailData> responseTypeRef = new TypeReference<KillmailData>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
