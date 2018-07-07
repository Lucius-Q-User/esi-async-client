package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class FactionWarfareApi {
    private ApiClient apiClient;
    FactionWarfareApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<CharacterFwStats>> getCharactersCharacterIdFwStats(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/fw/stats/";
        
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
        Function<String, CharacterFwStats> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return CharacterFwStats.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<CorporationFwStatsResponse>> getCorporationsCorporationIdFwStats(int corporationId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/fw/stats/";
        
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
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        Function<String, CorporationFwStatsResponse> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return CorporationFwStatsResponse.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<FwFactionLeaderboards>> getFwLeaderboards(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/fw/leaderboards/";
        
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
        Function<String, FwFactionLeaderboards> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return FwFactionLeaderboards.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<FwCharacterLeaderboards>> getFwLeaderboardsCharacters(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/fw/leaderboards/characters/";
        
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
        Function<String, FwCharacterLeaderboards> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return FwCharacterLeaderboards.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<FWCorporationLeaderboards>> getFwLeaderboardsCorporations(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/fw/leaderboards/corporations/";
        
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
        Function<String, FWCorporationLeaderboards> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return FWCorporationLeaderboards.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<GlobalFwStats>>> getFwStats(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/fw/stats/";
        
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
        Function<String, List<GlobalFwStats>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<GlobalFwStats> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(GlobalFwStats.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<FwActiveWars>>> getFwWars(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/fw/wars/";
        
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
        Function<String, List<FwActiveWars>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<FwActiveWars> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(FwActiveWars.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<FwSystemsList>>> getFwSystems(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/fw/systems/";
        
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
        Function<String, List<FwSystemsList>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<FwSystemsList> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(FwSystemsList.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
