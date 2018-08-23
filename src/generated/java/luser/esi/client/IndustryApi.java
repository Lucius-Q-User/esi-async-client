package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IndustryApi {
    public ApiClient getApiClient();
    
    /**
     * List industry jobs placed by a character
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param includeCompleted Whether to retrieve completed character industry jobs. Only includes jobs from the past 90 days.
     * @return Industry jobs placed by a character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<IndustryJobInfo>>> getIndustryJobs(int characterId, String ifNoneMatch, Boolean includeCompleted);
    /**
     * Paginated record of all mining done by a character for the past 30 days
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Mining ledger of a character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterMiningLedgerEntry>>> getMining(int characterId, String ifNoneMatch, Integer page);
    /**
     * Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.
     * 
     * ---
     * 
     * This route is cached for up to 1800 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Structure_manager
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of chunk timers
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ActiveMoonExtraction>>> getMiningExtractions(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Paginated list of all entities capable of observing and recording mining for a corporation
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Observer list of a corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MiningObservers>>> getMiningObservers(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Paginated record of all mining seen by an observer
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param observerId A mining observer id
     * @param page Which page of results to return
     * @return Mining ledger of an observer
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MiningObserverInfo>>> getMiningObserverInfo(int corporationId, String ifNoneMatch, long observerId, Integer page);
    /**
     * List industry jobs run by a corporation
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): FactoryManager
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param includeCompleted Whether to retrieve completed corporation industry jobs. Only includes jobs from the past 90 days.
     * @param page Which page of results to return
     * @return A list of corporation industry jobs
     */
    
    public CompletableFuture<EsiResponseWrapper<List<IndustryJobInfo>>> getIndustryJobs(int corporationId, String ifNoneMatch, Boolean includeCompleted, Integer page);
    /**
     * Return a list of industry facilities
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of facilities
     */
    
    public CompletableFuture<EsiResponseWrapper<List<IndustryFacilities>>> getIndustryFacilities(String ifNoneMatch);
    /**
     * Return cost indices for solar systems
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of cost indicies
     */
    
    public CompletableFuture<EsiResponseWrapper<List<IndustrySystems>>> getIndustrySystems(String ifNoneMatch);
    
    public CompletableFuture<List<CharacterMiningLedgerEntry>> getMiningAllPages(int characterId);
    
    public CompletableFuture<List<ActiveMoonExtraction>> getMiningExtractionsAllPages(int corporationId);
    
    public CompletableFuture<List<MiningObservers>> getMiningObserversAllPages(int corporationId);
    
    public CompletableFuture<List<MiningObserverInfo>> getMiningObserverInfoAllPages(int corporationId, long observerId);
    
    public CompletableFuture<List<IndustryJobInfo>> getIndustryJobsAllPages(int corporationId, Boolean includeCompleted);
}
