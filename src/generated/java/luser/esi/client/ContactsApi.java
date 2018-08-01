package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class ContactsApi {
    private ApiClient apiClient;
    ContactsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Return custom labels for an alliance's contacts
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param allianceId An EVE alliance ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of alliance contact labels
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getAllianceContactLabels(int allianceId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/alliances/{alliance_id}/contacts/labels/";
        
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
        parametersInUrl.put("alliance_id", String.valueOf(allianceId));
        String body = null;
        String method = "GET";
        TypeReference<List<ContactLabel>> responseTypeRef = new TypeReference<List<ContactLabel>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return custom labels for a character's contacts
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of contact labels
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getCharacterContactLabels(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/contacts/labels/";
        
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
        TypeReference<List<ContactLabel>> responseTypeRef = new TypeReference<List<ContactLabel>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return custom labels for a corporation's contacts
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of corporation contact labels
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getCorporationContactLabels(int corporationId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/contacts/labels/";
        
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
        TypeReference<List<ContactLabel>> responseTypeRef = new TypeReference<List<ContactLabel>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return contacts of an alliance
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param allianceId An EVE alliance ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of contacts
     */
    
    public CompletableFuture<EsiResponseWrapper<List<AllianceContact>>> getAllianceContacts(int allianceId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/alliances/{alliance_id}/contacts/";
        
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
        parametersInUrl.put("alliance_id", String.valueOf(allianceId));
        String body = null;
        String method = "GET";
        TypeReference<List<AllianceContact>> responseTypeRef = new TypeReference<List<AllianceContact>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Bulk delete contacts
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param contactIds A list of contacts to delete
     * @param datasource The server name you would like data from
     * @return Contacts deleted
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteCharacterContacts(int characterId, IntArrayList contactIds, DatasourceEnum datasource) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/contacts/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (contactIds != null) {
            String val = ApiClientBase.renderArrayToQuery(contactIds, null);
            parametersInQuery.put("contact_ids", val);
        }
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "DELETE";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return contacts of a character
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of contacts
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterContact>>> getCharacterIdContacts(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/contacts/";
        
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
        TypeReference<List<CharacterContact>> responseTypeRef = new TypeReference<List<CharacterContact>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Bulk add contacts with same settings
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param contactIds A list of contacts
     * @param datasource The server name you would like data from
     * @param labelIds Add custom labels to the new contact
     * @param standing Standing for the contact
     * @param watched Whether the contact should be watched, note this is only effective on characters
     * @return A list of contact ids that successfully created
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> createContacts(int characterId, IntArrayList contactIds, DatasourceEnum datasource, LongArrayList labelIds, double standing, Boolean watched) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/contacts/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(4);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (labelIds != null) {
            String val = ApiClientBase.renderArrayToQuery(labelIds, null);
            parametersInQuery.put("label_ids", val);
        }
        
        {
            String val = String.valueOf(standing);
            parametersInQuery.put("standing", val);
        }
        
        if (watched != null) {
            String val = String.valueOf(watched);
            parametersInQuery.put("watched", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        body = ApiClientBase.renderToBody(contactIds);
        String method = "POST";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Bulk edit contacts with same settings
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param contactIds A list of contacts
     * @param datasource The server name you would like data from
     * @param labelIds Add custom labels to the contact
     * @param standing Standing for the contact
     * @param watched Whether the contact should be watched, note this is only effective on characters
     * @return Contacts updated
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> editContacts(int characterId, IntArrayList contactIds, DatasourceEnum datasource, LongArrayList labelIds, double standing, Boolean watched) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/contacts/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(4);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (labelIds != null) {
            String val = ApiClientBase.renderArrayToQuery(labelIds, null);
            parametersInQuery.put("label_ids", val);
        }
        
        {
            String val = String.valueOf(standing);
            parametersInQuery.put("standing", val);
        }
        
        if (watched != null) {
            String val = String.valueOf(watched);
            parametersInQuery.put("watched", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        body = ApiClientBase.renderToBody(contactIds);
        String method = "PUT";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return contacts of a corporation
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of contacts
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationContact>>> getCorporationContacts(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/corporations/{corporation_id}/contacts/";
        
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
        TypeReference<List<CorporationContact>> responseTypeRef = new TypeReference<List<CorporationContact>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
