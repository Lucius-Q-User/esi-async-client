package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class ContactsApiImpl implements ContactsApi {
    private ApiClient apiClient;
    ContactsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getAllianceContactLabels(int allianceId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/alliances/" + allianceId + "/contacts/labels/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<ContactLabel>> responseTypeRef = new TypeReference<List<ContactLabel>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getCharacterContactLabels(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/contacts/labels/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<ContactLabel>> responseTypeRef = new TypeReference<List<ContactLabel>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getCorporationContactLabels(int corporationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/contacts/labels/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<ContactLabel>> responseTypeRef = new TypeReference<List<ContactLabel>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<AllianceContact>>> getAllianceContacts(int allianceId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v2/alliances/" + allianceId + "/contacts/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<AllianceContact>> responseTypeRef = new TypeReference<List<AllianceContact>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> deleteCharacterContacts(int characterId, IntArrayList contactIds) {         
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/contacts/";
        RequestBuilder builder = Dsl.delete(url);

        
        if (contactIds != null) {
            String val = ApiClientBase.renderArrayToQuery(contactIds, null);
            builder.addQueryParam("contact_ids", val);
        }
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterContact>>> getCharacterIdContacts(int characterId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/contacts/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CharacterContact>> responseTypeRef = new TypeReference<List<CharacterContact>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> createContacts(int characterId, IntArrayList contactIds, LongArrayList labelIds, double standing, Boolean watched) {         
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/contacts/";
        RequestBuilder builder = Dsl.post(url);

        
        if (labelIds != null) {
            String val = ApiClientBase.renderArrayToQuery(labelIds, null);
            builder.addQueryParam("label_ids", val);
        }
        
        {
            String val = String.valueOf(standing);
            builder.addQueryParam("standing", val);
        }
        
        if (watched != null) {
            String val = String.valueOf(watched);
            builder.addQueryParam("watched", val);
        }
        builder.setBody(ApiClientBase.renderToBody(contactIds));
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> editContacts(int characterId, IntArrayList contactIds, LongArrayList labelIds, double standing, Boolean watched) {         
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/contacts/";
        RequestBuilder builder = Dsl.put(url);

        
        if (labelIds != null) {
            String val = ApiClientBase.renderArrayToQuery(labelIds, null);
            builder.addQueryParam("label_ids", val);
        }
        
        {
            String val = String.valueOf(standing);
            builder.addQueryParam("standing", val);
        }
        
        if (watched != null) {
            String val = String.valueOf(watched);
            builder.addQueryParam("watched", val);
        }
        builder.setBody(ApiClientBase.renderToBody(contactIds));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationContact>>> getCorporationContacts(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v2/corporations/" + corporationId + "/contacts/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationContact>> responseTypeRef = new TypeReference<List<CorporationContact>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
