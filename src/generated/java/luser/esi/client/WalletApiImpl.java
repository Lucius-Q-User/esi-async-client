package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class WalletApiImpl implements WalletApi {
    
    private ApiClient apiClient;
    WalletApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Double>> getWallet(int characterId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/wallet/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<Double> responseTypeRef = new TypeReference<Double>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<WalletTransaction>>> getWalletTransactions(int characterId, Long fromId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/wallet/transactions/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (fromId != null) {
            String val = String.valueOf(fromId);
            builder.addQueryParam("from_id", val);
        }
        TypeReference<List<WalletTransaction>> responseTypeRef = new TypeReference<List<WalletTransaction>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationWallets>>> getWallets(int corporationId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/wallets/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<CorporationWallets>> responseTypeRef = new TypeReference<List<CorporationWallets>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<WalletTransaction>>> getWalletDivisionTransactions(int corporationId, int division, Long fromId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/wallets/" + division + "/transactions/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (fromId != null) {
            String val = String.valueOf(fromId);
            builder.addQueryParam("from_id", val);
        }
        TypeReference<List<WalletTransaction>> responseTypeRef = new TypeReference<List<WalletTransaction>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<WalletJournalEntry>>> getWalletDivisionJournal(int corporationId, int division, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v3/corporations/" + corporationId + "/wallets/" + division + "/journal/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<WalletJournalEntry>> responseTypeRef = new TypeReference<List<WalletJournalEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<WalletJournalEntry>>> getWalletJournal(int characterId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v4/characters/" + characterId + "/wallet/journal/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<WalletJournalEntry>> responseTypeRef = new TypeReference<List<WalletJournalEntry>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<List<WalletJournalEntry>> getWalletDivisionJournalAllPages(int corporationId, int division) {
        return ApiClientBase.pagingHelper((page) -> getWalletDivisionJournal(corporationId, division, null, page), (List<WalletJournalEntry>)null);
    }
    
    @Override
    public CompletableFuture<List<WalletJournalEntry>> getWalletJournalAllPages(int characterId) {
        return ApiClientBase.pagingHelper((page) -> getWalletJournal(characterId, null, page), (List<WalletJournalEntry>)null);
    }
}
