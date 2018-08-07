package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class OpportunitiesApiImpl implements OpportunitiesApi {
    private ApiClient apiClient;
    OpportunitiesApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<OpportunityInfo>>> getOpportunities(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/opportunities/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<OpportunityInfo>> responseTypeRef = new TypeReference<List<OpportunityInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getOpportunityGroups(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/opportunities/groups/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<OpportunityGroup>> getOpportunityGroupInfo(AcceptLanguageEnum acceptLanguage, int groupId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/opportunities/groups/" + groupId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<OpportunityGroup> responseTypeRef = new TypeReference<OpportunityGroup>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getOpportunityTasks(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/opportunities/tasks/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<OpportunityTaks>> getOpportunityTaskInfo(String ifNoneMatch, int taskId) {         
        String url = "https://esi.evetech.net/v1/opportunities/tasks/" + taskId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<OpportunityTaks> responseTypeRef = new TypeReference<OpportunityTaks>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
