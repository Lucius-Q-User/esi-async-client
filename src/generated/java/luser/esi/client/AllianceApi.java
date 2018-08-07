package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface AllianceApi {
    public ApiClient getApiClient();
    /**
     * List all active player alliances
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of Alliance IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getAlliances(DatasourceEnum datasource, String ifNoneMatch);
    /**
     * List all current member corporations of an alliance
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of corporation IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getCorporations(int allianceId, DatasourceEnum datasource, String ifNoneMatch);
    /**
     * Get the icon urls for a alliance
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Icon URLs for the given alliance id and server
     */
    
    public CompletableFuture<EsiResponseWrapper<AllianceIcons>> getIcons(int allianceId, DatasourceEnum datasource, String ifNoneMatch);
    /**
     * Public information about an alliance
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Public data about an alliance
     */
    
    public CompletableFuture<EsiResponseWrapper<AllianceInfo>> getAllianceInfo(int allianceId, DatasourceEnum datasource, String ifNoneMatch);
}
