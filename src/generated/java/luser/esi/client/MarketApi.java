package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import java.util.concurrent.CompletableFuture;

public interface MarketApi {
    public ApiClient getApiClient();
    
    /**
     * List cancelled and expired market orders placed by a character up to 90 days in the past.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Expired and cancelled market orders placed by a character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterOrderHistoryEntry>>> getCharacterOrderHistory(int characterId, String ifNoneMatch, Integer page);
    /**
     * Get a list of item groups
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of item group ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getMarketGroups(String ifNoneMatch);
    /**
     * Get information on an item group
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param marketGroupId An Eve item group ID
     * @return Information about an item group
     */
    
    public CompletableFuture<EsiResponseWrapper<MarketGroup>> getMarketGroupInfo(AcceptLanguageEnum acceptLanguage, String ifNoneMatch, int marketGroupId);
    /**
     * Return a list of prices
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of prices
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MarketPrices>>> getMarketPrices(String ifNoneMatch);
    /**
     * Return all orders in a structure
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @param structureId Return orders in this structure
     * @return A list of orders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<StructureMarkets>>> getStructureMarket(String ifNoneMatch, Integer page, long structureId);
    /**
     * Return a list of historical market statistics for the specified type in a region
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param regionId Return statistics in this region
     * @param typeId Return statistics for this type
     * @return A list of historical market statistics
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MarketHistory>>> getMarketHistory(String ifNoneMatch, int regionId, int typeId);
    /**
     * Return a list of orders in a region
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param orderType Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders
     * @param page Which page of results to return
     * @param regionId Return orders in this region
     * @param typeId Return orders only for this type
     * @return A list of orders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ActiveMarketOrder>>> getMarketOrders(String ifNoneMatch, OrderTypeEnum orderType, Integer page, int regionId, Integer typeId);
    /**
     * Return a list of type IDs that have active orders in the region, for efficient market indexing.
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @param regionId Return statistics in this region
     * @return A list of type IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getMarketTypes(String ifNoneMatch, Integer page, int regionId);
    /**
     * List open market orders placed by a character
     * 
     * ---
     * 
     * This route is cached for up to 1200 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Open market orders placed by a character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterMarketOrder>>> getOrders(int characterId, String ifNoneMatch);
    /**
     * List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant, Trader
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Expired and cancelled market orders placed on behalf of a corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationMarketOrderHistoryEntry>>> getCorporationOrderHistory(int corporationId, String ifNoneMatch, Integer page);
    /**
     * List open market orders placed on behalf of a corporation
     * 
     * ---
     * 
     * This route is cached for up to 1200 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant, Trader
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of open market orders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationMarketOwner>>> getOrders(int corporationId, String ifNoneMatch, Integer page);
    
    public CompletableFuture<List<CharacterOrderHistoryEntry>> getCharacterOrderHistoryAllPages(int characterId);
    
    public CompletableFuture<List<StructureMarkets>> getStructureMarketAllPages(long structureId);
    
    public CompletableFuture<List<ActiveMarketOrder>> getMarketOrdersAllPages(OrderTypeEnum orderType, int regionId, Integer typeId);
    
    public CompletableFuture<IntArrayList> getMarketTypesAllPages(int regionId);
    
    public CompletableFuture<List<CorporationMarketOrderHistoryEntry>> getCorporationOrderHistoryAllPages(int corporationId);
    
    public CompletableFuture<List<CorporationMarketOwner>> getOrdersAllPages(int corporationId);
}
