package luser.esi.client;

import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

class UserInterfaceApiImpl implements UserInterfaceApi {
    private ApiClient apiClient;
    UserInterfaceApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> openContract(int contractId, DatasourceEnum datasource) {
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
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> openInfoWindow(DatasourceEnum datasource, int targetId) {
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
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> openMarketWindow(DatasourceEnum datasource, int typeId) {
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
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> openMailCompose(DatasourceEnum datasource, NewMailOpenWindow newMail) {
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
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> addWaypoint(boolean addToBeginning, boolean clearOtherWaypoints, DatasourceEnum datasource, long destinationId) {
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
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
