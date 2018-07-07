package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

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
        Function<String, List<ResolvedAssetName>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<ResolvedAssetName> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(ResolvedAssetName.fromJson(jo));
            }
            return ret;
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
        Function<String, List<ResolvedAssetName>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<ResolvedAssetName> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(ResolvedAssetName.fromJson(jo));
            }
            return ret;
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
        Function<String, List<ResolvedItemLocation>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<ResolvedItemLocation> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(ResolvedItemLocation.fromJson(jo));
            }
            return ret;
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
        Function<String, List<ResolvedItemLocation>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<ResolvedItemLocation> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(ResolvedItemLocation.fromJson(jo));
            }
            return ret;
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
        Function<String, List<CharacterAssetsEntry>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<CharacterAssetsEntry> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(CharacterAssetsEntry.fromJson(jo));
            }
            return ret;
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
        Function<String, List<CorporationAssetsEntry>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<CorporationAssetsEntry> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(CorporationAssetsEntry.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
