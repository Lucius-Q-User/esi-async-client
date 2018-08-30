package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface WarsApi {
    public ApiClient getApiClient();
    
    /**
     * Return a list of wars
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param maxWarId Only return wars with ID smaller than this
     * @return A list of war IDs, in descending order by war_id
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getWars(String ifNoneMatch, Integer maxWarId);
    /**
     * Return details about a war
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param warId ID for a war
     * @return Details about a war
     */
    
    public CompletableFuture<EsiResponseWrapper<WarInfo>> getWarInfo(String ifNoneMatch, int warId);
    /**
     * Return a list of kills related to a war
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @param warId A valid war ID
     * @return A list of killmail IDs and hashes
     */
    
    public CompletableFuture<EsiResponseWrapper<List<KillmailRef>>> getWarKillmails(String ifNoneMatch, Integer page, int warId);
    
    public CompletableFuture<List<KillmailRef>> getWarKillmailsAllPages(int warId);
}
