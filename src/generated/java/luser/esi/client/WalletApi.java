package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class WalletApi {
    private ApiClient apiClient;
    WalletApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
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
    
    public CompletableFuture<EsiResponseWrapper<Double>> getWallet(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/wallet/";
        
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
        TypeReference<Double> responseTypeRef = new TypeReference<Double>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
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
    
    public CompletableFuture<EsiResponseWrapper<List<WalletTransaction>>> getWalletTransactions(int characterId, DatasourceEnum datasource, Long fromId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/wallet/transactions/";
        
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
        
        if (fromId != null) {
            String val = String.valueOf(fromId);
            parametersInQuery.put("from_id", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        TypeReference<List<WalletTransaction>> responseTypeRef = new TypeReference<List<WalletTransaction>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
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
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationWallets>>> getWallets(int corporationId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/wallets/";
        
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
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        TypeReference<List<CorporationWallets>> responseTypeRef = new TypeReference<List<CorporationWallets>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
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
    
    public CompletableFuture<EsiResponseWrapper<List<WalletTransaction>>> getWalletDivisionTransactions(int corporationId, DatasourceEnum datasource, int division, Long fromId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/wallets/{division}/transactions/";
        
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
        
        if (fromId != null) {
            String val = String.valueOf(fromId);
            parametersInQuery.put("from_id", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        parametersInUrl.put("division", String.valueOf(division));
        String body = null;
        String method = "GET";
        TypeReference<List<WalletTransaction>> responseTypeRef = new TypeReference<List<WalletTransaction>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
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
    
    public CompletableFuture<EsiResponseWrapper<List<WalletJournalEntry>>> getWalletDivisionJournal(int corporationId, DatasourceEnum datasource, int division, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v3/corporations/{corporation_id}/wallets/{division}/journal/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        parametersInUrl.put("division", String.valueOf(division));
        String body = null;
        String method = "GET";
        TypeReference<List<WalletJournalEntry>> responseTypeRef = new TypeReference<List<WalletJournalEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
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
    
    public CompletableFuture<EsiResponseWrapper<List<WalletJournalEntry>>> getWalletJournal(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v4/characters/{character_id}/wallet/journal/";
        
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
        TypeReference<List<WalletJournalEntry>> responseTypeRef = new TypeReference<List<WalletJournalEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
