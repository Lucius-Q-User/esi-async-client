package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class WarsApiImpl implements WarsApi {
    private ApiClient apiClient;
    WarsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getWars(String ifNoneMatch, Integer maxWarId) {         
        String url = "https://esi.evetech.net/v1/wars/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (maxWarId != null) {
            String val = String.valueOf(maxWarId);
            builder.addQueryParam("max_war_id", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<WarInfo>> getWarInfo(String ifNoneMatch, int warId) {         
        String url = "https://esi.evetech.net/v1/wars/" + warId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<WarInfo> responseTypeRef = new TypeReference<WarInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<KillmailRef>>> getWarKillmails(String ifNoneMatch, Integer page, int warId) {         
        String url = "https://esi.evetech.net/v1/wars/" + warId + "/killmails/";
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
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
