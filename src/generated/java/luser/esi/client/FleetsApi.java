package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface FleetsApi {
    public ApiClient getApiClient();
    /**
     * Return the fleet ID the character is in, if any.
     * 
     * ---
     * 
     * This route is cached for up to 60 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Details about the character's fleet
     */
    
    public CompletableFuture<EsiResponseWrapper<ActiveFleetInfo>> getFleet(int characterId, String ifNoneMatch);
    /**
     * Return details about a fleet
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Details about a fleet
     */
    
    public CompletableFuture<EsiResponseWrapper<FleetInfo>> getFleetInfo(long fleetId, String ifNoneMatch);
    /**
     * Update settings about a fleet
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param newSettings What to update for this fleet
     * @return Fleet updated
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> updateFleet(long fleetId, NewFleetSettings newSettings);
    /**
     * Return information about fleet members
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of fleet members
     */
    
    public CompletableFuture<EsiResponseWrapper<List<FleetMemberList>>> getMembers(AcceptLanguageEnum acceptLanguage, long fleetId, String ifNoneMatch);
    /**
     * Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param invitation Details of the invitation
     * @return Fleet invitation sent
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> inviteFleetMember(long fleetId, FleetInvitation invitation);
    /**
     * Kick a fleet member
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param memberId The character ID of a member in this fleet
     * @return Fleet member kicked
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> kickFleetMember(long fleetId, int memberId);
    /**
     * Move a fleet member around
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param memberId The character ID of a member in this fleet
     * @param movement Details of the invitation
     * @return Fleet invitation sent
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> moveFleetMember(long fleetId, int memberId, FleetMovementRequest movement);
    /**
     * Delete a fleet squad, only empty squads can be deleted
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param squadId The squad to delete
     * @return Squad deleted
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetSquad(long fleetId, long squadId);
    /**
     * Rename a fleet squad
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param naming New name of the squad
     * @param squadId The squad to rename
     * @return Squad renamed
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> renameFleetSquad(long fleetId, FleetUnitName naming, long squadId);
    /**
     * Return information about wings in a fleet
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of fleet wings
     */
    
    public CompletableFuture<EsiResponseWrapper<List<FleetWings>>> getWings(AcceptLanguageEnum acceptLanguage, long fleetId, String ifNoneMatch);
    /**
     * Create a new wing in a fleet
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @return Wing created
     */
    
    public CompletableFuture<EsiResponseWrapper<CreatedWingResponse>> createFleetWing(long fleetId);
    /**
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param wingId The wing to delete
     * @return Wing deleted
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFleetWing(long fleetId, long wingId);
    /**
     * Rename a fleet wing
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param naming New name of the wing
     * @param wingId The wing to rename
     * @return Wing renamed
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> renameFleetWing(long fleetId, FleetUnitName naming, long wingId);
    /**
     * Create a new squad in a fleet
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param fleetId ID for a fleet
     * @param wingId The wing_id to create squad in
     * @return Squad created
     */
    
    public CompletableFuture<EsiResponseWrapper<CreatedSquadResponse>> createFleetSquad(long fleetId, long wingId);
}
