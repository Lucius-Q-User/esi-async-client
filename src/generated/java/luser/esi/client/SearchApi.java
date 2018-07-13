package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;

@SuppressWarnings("unused")
public class SearchApi {
    private ApiClient apiClient;
    SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<SearchResult>> getSearch(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, DatasourceEnum datasource, String ifNoneMatch, String search, Boolean strict) {
        String url = "https://esi.evetech.net/v2/search/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(2);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            parametersInHeaders.put("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(4);
        
        if (categories != null) {
            String val = ApiClientBase.renderArrayToQuery(categories, null);
            parametersInQuery.put("categories", val);
        }
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (search != null) {
            String val = search;
            parametersInQuery.put("search", val);
        }
        
        if (strict != null) {
            String val = String.valueOf(strict);
            parametersInQuery.put("strict", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        ResponseParser<SearchResult> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, SearchResult.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<CharacterSearchResult>> getCharactersCharacterIdSearch(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, int characterId, DatasourceEnum datasource, String ifNoneMatch, String search, Boolean strict) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/search/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(2);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            parametersInHeaders.put("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(4);
        
        if (categories != null) {
            String val = ApiClientBase.renderArrayToQuery(categories, null);
            parametersInQuery.put("categories", val);
        }
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (search != null) {
            String val = search;
            parametersInQuery.put("search", val);
        }
        
        if (strict != null) {
            String val = String.valueOf(strict);
            parametersInQuery.put("strict", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        ResponseParser<CharacterSearchResult> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, CharacterSearchResult.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
