package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;

@SuppressWarnings("unused")
public class AssetsApi {
    private ApiClient apiClient;
    AssetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Return names for a set of item ids, which you can get from character assets endpoint. Typically used for items that can customize names, like containers or ships.
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param itemIds A list of item ids
     * @return List of asset names
     */
    
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
    /**
     * Return names for a set of item ids, which you can get from corporation assets endpoint. Only valid for items that can customize names, like containers or ships.
     * 
     * ---
     * 
     * Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param itemIds A list of item ids
     * @return List of asset names
     */
    
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
    /**
     * Return locations for a set of item ids, which you can get from character assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param itemIds A list of item ids
     * @return List of asset locations
     */
    
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
    /**
     * Return locations for a set of item ids, which you can get from corporation assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)
     * 
     * ---
     * 
     * Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param itemIds A list of item ids
     * @return List of asset locations
     */
    
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
    /**
     * Return a list of the characters assets
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A flat list of the users assets
     */
    
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
    /**
     * Return a list of the corporation assets
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of assets
     */
    
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
