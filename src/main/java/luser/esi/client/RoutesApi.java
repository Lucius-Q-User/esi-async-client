package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class RoutesApi {
    private ApiClient apiClient;
    RoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getRouteOriginDestination(int[] avoid, List<int[]> connections, DatasourceEnum datasource, int destination, FlagEnum flag, String ifNoneMatch, int origin) {
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
}
