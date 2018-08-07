package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

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
    public CompletableFuture<EsiResponseWrapper<List<ResolvedAssetName>>> resolveCharacterAssetNames(int characterId, DatasourceEnum datasource, LongArrayList itemIds) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/assets/names/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        body = ApiClientBase.renderToBody(itemIds);
        String method = "POST";
        TypeReference<List<ResolvedAssetName>> responseTypeRef = new TypeReference<List<ResolvedAssetName>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedAssetName>>> resolveCorporationAssetNames(int corporationId, DatasourceEnum datasource, LongArrayList itemIds) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/assets/names/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        body = ApiClientBase.renderToBody(itemIds);
        String method = "POST";
        TypeReference<List<ResolvedAssetName>> responseTypeRef = new TypeReference<List<ResolvedAssetName>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemLocation>>> resolveCharacterAssetLocations(int characterId, DatasourceEnum datasource, LongArrayList itemIds) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/assets/locations/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        body = ApiClientBase.renderToBody(itemIds);
        String method = "POST";
        TypeReference<List<ResolvedItemLocation>> responseTypeRef = new TypeReference<List<ResolvedItemLocation>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemLocation>>> resolveCorporationAssetLocations(int corporationId, DatasourceEnum datasource, LongArrayList itemIds) {
        String url = "https://esi.evetech.net/v2/corporations/{corporation_id}/assets/locations/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        body = ApiClientBase.renderToBody(itemIds);
        String method = "POST";
        TypeReference<List<ResolvedItemLocation>> responseTypeRef = new TypeReference<List<ResolvedItemLocation>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterAssetsEntry>>> getCharacterAssets(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/assets/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        TypeReference<List<CharacterAssetsEntry>> responseTypeRef = new TypeReference<List<CharacterAssetsEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationAssetsEntry>>> getCorporationAssets(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v3/corporations/{corporation_id}/assets/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        TypeReference<List<CorporationAssetsEntry>> responseTypeRef = new TypeReference<List<CorporationAssetsEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
