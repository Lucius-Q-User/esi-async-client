package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

class SearchApiImpl implements SearchApi {
    private ApiClient apiClient;
    SearchApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<SearchResult>> searchUnauthed(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, String ifNoneMatch, String search, Boolean strict) {
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
        Map<String, String> parametersInQuery = new HashMap<>(3);
        
        if (categories != null) {
            String val = ApiClientBase.renderArrayToQuery(categories, null);
            parametersInQuery.put("categories", val);
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
        TypeReference<SearchResult> responseTypeRef = new TypeReference<SearchResult>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CharacterSearchResult>> searchAuthed(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, int characterId, String ifNoneMatch, String search, Boolean strict) {
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
        Map<String, String> parametersInQuery = new HashMap<>(3);
        
        if (categories != null) {
            String val = ApiClientBase.renderArrayToQuery(categories, null);
            parametersInQuery.put("categories", val);
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
        TypeReference<CharacterSearchResult> responseTypeRef = new TypeReference<CharacterSearchResult>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
