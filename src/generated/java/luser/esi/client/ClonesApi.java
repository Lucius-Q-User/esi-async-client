package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface ClonesApi {
    public ApiClient getApiClient();
    /**
     * Return implants on the active clone of a character
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of implant type ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getImplants(int characterId, String ifNoneMatch);
    /**
     * A list of the character's clones
     * 
     * ---
     * 
     * This route is cached for up to 120 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Clone information for the given character
     */
    
    public CompletableFuture<EsiResponseWrapper<CloneInfo>> getClones(int characterId, String ifNoneMatch);
}
