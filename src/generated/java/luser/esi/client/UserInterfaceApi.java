package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;

@SuppressWarnings("unused")
public class UserInterfaceApi {
    private ApiClient apiClient;
    UserInterfaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Open the contract window inside the client
     * 
     * ---
     * 
     * @param contractId The contract to open
     * @param datasource The server name you would like data from
     * @return Open window request received
     */
    
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
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Open the information window for a character, corporation or alliance inside the client
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param targetId The target to open
     * @return Open window request received
     */
    
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
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Open the market details window for a specific typeID inside the client
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param typeId The item type to open in market window
     * @return Open window request received
     */
    
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
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Open the New Mail window, according to settings from the request if applicable
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param newMail The details of mail to create
     * @return Open window request received
     */
    
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
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Set a solar system as autopilot waypoint
     * 
     * ---
     * 
     * @param addToBeginning Whether this solar system should be added to the beginning of all waypoints
     * @param clearOtherWaypoints Whether clean other waypoints beforing adding this one
     * @param datasource The server name you would like data from
     * @param destinationId The destination to travel to, can be solar system, station or structure's id
     * @return Open window request received
     */
    
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
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
