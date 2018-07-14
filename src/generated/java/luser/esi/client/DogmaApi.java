package luser.esi.client;

import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class DogmaApi {
    private ApiClient apiClient;
    DogmaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Get a list of dogma attribute ids
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of dogma attribute ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getDogmaAttributes(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/dogma/attributes/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        ResponseParser<IntArrayList> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, IntArrayList.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Get information on a dogma attribute
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param attributeId A dogma attribute ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about a dogma attribute
     */
    
    public CompletableFuture<EsiResponseWrapper<DogmaAttributeInfo>> getDogmaAttributesAttributeId(int attributeId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/dogma/attributes/{attribute_id}/";
        
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
        parametersInUrl.put("attribute_id", String.valueOf(attributeId));
        String body = null;
        String method = "GET";
        ResponseParser<DogmaAttributeInfo> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, DogmaAttributeInfo.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Returns info about a dynamic item resulting from mutation with a mutaplasmid.
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param itemId item_id integer
     * @param typeId type_id integer
     * @return Details about a dynamic item
     */
    
    public CompletableFuture<EsiResponseWrapper<DogmaDynamicItemInfo>> getDogmaDynamicItemsTypeIdItemId(DatasourceEnum datasource, String ifNoneMatch, long itemId, int typeId) {
        String url = "https://esi.evetech.net/v1/dogma/dynamic/items/{type_id}/{item_id}/";
        
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
        parametersInUrl.put("item_id", String.valueOf(itemId));
        parametersInUrl.put("type_id", String.valueOf(typeId));
        String body = null;
        String method = "GET";
        ResponseParser<DogmaDynamicItemInfo> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, DogmaDynamicItemInfo.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Get a list of dogma effect ids
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of dogma effect ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getDogmaEffects(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/dogma/effects/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        ResponseParser<IntArrayList> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, IntArrayList.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Get information on a dogma effect
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param effectId A dogma effect ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about a dogma effect
     */
    
    public CompletableFuture<EsiResponseWrapper<DogmaEffectIfno>> getDogmaEffectsEffectId(DatasourceEnum datasource, int effectId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/dogma/effects/{effect_id}/";
        
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
        parametersInUrl.put("effect_id", String.valueOf(effectId));
        String body = null;
        String method = "GET";
        ResponseParser<DogmaEffectIfno> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, DogmaEffectIfno.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
