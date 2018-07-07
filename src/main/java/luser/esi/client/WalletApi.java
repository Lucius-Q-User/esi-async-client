package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class WalletApi {
    private ApiClient apiClient;
    WalletApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<Double>> getCharactersCharacterIdWallet(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, Double> responseParser = (resp) -> {
            return Double.parseDouble(resp);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<WalletTransaction>>> getCharactersCharacterIdWalletTransactions(int characterId, DatasourceEnum datasource, Long fromId, String ifNoneMatch) {
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
        Function<String, List<WalletTransaction>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<WalletTransaction> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(WalletTransaction.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationWallets>>> getCorporationsCorporationIdWallets(int corporationId, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, List<CorporationWallets>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<CorporationWallets> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(CorporationWallets.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<WalletTransaction>>> getCorporationsCorporationIdWalletsDivisionTransactions(int corporationId, DatasourceEnum datasource, int division, Long fromId, String ifNoneMatch) {
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
        Function<String, List<WalletTransaction>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<WalletTransaction> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(WalletTransaction.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<WalletJournalEntry>>> getCorporationsCorporationIdWalletsDivisionJournal(int corporationId, DatasourceEnum datasource, int division, String ifNoneMatch, Integer page) {
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
        Function<String, List<WalletJournalEntry>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<WalletJournalEntry> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(WalletJournalEntry.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<WalletJournalEntry>>> getCharactersCharacterIdWalletJournal(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
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
        Function<String, List<WalletJournalEntry>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<WalletJournalEntry> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(WalletJournalEntry.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
