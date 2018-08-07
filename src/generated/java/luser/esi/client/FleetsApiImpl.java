package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

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
    public CompletableFuture<EsiResponseWrapper<ActiveFleetInfo>> getFleet(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/fleet/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        TypeReference<ActiveFleetInfo> responseTypeRef = new TypeReference<ActiveFleetInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<FleetInfo>> getFleetInfo(DatasourceEnum datasource, long fleetId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        String body = null;
        String method = "GET";
        TypeReference<FleetInfo> responseTypeRef = new TypeReference<FleetInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> updateFleet(DatasourceEnum datasource, long fleetId, NewFleetSettings newSettings) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        String body = null;
        body = ApiClientBase.renderToBody(newSettings);
        String method = "PUT";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<FleetMemberList>>> getMembers(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, long fleetId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/members/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(2);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            parametersInHeaders.put("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        String body = null;
        String method = "GET";
        TypeReference<List<FleetMemberList>> responseTypeRef = new TypeReference<List<FleetMemberList>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> inviteFleetMember(DatasourceEnum datasource, long fleetId, FleetInvitation invitation) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/members/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        String body = null;
        body = ApiClientBase.renderToBody(invitation);
        String method = "POST";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> kickFleetMember(DatasourceEnum datasource, long fleetId, int memberId) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/members/{member_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        parametersInUrl.put("member_id", String.valueOf(memberId));
        String body = null;
        String method = "DELETE";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> moveFleetMember(DatasourceEnum datasource, long fleetId, int memberId, FleetMovementRequest movement) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/members/{member_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        parametersInUrl.put("member_id", String.valueOf(memberId));
        String body = null;
        body = ApiClientBase.renderToBody(movement);
        String method = "PUT";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetSquad(DatasourceEnum datasource, long fleetId, long squadId) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/squads/{squad_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        parametersInUrl.put("squad_id", String.valueOf(squadId));
        String body = null;
        String method = "DELETE";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> renameFleetSquad(DatasourceEnum datasource, long fleetId, FleetUnitName naming, long squadId) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/squads/{squad_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        parametersInUrl.put("squad_id", String.valueOf(squadId));
        String body = null;
        body = ApiClientBase.renderToBody(naming);
        String method = "PUT";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<FleetWings>>> getWings(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, long fleetId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/wings/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(2);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            parametersInHeaders.put("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        String body = null;
        String method = "GET";
        TypeReference<List<FleetWings>> responseTypeRef = new TypeReference<List<FleetWings>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CreatedWingResponse>> createFleetWing(DatasourceEnum datasource, long fleetId) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/wings/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        String body = null;
        String method = "POST";
        TypeReference<CreatedWingResponse> responseTypeRef = new TypeReference<CreatedWingResponse>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetWing(DatasourceEnum datasource, long fleetId, long wingId) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        parametersInUrl.put("wing_id", String.valueOf(wingId));
        String body = null;
        String method = "DELETE";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> renameFleetWing(DatasourceEnum datasource, long fleetId, FleetUnitName naming, long wingId) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        parametersInUrl.put("wing_id", String.valueOf(wingId));
        String body = null;
        body = ApiClientBase.renderToBody(naming);
        String method = "PUT";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CreatedSquadResponse>> createFleetSquad(DatasourceEnum datasource, long fleetId, long wingId) {
        String url = "https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/squads/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("fleet_id", String.valueOf(fleetId));
        parametersInUrl.put("wing_id", String.valueOf(wingId));
        String body = null;
        String method = "POST";
        TypeReference<CreatedSquadResponse> responseTypeRef = new TypeReference<CreatedSquadResponse>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
