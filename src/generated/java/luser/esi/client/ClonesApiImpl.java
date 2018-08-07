package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class ClonesApiImpl implements ClonesApi {
    private ApiClient apiClient;
    ClonesApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getImplants(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/implants/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CloneInfo>> getClones(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v3/characters/" + characterId + "/clones/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CloneInfo> responseTypeRef = new TypeReference<CloneInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
