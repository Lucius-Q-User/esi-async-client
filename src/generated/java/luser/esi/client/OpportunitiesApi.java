package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface OpportunitiesApi {
    public ApiClient getApiClient();
    /**
     * Return a list of tasks finished by a character
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of opportunities task ids
     */
    
    public CompletableFuture<EsiResponseWrapper<List<OpportunityInfo>>> getOpportunities(int characterId, String ifNoneMatch);
    /**
     * Return a list of opportunities groups
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of opportunities group ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getOpportunityGroups(String ifNoneMatch);
    /**
     * Return information of an opportunities group
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param groupId ID of an opportunities group
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Details of an opportunities group
     */
    
    public CompletableFuture<EsiResponseWrapper<OpportunityGroup>> getOpportunityGroupInfo(AcceptLanguageEnum acceptLanguage, int groupId, String ifNoneMatch);
    /**
     * Return a list of opportunities tasks
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of opportunities task ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getOpportunityTasks(String ifNoneMatch);
    /**
     * Return information of an opportunities task
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param taskId ID of an opportunities task
     * @return Details of an opportunities task
     */
    
    public CompletableFuture<EsiResponseWrapper<OpportunityTaks>> getOpportunityTaskInfo(String ifNoneMatch, int taskId);
}
