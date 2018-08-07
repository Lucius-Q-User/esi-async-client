package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface SkillsApi {
    public ApiClient getApiClient();
    /**
     * Return attributes of a character
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Attributes of a character
     */
    
    public CompletableFuture<EsiResponseWrapper<CharacterAttributes>> getAttributes(int characterId, String ifNoneMatch);
    /**
     * List the configured skill queue for the given character
     * 
     * ---
     * 
     * This route is cached for up to 120 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return The current skill queue, sorted ascending by finishing time
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SkillQueueEntry>>> getSkillqueue(int characterId, String ifNoneMatch);
    /**
     * List all trained skills for the given character
     * 
     * ---
     * 
     * This route is cached for up to 120 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Known skills for the character
     */
    
    public CompletableFuture<EsiResponseWrapper<TrainedSkillsInfo>> getSkills(int characterId, String ifNoneMatch);
}
