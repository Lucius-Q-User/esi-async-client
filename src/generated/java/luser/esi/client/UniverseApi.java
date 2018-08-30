package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import java.util.concurrent.CompletableFuture;

public interface UniverseApi {
    public ApiClient getApiClient();
    
    /**
     * Get all character ancestries
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of ancestries
     */
    
    public CompletableFuture<EsiResponseWrapper<List<AncestryInfo>>> getAncestries(AcceptLanguageEnum acceptLanguage, String ifNoneMatch);
    /**
     * Get information on an asteroid belt
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param asteroidBeltId asteroid_belt_id integer
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about an asteroid belt
     */
    
    public CompletableFuture<EsiResponseWrapper<AsteroidBeltInfo>> getAsteroidBeltInfo(int asteroidBeltId, String ifNoneMatch);
    /**
     * Get a list of bloodlines
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of bloodlines
     */
    
    public CompletableFuture<EsiResponseWrapper<List<BloodlineInfo>>> getBloodlines(AcceptLanguageEnum acceptLanguage, String ifNoneMatch);
    /**
     * Get a list of item categories
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of item category ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getCategories(String ifNoneMatch);
    /**
     * Get information of an item category
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param categoryId An Eve item category ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about an item category
     */
    
    public CompletableFuture<EsiResponseWrapper<ItemCategoryInfo>> getCategoryInfo(AcceptLanguageEnum acceptLanguage, int categoryId, String ifNoneMatch);
    /**
     * Get a list of constellations
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of constellation ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getConstellations(String ifNoneMatch);
    /**
     * Get information on a constellation
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param constellationId constellation_id integer
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about a constellation
     */
    
    public CompletableFuture<EsiResponseWrapper<ConstellationInfo>> getConstellationInfo(AcceptLanguageEnum acceptLanguage, int constellationId, String ifNoneMatch);
    /**
     * Get a list of graphics
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of graphic ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getGraphics(String ifNoneMatch);
    /**
     * Get information on a graphic
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param graphicId graphic_id integer
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about a graphic
     */
    
    public CompletableFuture<EsiResponseWrapper<GhaphicInfo>> getGraphicInfo(int graphicId, String ifNoneMatch);
    /**
     * Get a list of item groups
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of item group ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getGroups(String ifNoneMatch, Integer page);
    /**
     * Get information on an item group
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param groupId An Eve item group ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about an item group
     */
    
    public CompletableFuture<EsiResponseWrapper<ItemGroupInfo>> getGroupInfo(AcceptLanguageEnum acceptLanguage, int groupId, String ifNoneMatch);
    /**
     * Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours
     * 
     * ---
     * 
     * @param acceptLanguage Language to use in the response
     * @param names The names to resolve
     * @return List of id/name associations for a set of names divided by category. Any name passed in that did not have a match will be ommitted
     */
    
    public CompletableFuture<EsiResponseWrapper<ResolvedItemId>> resolveIds(AcceptLanguageEnum acceptLanguage, List<String> names);
    /**
     * Get information on a moon
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param moonId moon_id integer
     * @return Information about a moon
     */
    
    public CompletableFuture<EsiResponseWrapper<MoonInfo>> getMoonInfo(String ifNoneMatch, int moonId);
    /**
     * Get information on a planet
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param planetId planet_id integer
     * @return Information about a planet
     */
    
    public CompletableFuture<EsiResponseWrapper<UniversePlanetInfo>> getPlanetInfo(String ifNoneMatch, int planetId);
    /**
     * Get a list of character races
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of character races
     */
    
    public CompletableFuture<EsiResponseWrapper<List<RaceInfo>>> getRaces(AcceptLanguageEnum acceptLanguage, String ifNoneMatch);
    /**
     * Get a list of regions
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of region ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getRegions(String ifNoneMatch);
    /**
     * Get information on a region
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param regionId region_id integer
     * @return Information about a region
     */
    
    public CompletableFuture<EsiResponseWrapper<RegionInfo>> getRegionInfo(AcceptLanguageEnum acceptLanguage, String ifNoneMatch, int regionId);
    /**
     * Get information on a stargate
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param stargateId stargate_id integer
     * @return Information about a stargate
     */
    
    public CompletableFuture<EsiResponseWrapper<StargateInfo>> getStargateInfo(String ifNoneMatch, int stargateId);
    /**
     * Get information on a star
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param starId star_id integer
     * @return Information about a star
     */
    
    public CompletableFuture<EsiResponseWrapper<StarInfo>> getStarInfo(String ifNoneMatch, int starId);
    /**
     * List all public structures
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of public structure IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<LongArrayList>> getStructures(String ifNoneMatch);
    /**
     * Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of systems and number of jumps
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SystemJumps>>> getSystemJumps(String ifNoneMatch);
    /**
     * Get a list of solar systems
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of solar system ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getSystems(String ifNoneMatch);
    /**
     * Get a list of type ids
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of type ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getTypes(String ifNoneMatch, Integer page);
    /**
     * Get a list of factions
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of factions
     */
    
    public CompletableFuture<EsiResponseWrapper<List<UniverseFaction>>> getFactions(AcceptLanguageEnum acceptLanguage, String ifNoneMatch);
    /**
     * Resolve a set of IDs to names and categories. Supported ID's for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types
     * 
     * ---
     * 
     * @param ids The ids to resolve
     * @return List of id/name associations for a set of ID's. All ID's must resolve to a name, or nothing will be returned
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemName>>> resolveNames(IntArrayList ids);
    /**
     * Get information on a station
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param stationId station_id integer
     * @return Information about a station
     */
    
    public CompletableFuture<EsiResponseWrapper<StationInfo>> getStationInfo(String ifNoneMatch, int stationId);
    /**
     * Returns information on requested structure if you are on the ACL. Otherwise, returns "Forbidden" for all inputs.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param structureId An Eve structure ID
     * @return Data about a structure
     */
    
    public CompletableFuture<EsiResponseWrapper<StructureInfo>> getStructureInfo(String ifNoneMatch, long structureId);
    /**
     * Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of systems and number of ship, pod and NPC kills
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SystemKills>>> getSystemKills(String ifNoneMatch);
    /**
     * Get information on a type
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param typeId An Eve item type ID
     * @return Information about a type
     */
    
    public CompletableFuture<EsiResponseWrapper<TypeInfo>> getTypeInfo(AcceptLanguageEnum acceptLanguage, String ifNoneMatch, int typeId);
    /**
     * Get information on a solar system.
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param systemId system_id integer
     * @return Information about a solar system
     */
    
    public CompletableFuture<EsiResponseWrapper<SystemInfo>> getSystemInfo(AcceptLanguageEnum acceptLanguage, String ifNoneMatch, int systemId);
    
    public CompletableFuture<IntArrayList> getGroupsAllPages();
    
    public CompletableFuture<IntArrayList> getTypesAllPages();
}
