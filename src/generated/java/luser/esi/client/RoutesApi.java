package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface RoutesApi {
    public ApiClient getApiClient();
    
    /**
     * Get the systems between origin and destination
     * 
     * ---
     * 
     * This route is cached for up to 86400 seconds
     * @param avoid avoid solar system ID(s)
     * @param connections connected solar system pairs
     * @param destination destination solar system ID
     * @param flag route security preference
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param origin origin solar system ID
     * @return Solar systems in route from origin to destination
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getRoute(IntArrayList avoid, List<IntArrayList> connections, int destination, FlagEnum flag, String ifNoneMatch, int origin);
}
