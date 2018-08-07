package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class DogmaApiImpl implements DogmaApi {
    private ApiClient apiClient;
    DogmaApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getAttributes(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/dogma/attributes/";
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
    public CompletableFuture<EsiResponseWrapper<DogmaAttributeInfo>> getAttributeInfo(int attributeId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/dogma/attributes/" + attributeId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<DogmaAttributeInfo> responseTypeRef = new TypeReference<DogmaAttributeInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<DogmaDynamicItemInfo>> getDynamicItemStats(String ifNoneMatch, long itemId, int typeId) {         
        String url = "https://esi.evetech.net/v1/dogma/dynamic/items/" + typeId + "/" + itemId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<DogmaDynamicItemInfo> responseTypeRef = new TypeReference<DogmaDynamicItemInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getEffects(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/dogma/effects/";
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
    public CompletableFuture<EsiResponseWrapper<DogmaEffectIfno>> getEffectInfo(int effectId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v2/dogma/effects/" + effectId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<DogmaEffectIfno> responseTypeRef = new TypeReference<DogmaEffectIfno>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
