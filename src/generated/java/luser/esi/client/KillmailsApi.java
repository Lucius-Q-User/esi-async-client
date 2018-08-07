package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface KillmailsApi {
    public ApiClient getApiClient();
    /**
     * Return a list of a character's kills and losses going back 90 days
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of killmail IDs and hashes
     */
    
    public CompletableFuture<EsiResponseWrapper<List<KillmailRef>>> getCharacterRecentKillmails(int characterId, String ifNoneMatch, Integer page);
    /**
     * Get a list of a corporation's kills and losses going back 90 days
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of killmail IDs and hashes
     */
    
    public CompletableFuture<EsiResponseWrapper<List<KillmailRef>>> getCorporationRecentKillmails(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Return a single killmail from its ID and hash
     * 
     * ---
     * 
     * This route is cached for up to 1209600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param killmailHash The killmail hash for verification
     * @param killmailId The killmail ID to be queried
     * @return A killmail
     */
    
    public CompletableFuture<EsiResponseWrapper<KillmailData>> getKillmail(String ifNoneMatch, String killmailHash, int killmailId);
}
