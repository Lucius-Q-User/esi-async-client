package luser.esi.client;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class LocationApi {
    private ApiClient apiClient;
    LocationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.
     */
    
    public CompletableFuture<EsiResponseWrapper<CurrentLocation>> getLocation(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/location/";
        
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
        ResponseParser<CurrentLocation> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, CurrentLocation.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Get the current ship type, name and id
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Get the current ship type, name and id
     */
    
    public CompletableFuture<EsiResponseWrapper<ActiveShip>> getShip(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/ship/";
        
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
        ResponseParser<ActiveShip> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, ActiveShip.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Checks if the character is currently online
     * 
     * ---
     * 
     * This route is cached for up to 60 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Object describing the character's online status
     */
    
    public CompletableFuture<EsiResponseWrapper<OnlineInfo>> getOnline(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/online/";
        
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
        ResponseParser<OnlineInfo> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, OnlineInfo.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
