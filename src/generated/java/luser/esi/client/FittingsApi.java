package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class FittingsApi {
    private ApiClient apiClient;
    FittingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Return fittings of a character
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of fittings
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SavedFitting>>> getFittings(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/fittings/";
        
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
        ResponseParser<List<SavedFitting>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<SavedFitting>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Save a new fitting for a character
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param fitting Details about the new fitting
     * @return A list of fittings
     */
    
    public CompletableFuture<EsiResponseWrapper<FittingCreatedResponse>> createFitting(int characterId, DatasourceEnum datasource, NewStoredFitting fitting) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/fittings/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        body = ApiClientBase.renderToBody(fitting);
        String method = "POST";
        ResponseParser<FittingCreatedResponse> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, FittingCreatedResponse.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Delete a fitting from a character
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param fittingId ID for a fitting of this character
     * @return Fitting deleted
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFitting(int characterId, DatasourceEnum datasource, int fittingId) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/fittings/{fitting_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("fitting_id", String.valueOf(fittingId));
        String body = null;
        String method = "DELETE";
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
