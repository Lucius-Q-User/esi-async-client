package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface WalletApi {
    public ApiClient getApiClient();
    /**
     * Returns a character's wallet balance
     * 
     * ---
     * 
     * This route is cached for up to 120 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Wallet balance
     */
    
    public CompletableFuture<EsiResponseWrapper<Double>> getWallet(int characterId, DatasourceEnum datasource, String ifNoneMatch);
    /**
     * Get wallet transactions of a character
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param fromId Only show transactions happened before the one referenced by this id
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Wallet transactions
     */
    
    public CompletableFuture<EsiResponseWrapper<List<WalletTransaction>>> getWalletTransactions(int characterId, DatasourceEnum datasource, Long fromId, String ifNoneMatch);
    /**
     * Get a corporation's wallets
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of corporation wallets
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationWallets>>> getWallets(int corporationId, DatasourceEnum datasource, String ifNoneMatch);
    /**
     * Get wallet transactions of a corporation
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param division Wallet key of the division to fetch journals from
     * @param fromId Only show journal entries happened before the transaction referenced by this id
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Wallet transactions
     */
    
    public CompletableFuture<EsiResponseWrapper<List<WalletTransaction>>> getWalletDivisionTransactions(int corporationId, DatasourceEnum datasource, int division, Long fromId, String ifNoneMatch);
    /**
     * Retrieve the given corporation's wallet journal for the given division going 30 days back
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * 
     * ---
     * Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param division Wallet key of the division to fetch journals from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Journal entries
     */
    
    public CompletableFuture<EsiResponseWrapper<List<WalletJournalEntry>>> getWalletDivisionJournal(int corporationId, DatasourceEnum datasource, int division, String ifNoneMatch, Integer page);
    /**
     * Retrieve the given character's wallet journal going 30 days back
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return Journal entries
     */
    
    public CompletableFuture<EsiResponseWrapper<List<WalletJournalEntry>>> getWalletJournal(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page);
}
