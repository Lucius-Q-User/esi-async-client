package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class RoutesApi {
    private ApiClient apiClient;
    RoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Get the systems between origin and destination
     * 
     * ---
     * 
     * This route is cached for up to 86400 seconds
     * @param avoid avoid solar system ID(s)
     * @param connections connected solar system pairs
     * @param datasource The server name you would like data from
     * @param destination destination solar system ID
     * @param flag route security preference
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param origin origin solar system ID
     * @return Solar systems in route from origin to destination
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getRoute(IntArrayList avoid, List<IntArrayList> connections, DatasourceEnum datasource, int destination, FlagEnum flag, String ifNoneMatch, int origin) {
        String url = "https://esi.evetech.net/v1/route/{origin}/{destination}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(4);
        
        if (avoid != null) {
            String val = ApiClientBase.renderArrayToQuery(avoid, null);
            parametersInQuery.put("avoid", val);
        }
        
        if (connections != null) {
            String val = ApiClientBase.renderArrayToQuery(connections, null);
            parametersInQuery.put("connections", val);
        }
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (flag != null) {
            String val = flag.stringValue;
            parametersInQuery.put("flag", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("destination", String.valueOf(destination));
        parametersInUrl.put("origin", String.valueOf(origin));
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
