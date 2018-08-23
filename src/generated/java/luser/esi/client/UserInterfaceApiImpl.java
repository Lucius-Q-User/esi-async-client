package luser.esi.client;

import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

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
    public CompletableFuture<EsiResponseWrapper<Void>> openContract(int contractId) {
        String url = "https://esi.evetech.net/v1/ui/openwindow/contract/";
        RequestBuilder builder = Dsl.post(url);
        
        {
            String val = String.valueOf(contractId);
            builder.addQueryParam("contract_id", val);
        }
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> openInfoWindow(int targetId) {
        String url = "https://esi.evetech.net/v1/ui/openwindow/information/";
        RequestBuilder builder = Dsl.post(url);
        
        {
            String val = String.valueOf(targetId);
            builder.addQueryParam("target_id", val);
        }
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> openMarketWindow(int typeId) {
        String url = "https://esi.evetech.net/v1/ui/openwindow/marketdetails/";
        RequestBuilder builder = Dsl.post(url);
        
        {
            String val = String.valueOf(typeId);
            builder.addQueryParam("type_id", val);
        }
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> openMailCompose(NewMailOpenWindow newMail) {
        String url = "https://esi.evetech.net/v1/ui/openwindow/newmail/";
        RequestBuilder builder = Dsl.post(url);
        builder.setBody(ApiClientBase.renderToBody(newMail));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> addWaypoint(boolean addToBeginning, boolean clearOtherWaypoints, long destinationId) {
        String url = "https://esi.evetech.net/v2/ui/autopilot/waypoint/";
        RequestBuilder builder = Dsl.post(url);
        
        {
            String val = String.valueOf(addToBeginning);
            builder.addQueryParam("add_to_beginning", val);
        }
        
        {
            String val = String.valueOf(clearOtherWaypoints);
            builder.addQueryParam("clear_other_waypoints", val);
        }
        
        {
            String val = String.valueOf(destinationId);
            builder.addQueryParam("destination_id", val);
        }
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
