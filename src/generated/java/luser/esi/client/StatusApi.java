package luser.esi.client;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class StatusApi {
    private ApiClient apiClient;
    StatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * EVE Server status
     * 
     * ---
     * 
     * This route is cached for up to 30 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Server status
     */
    
    public CompletableFuture<EsiResponseWrapper<ServerStatus>> getStatus(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/status/";
        
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
        ResponseParser<ServerStatus> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, ServerStatus.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
