package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

class RoutesApiImpl implements RoutesApi {
    private ApiClient apiClient;
    RoutesApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getRoute(IntArrayList avoid, List<IntArrayList> connections, int destination, FlagEnum flag, String ifNoneMatch, int origin) {
        String url = "https://esi.evetech.net/v1/route/{origin}/{destination}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(3);
        
        if (avoid != null) {
            String val = ApiClientBase.renderArrayToQuery(avoid, null);
            parametersInQuery.put("avoid", val);
        }
        
        if (connections != null) {
            String val = ApiClientBase.renderArrayToQuery(connections, null);
            parametersInQuery.put("connections", val);
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
