package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;

@SuppressWarnings("unused")
public class MailApi {
    private ApiClient apiClient;
    MailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards.
     * 
     * ---
     * 
     * This route is cached for up to 30 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param labels Fetch only mails that match one or more of the given labels
     * @param lastMailId List only mail with an ID lower than the given ID, if present
     * @return The requested mail
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MailboxEntry>>> getCharactersCharacterIdMail(int characterId, DatasourceEnum datasource, String ifNoneMatch, int[] labels, Integer lastMailId) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/mail/";
        
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
        
        if (labels != null) {
            String val = ApiClientBase.renderArrayToQuery(labels, null);
            parametersInQuery.put("labels", val);
        }
        
        if (lastMailId != null) {
            String val = String.valueOf(lastMailId);
            parametersInQuery.put("last_mail_id", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        ResponseParser<List<MailboxEntry>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<MailboxEntry>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Create and send a new mail
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param mail The mail to send
     * @return Mail created
     */
    
    public CompletableFuture<EsiResponseWrapper<Integer>> postCharactersCharacterIdMail(int characterId, DatasourceEnum datasource, NewMail mail) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/mail/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        body = ApiClientBase.renderToBody(mail);
        String method = "POST";
        ResponseParser<Integer> responseParser = (resp) -> {
            return Integer.parseInt(resp);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Delete a mail label
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param labelId An EVE label id
     * @return Label deleted
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteCharactersCharacterIdMailLabelsLabelId(int characterId, DatasourceEnum datasource, int labelId) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/mail/labels/{label_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("label_id", String.valueOf(labelId));
        String body = null;
        String method = "DELETE";
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Return all mailing lists that the character is subscribed to
     * 
     * ---
     * 
     * This route is cached for up to 120 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Mailing lists
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MailingList>>> getCharactersCharacterIdMailLists(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/mail/lists/";
        
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
        ResponseParser<List<MailingList>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<MailingList>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Delete a mail
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param mailId An EVE mail ID
     * @return Mail deleted
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteCharactersCharacterIdMailMailId(int characterId, DatasourceEnum datasource, int mailId) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("mail_id", String.valueOf(mailId));
        String body = null;
        String method = "DELETE";
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Return the contents of an EVE mail
     * 
     * ---
     * 
     * This route is cached for up to 30 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param mailId An EVE mail ID
     * @return Contents of a mail
     */
    
    public CompletableFuture<EsiResponseWrapper<MailContents>> getCharactersCharacterIdMailMailId(int characterId, DatasourceEnum datasource, String ifNoneMatch, int mailId) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("mail_id", String.valueOf(mailId));
        String body = null;
        String method = "GET";
        ResponseParser<MailContents> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, MailContents.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Update metadata about a mail
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param contents Data used to update the mail
     * @param datasource The server name you would like data from
     * @param mailId An EVE mail ID
     * @return Mail updated
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> putCharactersCharacterIdMailMailId(int characterId, NewMailContents contents, DatasourceEnum datasource, int mailId) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("mail_id", String.valueOf(mailId));
        String body = null;
        body = ApiClientBase.renderToBody(contents);
        String method = "PUT";
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Create a mail label
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param label Label to create
     * @return Label created
     */
    
    public CompletableFuture<EsiResponseWrapper<Integer>> postCharactersCharacterIdMailLabels(int characterId, DatasourceEnum datasource, NewMailLabel label) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/mail/labels/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        body = ApiClientBase.renderToBody(label);
        String method = "POST";
        ResponseParser<Integer> responseParser = (resp) -> {
            return Integer.parseInt(resp);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * Return a list of the users mail labels, unread counts for each label and a total unread count.
     * 
     * ---
     * 
     * This route is cached for up to 30 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of mail labels and unread counts
     */
    
    public CompletableFuture<EsiResponseWrapper<MailLabels>> getCharactersCharacterIdMailLabels(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/mail/labels/";
        
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
        ResponseParser<MailLabels> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, MailLabels.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
