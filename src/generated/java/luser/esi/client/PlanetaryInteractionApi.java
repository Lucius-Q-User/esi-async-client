package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface PlanetaryInteractionApi {
    public ApiClient getApiClient();
    /**
     * Returns a list of all planetary colonies owned by a character.
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of colonies
     */
    
    public CompletableFuture<EsiResponseWrapper<List<PlanetInfo>>> getPlanets(int characterId, String ifNoneMatch);
    /**
     * List customs offices owned by a corporation
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of customs offices and their settings
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationCustomsOffice>>> getCustomsOffices(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Get information on a planetary factory schematic
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param schematicId A PI schematic ID
     * @return Public data about a schematic
     */
    
    public CompletableFuture<EsiResponseWrapper<SchematicInfo>> getSchematicInfo(String ifNoneMatch, int schematicId);
    /**
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param planetId Planet id of the target planet
     * @return Colony layout
     */
    
    public CompletableFuture<EsiResponseWrapper<PlanetContents>> getPlanetInfo(int characterId, String ifNoneMatch, int planetId);
}
