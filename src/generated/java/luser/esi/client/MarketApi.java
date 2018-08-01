package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class MarketApi {
    private ApiClient apiClient;
    MarketApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * List cancelled and expired market orders placed by a character up to 90 days in the past.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Expired and cancelled market orders placed by a character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterOrderHistoryEntry>>> getCharacterOrderHistory(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/orders/history/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        TypeReference<List<CharacterOrderHistoryEntry>> responseTypeRef = new TypeReference<List<CharacterOrderHistoryEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of item groups
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of item group ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getMarketGroups(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/markets/groups/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on an item group
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param marketGroupId An Eve item group ID
     * @return Information about an item group
     */
    
    public CompletableFuture<EsiResponseWrapper<MarketGroup>> getMarketGroupInfo(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch, int marketGroupId) {
        String url = "https://esi.evetech.net/v1/markets/groups/{market_group_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(2);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            parametersInHeaders.put("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("market_group_id", String.valueOf(marketGroupId));
        String body = null;
        String method = "GET";
        TypeReference<MarketGroup> responseTypeRef = new TypeReference<MarketGroup>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return a list of prices
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of prices
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MarketPrices>>> getMarketPrices(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/markets/prices/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<List<MarketPrices>> responseTypeRef = new TypeReference<List<MarketPrices>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return all orders in a structure
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @param structureId Return orders in this structure
     * @return A list of orders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<StructureMarkets>>> getStructureMarket(DatasourceEnum datasource, String ifNoneMatch, Integer page, long structureId) {
        String url = "https://esi.evetech.net/v1/markets/structures/{structure_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("structure_id", String.valueOf(structureId));
        String body = null;
        String method = "GET";
        TypeReference<List<StructureMarkets>> responseTypeRef = new TypeReference<List<StructureMarkets>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return a list of historical market statistics for the specified type in a region
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param regionId Return statistics in this region
     * @param typeId Return statistics for this type
     * @return A list of historical market statistics
     */
    
    public CompletableFuture<EsiResponseWrapper<List<MarketHistory>>> getMarketHistory(DatasourceEnum datasource, String ifNoneMatch, int regionId, int typeId) {
        String url = "https://esi.evetech.net/v1/markets/{region_id}/history/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        {
            String val = String.valueOf(typeId);
            parametersInQuery.put("type_id", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("region_id", String.valueOf(regionId));
        String body = null;
        String method = "GET";
        TypeReference<List<MarketHistory>> responseTypeRef = new TypeReference<List<MarketHistory>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return a list of orders in a region
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param orderType Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders.
     * @param page Which page of results to return
     * @param regionId Return orders in this region
     * @param typeId Return orders only for this type
     * @return A list of orders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ActiveMarketOrder>>> getMarketOrders(DatasourceEnum datasource, String ifNoneMatch, OrderTypeEnum orderType, Integer page, int regionId, Integer typeId) {
        String url = "https://esi.evetech.net/v1/markets/{region_id}/orders/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(4);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (orderType != null) {
            String val = orderType.stringValue;
            parametersInQuery.put("order_type", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }
        
        if (typeId != null) {
            String val = String.valueOf(typeId);
            parametersInQuery.put("type_id", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("region_id", String.valueOf(regionId));
        String body = null;
        String method = "GET";
        TypeReference<List<ActiveMarketOrder>> responseTypeRef = new TypeReference<List<ActiveMarketOrder>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Return a list of type IDs that have active orders in the region, for efficient market indexing.
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @param regionId Return statistics in this region
     * @return A list of type IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getMarketTypes(DatasourceEnum datasource, String ifNoneMatch, Integer page, int regionId) {
        String url = "https://esi.evetech.net/v1/markets/{region_id}/types/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("region_id", String.valueOf(regionId));
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * List open market orders placed by a character
     * 
     * ---
     * 
     * This route is cached for up to 1200 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Open market orders placed by a character
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterMarketOrder>>> getOrders(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/orders/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        TypeReference<List<CharacterMarketOrder>> responseTypeRef = new TypeReference<List<CharacterMarketOrder>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
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
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Expired and cancelled market orders placed on behalf of a corporation
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationMarketOrderHistoryEntry>>> getCorporationOrderHistory(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/corporations/{corporation_id}/orders/history/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        TypeReference<List<CorporationMarketOrderHistoryEntry>> responseTypeRef = new TypeReference<List<CorporationMarketOrderHistoryEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
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
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of open market orders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationMarketOwner>>> getOrders(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v3/corporations/{corporation_id}/orders/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        TypeReference<List<CorporationMarketOwner>> responseTypeRef = new TypeReference<List<CorporationMarketOwner>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
