package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;

@SuppressWarnings("unused")
public class AssetsApi {
    private ApiClient apiClient;
    AssetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedAssetName>>> postCharactersCharacterIdAssetsNames(int characterId, DatasourceEnum datasource, long[] itemIds) {
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
        ResponseParser<List<ResolvedAssetName>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<ResolvedAssetName>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedAssetName>>> postCorporationsCorporationIdAssetsNames(int corporationId, DatasourceEnum datasource, long[] itemIds) {
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
        ResponseParser<List<ResolvedAssetName>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<ResolvedAssetName>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemLocation>>> postCharactersCharacterIdAssetsLocations(int characterId, DatasourceEnum datasource, long[] itemIds) {
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
        ResponseParser<List<ResolvedItemLocation>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<ResolvedItemLocation>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemLocation>>> postCorporationsCorporationIdAssetsLocations(int corporationId, DatasourceEnum datasource, long[] itemIds) {
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
        ResponseParser<List<ResolvedItemLocation>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<ResolvedItemLocation>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterAssetsEntry>>> getCharactersCharacterIdAssets(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
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
        ResponseParser<List<CharacterAssetsEntry>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<CharacterAssetsEntry>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationAssetsEntry>>> getCorporationsCorporationIdAssets(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
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
        ResponseParser<List<CorporationAssetsEntry>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<CorporationAssetsEntry>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
