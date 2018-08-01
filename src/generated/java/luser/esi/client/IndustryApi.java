package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class IndustryApi {
    private ApiClient apiClient;
    IndustryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * List industry jobs placed by a character
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param includeCompleted Whether retrieve completed character industry jobs as well
     * @return Industry jobs placed by a character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<IndustryJobInfo>>> getIndustryJobs(int characterId, DatasourceEnum datasource, String ifNoneMatch, Boolean includeCompleted) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/industry/jobs/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (includeCompleted != null) {
            String val = String.valueOf(includeCompleted);
            parametersInQuery.put("include_completed", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        TypeReference<List<IndustryJobInfo>> responseTypeRef = new TypeReference<List<IndustryJobInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Paginated record of all mining done by a character for the past 30 days
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Mining ledger of a character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterMiningLedgerEntry>>> getMining(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/mining/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        TypeReference<List<CharacterMiningLedgerEntry>> responseTypeRef = new TypeReference<List<CharacterMiningLedgerEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.
     * 
     * ---
     * 
     * This route is cached for up to 1800 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Structure_manager
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of chunk timers
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ActiveMoonExtraction>>> getMiningExtractions(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporation/{corporation_id}/mining/extractions/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        TypeReference<List<ActiveMoonExtraction>> responseTypeRef = new TypeReference<List<ActiveMoonExtraction>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Paginated list of all entities capable of observing and recording mining for a corporation
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Observer list of a corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MiningObservers>>> getMiningObservers(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporation/{corporation_id}/mining/observers/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        TypeReference<List<MiningObservers>> responseTypeRef = new TypeReference<List<MiningObservers>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Paginated record of all mining seen by an observer
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param observerId A mining observer id
     * @param page Which page of results to return
     * @return Mining ledger of an observer
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MiningObserverInfo>>> getMiningObserverInfo(int corporationId, DatasourceEnum datasource, String ifNoneMatch, long observerId, Integer page) {
        String url = "https://esi.evetech.net/v1/corporation/{corporation_id}/mining/observers/{observer_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        parametersInUrl.put("observer_id", String.valueOf(observerId));
        String body = null;
        String method = "GET";
        TypeReference<List<MiningObserverInfo>> responseTypeRef = new TypeReference<List<MiningObserverInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * List industry jobs run by a corporation
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): FactoryManager
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param includeCompleted Whether retrieve completed industry jobs as well
     * @param page Which page of results to return
     * @return A list of corporation industry jobs
     */
    
    public CompletableFuture<EsiResponseWrapper<List<IndustryJobInfo>>> getIndustryJobs(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Boolean includeCompleted, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/industry/jobs/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(3);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (includeCompleted != null) {
            String val = String.valueOf(includeCompleted);
            parametersInQuery.put("include_completed", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        TypeReference<List<IndustryJobInfo>> responseTypeRef = new TypeReference<List<IndustryJobInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return a list of industry facilities
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of facilities
     */
    
    public CompletableFuture<EsiResponseWrapper<List<IndustryFacilities>>> getIndustryFacilities(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/industry/facilities/";
        
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
        TypeReference<List<IndustryFacilities>> responseTypeRef = new TypeReference<List<IndustryFacilities>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return cost indices for solar systems
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of cost indicies
     */
    
    public CompletableFuture<EsiResponseWrapper<List<IndustrySystems>>> getIndustrySystems(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/industry/systems/";
        
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
        TypeReference<List<IndustrySystems>> responseTypeRef = new TypeReference<List<IndustrySystems>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
