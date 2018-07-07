package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class FittingsApi {
    private ApiClient apiClient;
    FittingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<SavedFitting>>> getCharactersCharacterIdFittings(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/fittings/";
        
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
        Function<String, List<SavedFitting>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<SavedFitting> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(SavedFitting.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<FittingCreatedResponse>> postCharactersCharacterIdFittings(int characterId, DatasourceEnum datasource, NewStoredFitting fitting) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/fittings/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        body = ApiClientBase.renderToBody(fitting);
        String method = "POST";
        Function<String, FittingCreatedResponse> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return FittingCreatedResponse.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteCharactersCharacterIdFittingsFittingId(int characterId, DatasourceEnum datasource, int fittingId) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/fittings/{fitting_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("fitting_id", String.valueOf(fittingId));
        String body = null;
        String method = "DELETE";
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
