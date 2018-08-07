package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import java.util.concurrent.CompletableFuture;

public interface ContactsApi {
    public ApiClient getApiClient();
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
    
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getAllianceContactLabels(int allianceId, String ifNoneMatch);
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
    
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getCharacterContactLabels(int characterId, String ifNoneMatch);
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
    
    public CompletableFuture<EsiResponseWrapper<List<ContactLabel>>> getCorporationContactLabels(int corporationId, String ifNoneMatch);
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
    
    public CompletableFuture<EsiResponseWrapper<List<AllianceContact>>> getAllianceContacts(int allianceId, String ifNoneMatch, Integer page);
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
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteCharacterContacts(int characterId, IntArrayList contactIds);
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
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterContact>>> getCharacterIdContacts(int characterId, String ifNoneMatch, Integer page);
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
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> createContacts(int characterId, IntArrayList contactIds, LongArrayList labelIds, double standing, Boolean watched);
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
    
    public CompletableFuture<EsiResponseWrapper<Void>> editContacts(int characterId, IntArrayList contactIds, LongArrayList labelIds, double standing, Boolean watched);
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
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationContact>>> getCorporationContacts(int corporationId, String ifNoneMatch, Integer page);
}
