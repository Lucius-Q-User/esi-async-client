package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class FleetsApi {
    private ApiClient apiClient;
    FleetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Return the fleet ID the character is in, if any.
     * 
     * ---
     * 
     * This route is cached for up to 60 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Details about the character's fleet
     */
    
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
    /**
     * Return details about a fleet
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Details about a fleet
     */
    
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
    /**
     * Update settings about a fleet
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param newSettings What to update for this fleet
     * @return Fleet updated
     */
    
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
    /**
     * Return information about fleet members
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of fleet members
     */
    
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
    /**
     * Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param invitation Details of the invitation
     * @return Fleet invitation sent
     */
    
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
    /**
     * Kick a fleet member
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param memberId The character ID of a member in this fleet
     * @return Fleet member kicked
     */
    
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
    /**
     * Move a fleet member around
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param memberId The character ID of a member in this fleet
     * @param movement Details of the invitation
     * @return Fleet invitation sent
     */
    
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
    /**
     * Delete a fleet squad, only empty squads can be deleted
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param squadId The squad to delete
     * @return Squad deleted
     */
    
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
    /**
     * Rename a fleet squad
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param naming New name of the squad
     * @param squadId The squad to rename
     * @return Squad renamed
     */
    
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
    /**
     * Return information about wings in a fleet
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of fleet wings
     */
    
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
    /**
     * Create a new wing in a fleet
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @return Wing created
     */
    
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
    /**
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param wingId The wing to delete
     * @return Wing deleted
     */
    
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
    /**
     * Rename a fleet wing
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param naming New name of the wing
     * @param wingId The wing to rename
     * @return Wing renamed
     */
    
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
    /**
     * Create a new squad in a fleet
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param wingId The wing_id to create squad in
     * @return Squad created
     */
    
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
