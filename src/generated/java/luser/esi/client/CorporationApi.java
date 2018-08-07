package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface CorporationApi {
    public ApiClient getApiClient();
    /**
     * Get a list of npc corporations
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of npc corporation ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getsNpccorps(String ifNoneMatch);
    /**
     * Return corporation hangar and wallet division names, only show if a division is not using the default name
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
     * @return List of corporation division names
     */
    
    public CompletableFuture<EsiResponseWrapper<CorporationDivision>> getDivisions(int corporationId, String ifNoneMatch);
    /**
     * Return a corporation's facilities
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Factory_Manager
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of corporation facilities
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationFacility>>> getFacilities(int corporationId, String ifNoneMatch);
    /**
     * Get the icon urls for a corporation
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Urls for icons for the given corporation id and server
     */
    
    public CompletableFuture<EsiResponseWrapper<CorporationIcons>> getIcons(int corporationId, String ifNoneMatch);
    /**
     * Returns a corporation's medals
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of medals
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationMedals>>> getMedals(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Returns medals issued by a corporation
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
     * @return A list of issued medals
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationIssuedMedals>>> getIssuedMedals(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Return a corporation's member limit, not including CEO himself
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
     * @return The corporation's member limit
     */
    
    public CompletableFuture<EsiResponseWrapper<Integer>> getMemberLimit(int corporationId, String ifNoneMatch);
    /**
     * Returns a corporation's members' titles
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
     * @return A list of members and theirs titles
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationMemberTitle>>> getMemberTitles(int corporationId, String ifNoneMatch);
    /**
     * Returns additional information about a corporation's members which helps tracking their activities
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
     * @return List of member character IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MemberTrackingInfo>>> getMembertracking(int corporationId, String ifNoneMatch);
    /**
     * Return the roles of all members if the character has the personnel manager role or any grantable role.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of member character ID's and roles
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationRoles>>> getRoles(int corporationId, String ifNoneMatch);
    /**
     * Return how roles have changed for a coporation's members, up to a month
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
     * @return List of role changes
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationRolesHistoryEntry>>> getRolesHistory(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Return the current shareholders of a corporation.
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
     * @return List of shareholders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationShareholders>>> getShareholders(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Return corporation standings from agents, NPC corporations, and factions
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of standings
     */
    
    public CompletableFuture<EsiResponseWrapper<List<StandingsEntry>>> getStandings(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Returns list of corporation starbases (POSes)
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
     * @return List of starbases (POSes)
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationPOS>>> getStarbases(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Returns various settings and fuels of a starbase (POS)
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
     * @param starbaseId An EVE starbase (POS) ID
     * @param systemId The solar system this starbase (POS) is located in,
     * @return List of starbases (POSes)
     */
    
    public CompletableFuture<EsiResponseWrapper<CorporationPOSInfo>> getStarbaseInfo(int corporationId, String ifNoneMatch, long starbaseId, int systemId);
    /**
     * Returns a corporation's titles
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
     * @return A list of titles
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationTitles>>> getTitles(int corporationId, String ifNoneMatch);
    /**
     * Get a list of all the alliances a corporation has been a member of
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Alliance history for the given corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<List<AllianceHistoryEntry>>> getAlliancehistory(int corporationId, String ifNoneMatch);
    /**
     * Returns a list of blueprints the corporation owns
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
     * @return List of corporation blueprints
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationBlueprint>>> getBlueprints(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of corporation ALSC logs
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ContainerLogEntry>>> getContainerLogs(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Get a list of corporation structures. This route's version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): StationManager
     * @param acceptLanguage Language to use in the response
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of corporation structures' information
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationStructures>>> getStructures(AcceptLanguageEnum acceptLanguage, int corporationId, String ifNoneMatch, Integer page);
    /**
     * Return the current member list of a corporation, the token's character need to be a member of the corporation.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of member character IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getMembers(int corporationId, String ifNoneMatch);
    /**
     * Public information about a corporation
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Public information about a corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<CorporationInfo>> getCorporationInfo(int corporationId, String ifNoneMatch);
}
