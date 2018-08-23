package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class ContractsApiImpl implements ContractsApi {
    
    private ApiClient apiClient;
    ContractsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContractInfo>>> getCharacterContracts(int characterId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/contracts/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<ContractInfo>> responseTypeRef = new TypeReference<List<ContractInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<AuctionBid>>> getCharacterContractBids(int characterId, int contractId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/contracts/" + contractId + "/bids/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<AuctionBid>> responseTypeRef = new TypeReference<List<AuctionBid>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContractedItem>>> getCharacterContractItems(int characterId, int contractId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/contracts/" + contractId + "/items/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<ContractedItem>> responseTypeRef = new TypeReference<List<ContractedItem>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<AuctionBid>>> getPublicContractBids(int contractId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/contracts/public/bids/" + contractId + "/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<AuctionBid>> responseTypeRef = new TypeReference<List<AuctionBid>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContractedItem>>> getPublicContractItems(int contractId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/contracts/public/items/" + contractId + "/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<ContractedItem>> responseTypeRef = new TypeReference<List<ContractedItem>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContractInfo>>> getPublicContracts(String ifNoneMatch, Integer page, int regionId) {
        String url = "https://esi.evetech.net/v1/contracts/public/" + regionId + "/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<ContractInfo>> responseTypeRef = new TypeReference<List<ContractInfo>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContractInfo>>> getCorporationContracts(int corporationId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/contracts/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<ContractInfo>> responseTypeRef = new TypeReference<List<ContractInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<AuctionBid>>> getContractBids(int contractId, int corporationId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/contracts/" + contractId + "/bids/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<AuctionBid>> responseTypeRef = new TypeReference<List<AuctionBid>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ContractedItem>>> getCorporationContractItems(int contractId, int corporationId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/contracts/" + contractId + "/items/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<ContractedItem>> responseTypeRef = new TypeReference<List<ContractedItem>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<List<ContractInfo>> getCharacterContractsAllPages(int characterId) {
        return ApiClientBase.pagingHelper((page) -> getCharacterContracts(characterId, null, page), (List<ContractInfo>)null);
    }
    
    @Override
    public CompletableFuture<List<AuctionBid>> getPublicContractBidsAllPages(int contractId) {
        return ApiClientBase.pagingHelper((page) -> getPublicContractBids(contractId, null, page), (List<AuctionBid>)null);
    }
    
    @Override
    public CompletableFuture<List<ContractedItem>> getPublicContractItemsAllPages(int contractId) {
        return ApiClientBase.pagingHelper((page) -> getPublicContractItems(contractId, null, page), (List<ContractedItem>)null);
    }
    
    @Override
    public CompletableFuture<List<ContractInfo>> getPublicContractsAllPages(int regionId) {
        return ApiClientBase.pagingHelper((page) -> getPublicContracts(null, page, regionId), (List<ContractInfo>)null);
    }
    
    @Override
    public CompletableFuture<List<ContractInfo>> getCorporationContractsAllPages(int corporationId) {
        return ApiClientBase.pagingHelper((page) -> getCorporationContracts(corporationId, null, page), (List<ContractInfo>)null);
    }
    
    @Override
    public CompletableFuture<List<AuctionBid>> getContractBidsAllPages(int contractId, int corporationId) {
        return ApiClientBase.pagingHelper((page) -> getContractBids(contractId, corporationId, null, page), (List<AuctionBid>)null);
    }
}
