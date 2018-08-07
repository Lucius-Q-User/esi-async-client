package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ContractsApi {
    public ApiClient getApiClient();
    /**
     * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is "in_progress".
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of contracts
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ContractInfo>>> getCharacterContracts(int characterId, String ifNoneMatch, Integer page);
    /**
     * Lists bids on a particular auction contract
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param contractId ID of a contract
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of bids
     */
    
    public CompletableFuture<EsiResponseWrapper<List<AuctionBid>>> getCharacterContractBids(int characterId, int contractId, String ifNoneMatch);
    /**
     * Lists items of a particular contract
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param contractId ID of a contract
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of items in this contract
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ContractedItem>>> getCharacterContractItems(int characterId, int contractId, String ifNoneMatch);
    /**
     * Returns contracts available to a corporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is "in_progress".
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of contracts
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ContractInfo>>> getCorporationContracts(int corporationId, String ifNoneMatch, Integer page);
    /**
     * Lists bids on a particular auction contract
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param contractId ID of a contract
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of bids
     */
    
    public CompletableFuture<EsiResponseWrapper<List<AuctionBid>>> getContractBids(int contractId, int corporationId, String ifNoneMatch, Integer page);
    /**
     * Lists items of a particular contract
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param contractId ID of a contract
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of items in this contract
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ContractedItem>>> getCorporationContractItems(int contractId, int corporationId, String ifNoneMatch);
}
