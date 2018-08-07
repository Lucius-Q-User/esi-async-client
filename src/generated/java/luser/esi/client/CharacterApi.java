package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface CharacterApi {
    public ApiClient getApiClient();
    /**
     * Bulk lookup of character IDs to corporation, alliance and faction
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characters The character IDs to fetch affiliations for. All characters must exist, or none will be returned.
     * @param datasource The server name you would like data from
     * @return Character corporation, alliance and faction IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedCharacterAffiliation>>> resolveCharacterAffiliations(IntArrayList characters);
    /**
     * Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints = remainderPoints + pointsPerDay * days(currentTime - researchStartDate)
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of agents research information
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ResearchAgentInfo>>> getAgentsResearch(int characterId, String ifNoneMatch);
    /**
     * Get a list of all the corporations a character has been a member of
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Corporation history for the given character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationHistoryEntry>>> getCorpHistory(int characterId, String ifNoneMatch);
    /**
     * Return a character's jump activation and fatigue information
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Jump activation and fatigue information
     */
    
    public CompletableFuture<EsiResponseWrapper<JumpAidsInfo>> getJumpAids(int characterId, String ifNoneMatch);
    /**
     * Return a list of medals the character has
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of medals
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterMedal>>> getMedals(int characterId, String ifNoneMatch);
    /**
     * Return notifications about having been added to someone's contact list
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of contact notifications
     */
    
    public CompletableFuture<EsiResponseWrapper<List<NewContactNotification>>> getContactNotifications(int characterId, String ifNoneMatch);
    /**
     * Return character standings from agents, NPC corporations, and factions
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of standings
     */
    
    public CompletableFuture<EsiResponseWrapper<List<StandingsEntry>>> getStandings(int characterId, String ifNoneMatch);
    /**
     * Returns a character's titles
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of titles
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterTitles>>> getTitles(int characterId, String ifNoneMatch);
    /**
     * Return a list of blueprints the character owns
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of blueprints
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterBlueprint>>> getBlueprints(int characterId, String ifNoneMatch, Integer page);
    /**
     * Return character notifications
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Returns your recent notifications
     */
    
    public CompletableFuture<EsiResponseWrapper<List<NotificationInfo>>> getNotifications(int characterId, String ifNoneMatch);
    /**
     * Get portrait urls for a character
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Public data for the given character
     */
    
    public CompletableFuture<EsiResponseWrapper<CharacterPortrait>> getPortrait(int characterId, String ifNoneMatch);
    /**
     * Returns a character's corporation roles
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return The character's roles in thier corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<CharacterRoles>> getRoles(int characterId, String ifNoneMatch);
    /**
     * Returns aggregate yearly stats for a character
     * 
     * ---
     * 
     * This route is cached for up to 86400 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Character stats
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterStats>>> getStats(int characterId, String ifNoneMatch);
    /**
     * Public information about a character
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Public data for the given character
     */
    
    public CompletableFuture<EsiResponseWrapper<CharacterInfo>> getCharacterInfo(int characterId, String ifNoneMatch);
    /**
     * Takes a source character ID in the url and a set of target character ID's in the body, returns a CSPA charge cost
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param characters The target characters to calculate the charge for
     * @param datasource The server name you would like data from
     * @return Aggregate cost of sending a mail from the source character to the target characters, in ISK
     */
    
    public CompletableFuture<EsiResponseWrapper<Float>> resolveCSPACost(int characterId, IntArrayList characters);
}
