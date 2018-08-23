package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IncursionsApi {
    public ApiClient getApiClient();
    
    /**
     * Return a list of current incursions
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of incursions
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ActiveIncursions>>> getIncursions(String ifNoneMatch);
}
