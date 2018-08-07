package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class CorporationApiImpl implements CorporationApi {
    private ApiClient apiClient;
    CorporationApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getsNpccorps(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/npccorps/";
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
    public CompletableFuture<EsiResponseWrapper<CorporationDivision>> getDivisions(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/divisions/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CorporationDivision> responseTypeRef = new TypeReference<CorporationDivision>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationFacility>>> getFacilities(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/facilities/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CorporationFacility>> responseTypeRef = new TypeReference<List<CorporationFacility>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CorporationIcons>> getIcons(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/icons/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CorporationIcons> responseTypeRef = new TypeReference<CorporationIcons>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationMedals>>> getMedals(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/medals/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationMedals>> responseTypeRef = new TypeReference<List<CorporationMedals>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationIssuedMedals>>> getIssuedMedals(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/medals/issued/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationIssuedMedals>> responseTypeRef = new TypeReference<List<CorporationIssuedMedals>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Integer>> getMemberLimit(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/members/limit/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<Integer> responseTypeRef = new TypeReference<Integer>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationMemberTitle>>> getMemberTitles(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/members/titles/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CorporationMemberTitle>> responseTypeRef = new TypeReference<List<CorporationMemberTitle>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<MemberTrackingInfo>>> getMembertracking(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/membertracking/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<MemberTrackingInfo>> responseTypeRef = new TypeReference<List<MemberTrackingInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationRoles>>> getRoles(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/roles/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CorporationRoles>> responseTypeRef = new TypeReference<List<CorporationRoles>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationRolesHistoryEntry>>> getRolesHistory(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/roles/history/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationRolesHistoryEntry>> responseTypeRef = new TypeReference<List<CorporationRolesHistoryEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationShareholders>>> getShareholders(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/shareholders/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationShareholders>> responseTypeRef = new TypeReference<List<CorporationShareholders>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<StandingsEntry>>> getStandings(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/standings/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<StandingsEntry>> responseTypeRef = new TypeReference<List<StandingsEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationPOS>>> getStarbases(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/starbases/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationPOS>> responseTypeRef = new TypeReference<List<CorporationPOS>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CorporationPOSInfo>> getStarbaseInfo(int corporationId, String ifNoneMatch, long starbaseId, int systemId) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/starbases/" + starbaseId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        {
            String val = String.valueOf(systemId);
            builder.addQueryParam("system_id", val);
        }
        TypeReference<CorporationPOSInfo> responseTypeRef = new TypeReference<CorporationPOSInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationTitles>>> getTitles(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/titles/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CorporationTitles>> responseTypeRef = new TypeReference<List<CorporationTitles>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<AllianceHistoryEntry>>> getAlliancehistory(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v2/corporations/" + corporationId + "/alliancehistory/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<AllianceHistoryEntry>> responseTypeRef = new TypeReference<List<AllianceHistoryEntry>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationBlueprint>>> getBlueprints(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v2/corporations/" + corporationId + "/blueprints/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationBlueprint>> responseTypeRef = new TypeReference<List<CorporationBlueprint>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContainerLogEntry>>> getContainerLogs(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v2/corporations/" + corporationId + "/containers/logs/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<ContainerLogEntry>> responseTypeRef = new TypeReference<List<ContainerLogEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationStructures>>> getStructures(AcceptLanguageEnum acceptLanguage, int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v2/corporations/" + corporationId + "/structures/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationStructures>> responseTypeRef = new TypeReference<List<CorporationStructures>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getMembers(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v3/corporations/" + corporationId + "/members/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CorporationInfo>> getCorporationInfo(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v4/corporations/" + corporationId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CorporationInfo> responseTypeRef = new TypeReference<CorporationInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
