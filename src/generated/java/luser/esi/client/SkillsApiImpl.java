package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class SkillsApiImpl implements SkillsApi {
    
    private ApiClient apiClient;
    SkillsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CharacterAttributes>> getAttributes(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/attributes/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CharacterAttributes> responseTypeRef = new TypeReference<CharacterAttributes>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<SkillQueueEntry>>> getSkillqueue(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/skillqueue/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<SkillQueueEntry>> responseTypeRef = new TypeReference<List<SkillQueueEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<TrainedSkillsInfo>> getSkills(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v4/characters/" + characterId + "/skills/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<TrainedSkillsInfo> responseTypeRef = new TypeReference<TrainedSkillsInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
