package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class SovereigntyApi {
    private ApiClient apiClient;
    SovereigntyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<SovereigntyCampaign>>> getSovereigntyCampaigns(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/sovereignty/campaigns/";
        
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
        Function<String, List<SovereigntyCampaign>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<SovereigntyCampaign> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(SovereigntyCampaign.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<SovMap>>> getSovereigntyMap(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/sovereignty/map/";
        
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
        Function<String, List<SovMap>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<SovMap> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(SovMap.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<SovStructures>>> getSovereigntyStructures(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/sovereignty/structures/";
        
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
        Function<String, List<SovStructures>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<SovStructures> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(SovStructures.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
