package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface LoyaltyApi {
    public ApiClient getApiClient();
    /**
     * Return a list of loyalty points for all corporations the character has worked for
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of loyalty points
     */
    
    public CompletableFuture<EsiResponseWrapper<List<LoyaltyPointsInfo>>> getLoyaltyPoints(int characterId, String ifNoneMatch);
    /**
     * Return a list of offers from a specific corporation's loyalty store
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of offers
     */
    
    public CompletableFuture<EsiResponseWrapper<List<LoyaltyStoreOffer>>> getLoyaltyStoreOffers(int corporationId, String ifNoneMatch);
}
