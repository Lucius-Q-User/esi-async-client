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
public class IncursionsApi {
    private ApiClient apiClient;
    IncursionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Return a list of current incursions
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of incursions
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ActiveIncursions>>> getIncursions(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/incursions/";
        
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
        ResponseParser<List<ActiveIncursions>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<ActiveIncursions>>() {});
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
