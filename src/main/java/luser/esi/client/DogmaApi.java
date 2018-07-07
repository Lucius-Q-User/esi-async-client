package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class DogmaApi {
    private ApiClient apiClient;
    DogmaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getDogmaAttributes(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
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
        Function<String, DogmaAttributeInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return DogmaAttributeInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
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
        Function<String, DogmaDynamicItemInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return DogmaDynamicItemInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getDogmaEffects(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
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
        Function<String, DogmaEffectIfno> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return DogmaEffectIfno.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
