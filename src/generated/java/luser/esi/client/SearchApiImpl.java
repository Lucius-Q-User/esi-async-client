package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

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
        RequestBuilder builder = Dsl.get(url);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (categories != null) {
            String val = ApiClientBase.renderArrayToQuery(categories, null);
            builder.addQueryParam("categories", val);
        }
        
        if (search != null) {
            String val = search;
            builder.addQueryParam("search", val);
        }
        
        if (strict != null) {
            String val = String.valueOf(strict);
            builder.addQueryParam("strict", val);
        }
        TypeReference<SearchResult> responseTypeRef = new TypeReference<SearchResult>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CharacterSearchResult>> searchAuthed(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, int characterId, String ifNoneMatch, String search, Boolean strict) {
        String url = "https://esi.evetech.net/v3/characters/" + characterId + "/search/";
        RequestBuilder builder = Dsl.get(url);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (categories != null) {
            String val = ApiClientBase.renderArrayToQuery(categories, null);
            builder.addQueryParam("categories", val);
        }
        
        if (search != null) {
            String val = search;
            builder.addQueryParam("search", val);
        }
        
        if (strict != null) {
            String val = String.valueOf(strict);
            builder.addQueryParam("strict", val);
        }
        TypeReference<CharacterSearchResult> responseTypeRef = new TypeReference<CharacterSearchResult>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
