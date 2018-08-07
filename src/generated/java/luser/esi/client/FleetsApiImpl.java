package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class FleetsApiImpl implements FleetsApi {
    private ApiClient apiClient;
    FleetsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<ActiveFleetInfo>> getFleet(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/fleet/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<ActiveFleetInfo> responseTypeRef = new TypeReference<ActiveFleetInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<FleetInfo>> getFleetInfo(long fleetId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<FleetInfo> responseTypeRef = new TypeReference<FleetInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> updateFleet(long fleetId, NewFleetSettings newSettings) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/";
        RequestBuilder builder = Dsl.put(url);

        builder.setBody(ApiClientBase.renderToBody(newSettings));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<FleetMemberList>>> getMembers(AcceptLanguageEnum acceptLanguage, long fleetId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/members/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<FleetMemberList>> responseTypeRef = new TypeReference<List<FleetMemberList>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> inviteFleetMember(long fleetId, FleetInvitation invitation) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/members/";
        RequestBuilder builder = Dsl.post(url);

        builder.setBody(ApiClientBase.renderToBody(invitation));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> kickFleetMember(long fleetId, int memberId) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/members/" + memberId + "/";
        RequestBuilder builder = Dsl.delete(url);

        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> moveFleetMember(long fleetId, int memberId, FleetMovementRequest movement) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/members/" + memberId + "/";
        RequestBuilder builder = Dsl.put(url);

        builder.setBody(ApiClientBase.renderToBody(movement));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetSquad(long fleetId, long squadId) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/squads/" + squadId + "/";
        RequestBuilder builder = Dsl.delete(url);

        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> renameFleetSquad(long fleetId, FleetUnitName naming, long squadId) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/squads/" + squadId + "/";
        RequestBuilder builder = Dsl.put(url);

        builder.setBody(ApiClientBase.renderToBody(naming));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<FleetWings>>> getWings(AcceptLanguageEnum acceptLanguage, long fleetId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/wings/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<FleetWings>> responseTypeRef = new TypeReference<List<FleetWings>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CreatedWingResponse>> createFleetWing(long fleetId) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/wings/";
        RequestBuilder builder = Dsl.post(url);

        TypeReference<CreatedWingResponse> responseTypeRef = new TypeReference<CreatedWingResponse>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetWing(long fleetId, long wingId) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/wings/" + wingId + "/";
        RequestBuilder builder = Dsl.delete(url);

        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> renameFleetWing(long fleetId, FleetUnitName naming, long wingId) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/wings/" + wingId + "/";
        RequestBuilder builder = Dsl.put(url);

        builder.setBody(ApiClientBase.renderToBody(naming));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CreatedSquadResponse>> createFleetSquad(long fleetId, long wingId) {         
        String url = "https://esi.evetech.net/v1/fleets/" + fleetId + "/wings/" + wingId + "/squads/";
        RequestBuilder builder = Dsl.post(url);

        TypeReference<CreatedSquadResponse> responseTypeRef = new TypeReference<CreatedSquadResponse>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
