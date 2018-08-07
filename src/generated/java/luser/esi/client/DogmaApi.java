package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface DogmaApi {
    public ApiClient getApiClient();
    /**
     * Get a list of dogma attribute ids
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of dogma attribute ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getAttributes(String ifNoneMatch);
    /**
     * Get information on a dogma attribute
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param attributeId A dogma attribute ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about a dogma attribute
     */
    
    public CompletableFuture<EsiResponseWrapper<DogmaAttributeInfo>> getAttributeInfo(int attributeId, String ifNoneMatch);
    /**
     * Returns info about a dynamic item resulting from mutation with a mutaplasmid.
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param itemId item_id integer
     * @param typeId type_id integer
     * @return Details about a dynamic item
     */
    
    public CompletableFuture<EsiResponseWrapper<DogmaDynamicItemInfo>> getDynamicItemStats(String ifNoneMatch, long itemId, int typeId);
    /**
     * Get a list of dogma effect ids
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of dogma effect ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getEffects(String ifNoneMatch);
    /**
     * Get information on a dogma effect
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param effectId A dogma effect ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about a dogma effect
     */
    
    public CompletableFuture<EsiResponseWrapper<DogmaEffectIfno>> getEffectInfo(int effectId, String ifNoneMatch);
}
