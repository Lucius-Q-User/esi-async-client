package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class LoyaltyApi {
    private ApiClient apiClient;
    LoyaltyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<LoyaltyPointsInfo>>> getCharactersCharacterIdLoyaltyPoints(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/loyalty/points/";
        
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
        Function<String, List<LoyaltyPointsInfo>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<LoyaltyPointsInfo> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(LoyaltyPointsInfo.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<LoyaltyStoreOffer>>> getLoyaltyStoresCorporationIdOffers(int corporationId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/loyalty/stores/{corporation_id}/offers/";
        
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
        Function<String, List<LoyaltyStoreOffer>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<LoyaltyStoreOffer> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(LoyaltyStoreOffer.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
