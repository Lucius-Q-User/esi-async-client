package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class MailApiImpl implements MailApi {
    private ApiClient apiClient;
    MailApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<MailboxEntry>>> getMailbox(int characterId, String ifNoneMatch, IntArrayList labels, Integer lastMailId) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/mail/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (labels != null) {
            String val = ApiClientBase.renderArrayToQuery(labels, null);
            builder.addQueryParam("labels", val);
        }
        
        if (lastMailId != null) {
            String val = String.valueOf(lastMailId);
            builder.addQueryParam("last_mail_id", val);
        }
        TypeReference<List<MailboxEntry>> responseTypeRef = new TypeReference<List<MailboxEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Integer>> sendMail(int characterId, NewMail mail) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/mail/";
        RequestBuilder builder = Dsl.post(url);

        builder.setBody(ApiClientBase.renderToBody(mail));
        TypeReference<Integer> responseTypeRef = new TypeReference<Integer>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> deleteMailLabel(int characterId, int labelId) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/mail/labels/" + labelId + "/";
        RequestBuilder builder = Dsl.delete(url);

        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<MailingList>>> getMailLists(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/mail/lists/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<MailingList>> responseTypeRef = new TypeReference<List<MailingList>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> deleteMail(int characterId, int mailId) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/mail/" + mailId + "/";
        RequestBuilder builder = Dsl.delete(url);

        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<MailContents>> getMailContents(int characterId, String ifNoneMatch, int mailId) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/mail/" + mailId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<MailContents> responseTypeRef = new TypeReference<MailContents>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> updateMailMetadata(int characterId, NewMailContents contents, int mailId) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/mail/" + mailId + "/";
        RequestBuilder builder = Dsl.put(url);

        builder.setBody(ApiClientBase.renderToBody(contents));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Integer>> createMailLabel(int characterId, NewMailLabel label) {         
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/mail/labels/";
        RequestBuilder builder = Dsl.post(url);

        builder.setBody(ApiClientBase.renderToBody(label));
        TypeReference<Integer> responseTypeRef = new TypeReference<Integer>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<MailLabels>> getMailLabels(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v3/characters/" + characterId + "/mail/labels/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<MailLabels> responseTypeRef = new TypeReference<MailLabels>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
