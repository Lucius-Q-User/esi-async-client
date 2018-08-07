package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class AllianceApiImpl implements AllianceApi {
    private ApiClient apiClient;
    AllianceApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getAlliances(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/alliances/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getCorporations(int allianceId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/alliances/" + allianceId + "/corporations/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<AllianceIcons>> getIcons(int allianceId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/alliances/" + allianceId + "/icons/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<AllianceIcons> responseTypeRef = new TypeReference<AllianceIcons>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<AllianceInfo>> getAllianceInfo(int allianceId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v3/alliances/" + allianceId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<AllianceInfo> responseTypeRef = new TypeReference<AllianceInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
