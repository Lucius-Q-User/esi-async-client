package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class AssetsApiImpl implements AssetsApi {
    
    private ApiClient apiClient;
    AssetsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedAssetName>>> resolveCharacterAssetNames(int characterId, LongArrayList itemIds) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/assets/names/";
        RequestBuilder builder = Dsl.post(url);
        builder.setBody(ApiClientBase.renderToBody(itemIds));
        TypeReference<List<ResolvedAssetName>> responseTypeRef = new TypeReference<List<ResolvedAssetName>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedAssetName>>> resolveCorporationAssetNames(int corporationId, LongArrayList itemIds) {
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/assets/names/";
        RequestBuilder builder = Dsl.post(url);
        builder.setBody(ApiClientBase.renderToBody(itemIds));
        TypeReference<List<ResolvedAssetName>> responseTypeRef = new TypeReference<List<ResolvedAssetName>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemLocation>>> resolveCharacterAssetLocations(int characterId, LongArrayList itemIds) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/assets/locations/";
        RequestBuilder builder = Dsl.post(url);
        builder.setBody(ApiClientBase.renderToBody(itemIds));
        TypeReference<List<ResolvedItemLocation>> responseTypeRef = new TypeReference<List<ResolvedItemLocation>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemLocation>>> resolveCorporationAssetLocations(int corporationId, LongArrayList itemIds) {
        String url = "https://esi.evetech.net/v2/corporations/" + corporationId + "/assets/locations/";
        RequestBuilder builder = Dsl.post(url);
        builder.setBody(ApiClientBase.renderToBody(itemIds));
        TypeReference<List<ResolvedItemLocation>> responseTypeRef = new TypeReference<List<ResolvedItemLocation>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterAssetsEntry>>> getCharacterAssets(int characterId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v3/characters/" + characterId + "/assets/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CharacterAssetsEntry>> responseTypeRef = new TypeReference<List<CharacterAssetsEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationAssetsEntry>>> getCorporationAssets(int corporationId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v3/corporations/" + corporationId + "/assets/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationAssetsEntry>> responseTypeRef = new TypeReference<List<CorporationAssetsEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<List<CharacterAssetsEntry>> getCharacterAssetsAllPages(int characterId) {
        return ApiClientBase.pagingHelper((page) -> getCharacterAssets(characterId, null, page), (List<CharacterAssetsEntry>)null);
    }
    
    @Override
    public CompletableFuture<List<CorporationAssetsEntry>> getCorporationAssetsAllPages(int corporationId) {
        return ApiClientBase.pagingHelper((page) -> getCorporationAssets(corporationId, null, page), (List<CorporationAssetsEntry>)null);
    }
}
