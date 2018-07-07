package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class FleetsApi {
    private ApiClient apiClient;
    FleetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<ActiveFleetInfo>> getCharactersCharacterIdFleet(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, ActiveFleetInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return ActiveFleetInfo.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<FleetInfo>> getFleetsFleetId(DatasourceEnum datasource, long fleetId, String ifNoneMatch) {
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
        Function<String, FleetInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return FleetInfo.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> putFleetsFleetId(DatasourceEnum datasource, long fleetId, NewFleetSettings newSettings) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<FleetMemberList>>> getFleetsFleetIdMembers(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, long fleetId, String ifNoneMatch) {
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
        Function<String, List<FleetMemberList>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<FleetMemberList> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(FleetMemberList.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> postFleetsFleetIdMembers(DatasourceEnum datasource, long fleetId, FleetInvitation invitation) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetsFleetIdMembersMemberId(DatasourceEnum datasource, long fleetId, int memberId) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> putFleetsFleetIdMembersMemberId(DatasourceEnum datasource, long fleetId, int memberId, FleetMovementRequest movement) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetsFleetIdSquadsSquadId(DatasourceEnum datasource, long fleetId, long squadId) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> putFleetsFleetIdSquadsSquadId(DatasourceEnum datasource, long fleetId, FleetUnitName naming, long squadId) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<FleetWings>>> getFleetsFleetIdWings(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, long fleetId, String ifNoneMatch) {
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
        Function<String, List<FleetWings>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<FleetWings> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(FleetWings.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<CreatedWingResponse>> postFleetsFleetIdWings(DatasourceEnum datasource, long fleetId) {
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
        Function<String, CreatedWingResponse> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return CreatedWingResponse.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetsFleetIdWingsWingId(DatasourceEnum datasource, long fleetId, long wingId) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> putFleetsFleetIdWingsWingId(DatasourceEnum datasource, long fleetId, FleetUnitName naming, long wingId) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<CreatedSquadResponse>> postFleetsFleetIdWingsWingIdSquads(DatasourceEnum datasource, long fleetId, long wingId) {
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
        Function<String, CreatedSquadResponse> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return CreatedSquadResponse.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
