package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface FactionWarfareApi {
    public ApiClient getApiClient();
    
    /**
     * Statistical overview of a character involved in faction warfare
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Faction warfare statistics for a given character
     */
    
    public CompletableFuture<EsiResponseWrapper<CharacterFwStats>> getFwStats(int characterId, String ifNoneMatch);
    /**
     * Statistics about a corporation involved in faction warfare
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Faction warfare statistics for a given corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<CorporationFwStatsResponse>> getCorporationFwStats(int corporationId, String ifNoneMatch);
    /**
     * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Corporation leaderboard of kills and victory points within faction warfare
     */
    
    public CompletableFuture<EsiResponseWrapper<FwFactionLeaderboards>> getFwFactionLeaderboards(String ifNoneMatch);
    /**
     * Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Character leaderboard of kills and victory points within faction warfare
     */
    
    public CompletableFuture<EsiResponseWrapper<FwCharacterLeaderboards>> getFwCharacterLeaderboards(String ifNoneMatch);
    /**
     * Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Corporation leaderboard of kills and victory points within faction warfare
     */
    
    public CompletableFuture<EsiResponseWrapper<FWCorporationLeaderboards>> getFwCorporationLeaderboards(String ifNoneMatch);
    /**
     * Statistical overviews of factions involved in faction warfare
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Per faction breakdown of faction warfare statistics
     */
    
    public CompletableFuture<EsiResponseWrapper<List<GlobalFwStats>>> getFwStats(String ifNoneMatch);
    /**
     * Data about which NPC factions are at war
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of NPC factions at war
     */
    
    public CompletableFuture<EsiResponseWrapper<List<FwActiveWars>>> getFwWars(String ifNoneMatch);
    /**
     * An overview of the current ownership of faction warfare solar systems
     * 
     * ---
     * 
     * This route is cached for up to 1800 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return All faction warfare solar systems
     */
    
    public CompletableFuture<EsiResponseWrapper<List<FwSystemsList>>> getFwSystems(String ifNoneMatch);
}
