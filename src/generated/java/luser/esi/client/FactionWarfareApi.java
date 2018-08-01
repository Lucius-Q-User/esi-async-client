package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class FactionWarfareApi {
    private ApiClient apiClient;
    FactionWarfareApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Statistical overview of a character involved in faction warfare
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Faction warfare statistics for a given character
     */
    
    public CompletableFuture<EsiResponseWrapper<CharacterFwStats>> getFwStats(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
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
        TypeReference<CharacterFwStats> responseTypeRef = new TypeReference<CharacterFwStats>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Statistics about a corporation involved in faction warfare
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Faction warfare statistics for a given corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<CorporationFwStatsResponse>> getCorporationFwStats(int corporationId, DatasourceEnum datasource, String ifNoneMatch) {
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
        TypeReference<CorporationFwStatsResponse> responseTypeRef = new TypeReference<CorporationFwStatsResponse>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday.
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Corporation leaderboard of kills and victory points within faction warfare.
     */
    
    public CompletableFuture<EsiResponseWrapper<FwFactionLeaderboards>> getFwFactionLeaderboards(DatasourceEnum datasource, String ifNoneMatch) {
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
        TypeReference<FwFactionLeaderboards> responseTypeRef = new TypeReference<FwFactionLeaderboards>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday.
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Character leaderboard of kills and victory points within faction warfare.
     */
    
    public CompletableFuture<EsiResponseWrapper<FwCharacterLeaderboards>> getFwCharacterLeaderboards(DatasourceEnum datasource, String ifNoneMatch) {
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
        TypeReference<FwCharacterLeaderboards> responseTypeRef = new TypeReference<FwCharacterLeaderboards>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday.
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Corporation leaderboard of kills and victory points within faction warfare.
     */
    
    public CompletableFuture<EsiResponseWrapper<FWCorporationLeaderboards>> getFwCorporationLeaderboards(DatasourceEnum datasource, String ifNoneMatch) {
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
        TypeReference<FWCorporationLeaderboards> responseTypeRef = new TypeReference<FWCorporationLeaderboards>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Statistical overviews of factions involved in faction warfare
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Per faction breakdown of faction warfare statistics
     */
    
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
        TypeReference<List<GlobalFwStats>> responseTypeRef = new TypeReference<List<GlobalFwStats>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Data about which NPC factions are at war
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of NPC factions at war
     */
    
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
        TypeReference<List<FwActiveWars>> responseTypeRef = new TypeReference<List<FwActiveWars>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * An overview of the current ownership of faction warfare solar systems
     * 
     * ---
     * 
     * This route is cached for up to 1800 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return All faction warfare solar systems
     */
    
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
        TypeReference<List<FwSystemsList>> responseTypeRef = new TypeReference<List<FwSystemsList>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
