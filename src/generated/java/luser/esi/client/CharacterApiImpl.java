package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class CharacterApiImpl implements CharacterApi {
    
    private ApiClient apiClient;
    CharacterApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedCharacterAffiliation>>> resolveCharacterAffiliations(IntArrayList characters) {
        String url = "https://esi.evetech.net/v1/characters/affiliation/";
        RequestBuilder builder = Dsl.post(url);
        builder.setBody(ApiClientBase.renderToBody(characters));
        TypeReference<List<ResolvedCharacterAffiliation>> responseTypeRef = new TypeReference<List<ResolvedCharacterAffiliation>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResearchAgentInfo>>> getAgentsResearch(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/agents_research/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<ResearchAgentInfo>> responseTypeRef = new TypeReference<List<ResearchAgentInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationHistoryEntry>>> getCorpHistory(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/corporationhistory/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CorporationHistoryEntry>> responseTypeRef = new TypeReference<List<CorporationHistoryEntry>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<JumpAidsInfo>> getJumpAids(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/fatigue/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<JumpAidsInfo> responseTypeRef = new TypeReference<JumpAidsInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterMedal>>> getMedals(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/medals/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CharacterMedal>> responseTypeRef = new TypeReference<List<CharacterMedal>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<NewContactNotification>>> getContactNotifications(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/notifications/contacts/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<NewContactNotification>> responseTypeRef = new TypeReference<List<NewContactNotification>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<StandingsEntry>>> getStandings(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/standings/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<StandingsEntry>> responseTypeRef = new TypeReference<List<StandingsEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterTitles>>> getTitles(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/titles/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CharacterTitles>> responseTypeRef = new TypeReference<List<CharacterTitles>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterBlueprint>>> getBlueprints(int characterId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/blueprints/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CharacterBlueprint>> responseTypeRef = new TypeReference<List<CharacterBlueprint>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<NotificationInfo>>> getNotifications(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/notifications/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<NotificationInfo>> responseTypeRef = new TypeReference<List<NotificationInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CharacterPortrait>> getPortrait(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/portrait/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CharacterPortrait> responseTypeRef = new TypeReference<CharacterPortrait>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CharacterRoles>> getRoles(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/roles/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CharacterRoles> responseTypeRef = new TypeReference<CharacterRoles>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterStats>>> getStats(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/stats/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CharacterStats>> responseTypeRef = new TypeReference<List<CharacterStats>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CharacterInfo>> getCharacterInfo(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v4/characters/" + characterId + "/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CharacterInfo> responseTypeRef = new TypeReference<CharacterInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Float>> resolveCSPACost(int characterId, IntArrayList characters) {
        String url = "https://esi.evetech.net/v4/characters/" + characterId + "/cspa/";
        RequestBuilder builder = Dsl.post(url);
        builder.setBody(ApiClientBase.renderToBody(characters));
        TypeReference<Float> responseTypeRef = new TypeReference<Float>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<List<CharacterBlueprint>> getBlueprintsAllPages(int characterId) {
        return ApiClientBase.pagingHelper((page) -> getBlueprints(characterId, null, page), (List<CharacterBlueprint>)null);
    }
}
