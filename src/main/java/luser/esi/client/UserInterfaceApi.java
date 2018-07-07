package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class UserInterfaceApi {
    private ApiClient apiClient;
    UserInterfaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> postUiOpenwindowContract(int contractId, DatasourceEnum datasource) {
        String url = "https://esi.evetech.net/v1/ui/openwindow/contract/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        {
            String val = String.valueOf(contractId);
            parametersInQuery.put("contract_id", val);
        }
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "POST";
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> postUiOpenwindowInformation(DatasourceEnum datasource, int targetId) {
        String url = "https://esi.evetech.net/v1/ui/openwindow/information/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        {
            String val = String.valueOf(targetId);
            parametersInQuery.put("target_id", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "POST";
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> postUiOpenwindowMarketdetails(DatasourceEnum datasource, int typeId) {
        String url = "https://esi.evetech.net/v1/ui/openwindow/marketdetails/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        {
            String val = String.valueOf(typeId);
            parametersInQuery.put("type_id", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "POST";
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> postUiOpenwindowNewmail(DatasourceEnum datasource, NewMailOpenWindow newMail) {
        String url = "https://esi.evetech.net/v1/ui/openwindow/newmail/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        body = ApiClientBase.renderToBody(newMail);
        String method = "POST";
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> postUiAutopilotWaypoint(boolean addToBeginning, boolean clearOtherWaypoints, DatasourceEnum datasource, long destinationId) {
        String url = "https://esi.evetech.net/v2/ui/autopilot/waypoint/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(4);
        
        {
            String val = String.valueOf(addToBeginning);
            parametersInQuery.put("add_to_beginning", val);
        }
        
        {
            String val = String.valueOf(clearOtherWaypoints);
            parametersInQuery.put("clear_other_waypoints", val);
        }
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        {
            String val = String.valueOf(destinationId);
            parametersInQuery.put("destination_id", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "POST";
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
