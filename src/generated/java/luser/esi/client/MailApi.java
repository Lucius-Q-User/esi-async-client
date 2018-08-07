package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface MailApi {
    public ApiClient getApiClient();
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
    
    public CompletableFuture<EsiResponseWrapper<List<MailboxEntry>>> getMailbox(int characterId, DatasourceEnum datasource, String ifNoneMatch, IntArrayList labels, Integer lastMailId);
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
    
    public CompletableFuture<EsiResponseWrapper<Integer>> sendMail(int characterId, DatasourceEnum datasource, NewMail mail);
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
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteMailLabel(int characterId, DatasourceEnum datasource, int labelId);
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
    
    public CompletableFuture<EsiResponseWrapper<List<MailingList>>> getMailLists(int characterId, DatasourceEnum datasource, String ifNoneMatch);
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
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteMail(int characterId, DatasourceEnum datasource, int mailId);
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
    
    public CompletableFuture<EsiResponseWrapper<MailContents>> getMailContents(int characterId, DatasourceEnum datasource, String ifNoneMatch, int mailId);
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
    
    public CompletableFuture<EsiResponseWrapper<Void>> updateMailMetadata(int characterId, NewMailContents contents, DatasourceEnum datasource, int mailId);
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
    
    public CompletableFuture<EsiResponseWrapper<Integer>> createMailLabel(int characterId, DatasourceEnum datasource, NewMailLabel label);
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
    
    public CompletableFuture<EsiResponseWrapper<MailLabels>> getMailLabels(int characterId, DatasourceEnum datasource, String ifNoneMatch);
}
