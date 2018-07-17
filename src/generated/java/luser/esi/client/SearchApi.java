package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class SearchApi {
    private ApiClient apiClient;
    SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Search for entities that match a given sub-string.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param acceptLanguage Language to use in the response
     * @param categories Type of entities to search for
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param search The string to search on
     * @param strict Whether the search should be a strict match
     * @return A list of search results
     */
    
    public CompletableFuture<EsiResponseWrapper<SearchResult>> searchUnauthed(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, DatasourceEnum datasource, String ifNoneMatch, String search, Boolean strict) {
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
    /**
     * Search for entities that match a given sub-string.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param acceptLanguage Language to use in the response
     * @param categories Type of entities to search for
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param search The string to search on
     * @param strict Whether the search should be a strict match
     * @return A list of search results
     */
    
    public CompletableFuture<EsiResponseWrapper<CharacterSearchResult>> searchAuthed(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, int characterId, DatasourceEnum datasource, String ifNoneMatch, String search, Boolean strict) {
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
