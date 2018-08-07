package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class MarketApiImpl implements MarketApi {
    private ApiClient apiClient;
    MarketApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterOrderHistoryEntry>>> getCharacterOrderHistory(int characterId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/orders/history/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CharacterOrderHistoryEntry>> responseTypeRef = new TypeReference<List<CharacterOrderHistoryEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getMarketGroups(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/markets/groups/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<MarketGroup>> getMarketGroupInfo(AcceptLanguageEnum acceptLanguage, String ifNoneMatch, int marketGroupId) {         
        String url = "https://esi.evetech.net/v1/markets/groups/" + marketGroupId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<MarketGroup> responseTypeRef = new TypeReference<MarketGroup>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<MarketPrices>>> getMarketPrices(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/markets/prices/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<MarketPrices>> responseTypeRef = new TypeReference<List<MarketPrices>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<StructureMarkets>>> getStructureMarket(String ifNoneMatch, Integer page, long structureId) {         
        String url = "https://esi.evetech.net/v1/markets/structures/" + structureId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<StructureMarkets>> responseTypeRef = new TypeReference<List<StructureMarkets>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<MarketHistory>>> getMarketHistory(String ifNoneMatch, int regionId, int typeId) {         
        String url = "https://esi.evetech.net/v1/markets/" + regionId + "/history/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        {
            String val = String.valueOf(typeId);
            builder.addQueryParam("type_id", val);
        }
        TypeReference<List<MarketHistory>> responseTypeRef = new TypeReference<List<MarketHistory>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ActiveMarketOrder>>> getMarketOrders(String ifNoneMatch, OrderTypeEnum orderType, Integer page, int regionId, Integer typeId) {         
        String url = "https://esi.evetech.net/v1/markets/" + regionId + "/orders/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (orderType != null) {
            String val = orderType.stringValue;
            builder.addQueryParam("order_type", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        
        if (typeId != null) {
            String val = String.valueOf(typeId);
            builder.addQueryParam("type_id", val);
        }
        TypeReference<List<ActiveMarketOrder>> responseTypeRef = new TypeReference<List<ActiveMarketOrder>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getMarketTypes(String ifNoneMatch, Integer page, int regionId) {         
        String url = "https://esi.evetech.net/v1/markets/" + regionId + "/types/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterMarketOrder>>> getOrders(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/orders/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CharacterMarketOrder>> responseTypeRef = new TypeReference<List<CharacterMarketOrder>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationMarketOrderHistoryEntry>>> getCorporationOrderHistory(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v2/corporations/" + corporationId + "/orders/history/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationMarketOrderHistoryEntry>> responseTypeRef = new TypeReference<List<CorporationMarketOrderHistoryEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationMarketOwner>>> getOrders(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v3/corporations/" + corporationId + "/orders/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationMarketOwner>> responseTypeRef = new TypeReference<List<CorporationMarketOwner>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
