package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class IndustryApi {
    private ApiClient apiClient;
    IndustryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<IndustryJobInfo>>> getCharactersCharacterIdIndustryJobs(int characterId, DatasourceEnum datasource, String ifNoneMatch, Boolean includeCompleted) {
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
        Function<String, List<IndustryJobInfo>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<IndustryJobInfo> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(IndustryJobInfo.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterMiningLedgerEntry>>> getCharactersCharacterIdMining(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
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
        Function<String, List<CharacterMiningLedgerEntry>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<CharacterMiningLedgerEntry> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(CharacterMiningLedgerEntry.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<ActiveMoonExtraction>>> getCorporationCorporationIdMiningExtractions(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
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
        Function<String, List<ActiveMoonExtraction>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<ActiveMoonExtraction> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(ActiveMoonExtraction.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<MiningObservers>>> getCorporationCorporationIdMiningObservers(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
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
        Function<String, List<MiningObservers>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<MiningObservers> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(MiningObservers.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<MiningObserverInfo>>> getCorporationCorporationIdMiningObserversObserverId(int corporationId, DatasourceEnum datasource, String ifNoneMatch, long observerId, Integer page) {
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
        Function<String, List<MiningObserverInfo>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<MiningObserverInfo> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(MiningObserverInfo.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<IndustryJobInfo>>> getCorporationsCorporationIdIndustryJobs(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Boolean includeCompleted, Integer page) {
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
        Function<String, List<IndustryJobInfo>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<IndustryJobInfo> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(IndustryJobInfo.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
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
        Function<String, List<IndustryFacilities>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<IndustryFacilities> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(IndustryFacilities.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
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
        Function<String, List<IndustrySystems>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<IndustrySystems> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(IndustrySystems.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
