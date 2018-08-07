package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.LongArrayList;
import java.util.concurrent.CompletableFuture;

public interface AssetsApi {
    public ApiClient getApiClient();
    /**
     * Return names for a set of item ids, which you can get from character assets endpoint. Typically used for items that can customize names, like containers or ships.
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param itemIds A list of item ids
     * @return List of asset names
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedAssetName>>> resolveCharacterAssetNames(int characterId, DatasourceEnum datasource, LongArrayList itemIds);
    /**
     * Return names for a set of item ids, which you can get from corporation assets endpoint. Only valid for items that can customize names, like containers or ships.
     * 
     * ---
     * 
     * Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param itemIds A list of item ids
     * @return List of asset names
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedAssetName>>> resolveCorporationAssetNames(int corporationId, DatasourceEnum datasource, LongArrayList itemIds);
    /**
     * Return locations for a set of item ids, which you can get from character assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param itemIds A list of item ids
     * @return List of asset locations
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemLocation>>> resolveCharacterAssetLocations(int characterId, DatasourceEnum datasource, LongArrayList itemIds);
    /**
     * Return locations for a set of item ids, which you can get from corporation assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)
     * 
     * ---
     * 
     * Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param itemIds A list of item ids
     * @return List of asset locations
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemLocation>>> resolveCorporationAssetLocations(int corporationId, DatasourceEnum datasource, LongArrayList itemIds);
    /**
     * Return a list of the characters assets
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A flat list of the users assets
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterAssetsEntry>>> getCharacterAssets(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page);
    /**
     * Return a list of the corporation assets
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
     * @return A list of assets
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationAssetsEntry>>> getCorporationAssets(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page);
}
