package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface SovereigntyApi {
    public ApiClient getApiClient();
    /**
     * Shows sovereignty data for campaigns.
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of sovereignty campaigns
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SovereigntyCampaign>>> getSovereigntyCampaigns(String ifNoneMatch);
    /**
     * Shows sovereignty information for solar systems
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of sovereignty information for solar systems in New Eden
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SovMap>>> getSovereigntyMap(String ifNoneMatch);
    /**
     * Shows sovereignty data for structures.
     * 
     * ---
     * 
     * This route is cached for up to 120 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of sovereignty structures
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SovStructures>>> getSovereigntyStructures(String ifNoneMatch);
}
