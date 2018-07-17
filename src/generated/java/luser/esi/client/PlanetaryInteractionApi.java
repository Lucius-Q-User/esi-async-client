package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class PlanetaryInteractionApi {
    private ApiClient apiClient;
    PlanetaryInteractionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Returns a list of all planetary colonies owned by a character.
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of colonies
     */
    
    public CompletableFuture<EsiResponseWrapper<List<PlanetInfo>>> getPlanets(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/planets/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        ResponseParser<List<PlanetInfo>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<PlanetInfo>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * List customs offices owned by a corporation
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
     * @return A list of customs offices and their settings
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationCustomsOffice>>> getCustomsOffices(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/customs_offices/";
        
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
        ResponseParser<List<CorporationCustomsOffice>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<CorporationCustomsOffice>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Get information on a planetary factory schematic
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param schematicId A PI schematic ID
     * @return Public data about a schematic
     */
    
    public CompletableFuture<EsiResponseWrapper<SchematicInfo>> getSchematicInfo(DatasourceEnum datasource, String ifNoneMatch, int schematicId) {
        String url = "https://esi.evetech.net/v1/universe/schematics/{schematic_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("schematic_id", String.valueOf(schematicId));
        String body = null;
        String method = "GET";
        ResponseParser<SchematicInfo> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, SchematicInfo.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param planetId Planet id of the target planet
     * @return Colony layout
     */
    
    public CompletableFuture<EsiResponseWrapper<PlanetContents>> getPlanetInfo(int characterId, DatasourceEnum datasource, String ifNoneMatch, int planetId) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/planets/{planet_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("planet_id", String.valueOf(planetId));
        String body = null;
        String method = "GET";
        ResponseParser<PlanetContents> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, PlanetContents.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
