package luser.esi.client;


import java.util.concurrent.CompletableFuture;

public interface LocationApi {
    public ApiClient getApiClient();
    
    /**
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.
     */
    
    public CompletableFuture<EsiResponseWrapper<CurrentLocation>> getLocation(int characterId, String ifNoneMatch);
    /**
     * Get the current ship type, name and id
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Get the current ship type, name and id
     */
    
    public CompletableFuture<EsiResponseWrapper<ActiveShip>> getShip(int characterId, String ifNoneMatch);
    /**
     * Checks if the character is currently online
     * 
     * ---
     * 
     * This route is cached for up to 60 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Object describing the character's online status
     */
    
    public CompletableFuture<EsiResponseWrapper<OnlineInfo>> getOnline(int characterId, String ifNoneMatch);
}
