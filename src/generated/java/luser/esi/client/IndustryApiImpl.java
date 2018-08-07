package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class IndustryApiImpl implements IndustryApi {
    private ApiClient apiClient;
    IndustryApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<IndustryJobInfo>>> getIndustryJobs(int characterId, String ifNoneMatch, Boolean includeCompleted) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/industry/jobs/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (includeCompleted != null) {
            String val = String.valueOf(includeCompleted);
            builder.addQueryParam("include_completed", val);
        }
        TypeReference<List<IndustryJobInfo>> responseTypeRef = new TypeReference<List<IndustryJobInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterMiningLedgerEntry>>> getMining(int characterId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/mining/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CharacterMiningLedgerEntry>> responseTypeRef = new TypeReference<List<CharacterMiningLedgerEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ActiveMoonExtraction>>> getMiningExtractions(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporation/" + corporationId + "/mining/extractions/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<ActiveMoonExtraction>> responseTypeRef = new TypeReference<List<ActiveMoonExtraction>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<MiningObservers>>> getMiningObservers(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporation/" + corporationId + "/mining/observers/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<MiningObservers>> responseTypeRef = new TypeReference<List<MiningObservers>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<MiningObserverInfo>>> getMiningObserverInfo(int corporationId, String ifNoneMatch, long observerId, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporation/" + corporationId + "/mining/observers/" + observerId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<MiningObserverInfo>> responseTypeRef = new TypeReference<List<MiningObserverInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<IndustryJobInfo>>> getIndustryJobs(int corporationId, String ifNoneMatch, Boolean includeCompleted, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/industry/jobs/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (includeCompleted != null) {
            String val = String.valueOf(includeCompleted);
            builder.addQueryParam("include_completed", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<IndustryJobInfo>> responseTypeRef = new TypeReference<List<IndustryJobInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<IndustryFacilities>>> getIndustryFacilities(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/industry/facilities/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<IndustryFacilities>> responseTypeRef = new TypeReference<List<IndustryFacilities>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<IndustrySystems>>> getIndustrySystems(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/industry/systems/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<IndustrySystems>> responseTypeRef = new TypeReference<List<IndustrySystems>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
