package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;

@SuppressWarnings("unused")
public class BookmarksApi {
    private ApiClient apiClient;
    BookmarksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * A list of your corporation's bookmarks
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of corporation owned bookmarks
     */
    
    public CompletableFuture<EsiResponseWrapper<List<BookmarkInfo>>> getCorporationsCorporationIdBookmarks(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/bookmarks/";
        
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
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        ResponseParser<List<BookmarkInfo>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<BookmarkInfo>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * A list of your corporation's bookmark folders
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of corporation owned bookmark folders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationBookmarkFolder>>> getCorporationsCorporationIdBookmarksFolders(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/bookmarks/folders/";
        
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
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        ResponseParser<List<CorporationBookmarkFolder>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<CorporationBookmarkFolder>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * A list of your character's personal bookmarks
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of bookmarks
     */
    
    public CompletableFuture<EsiResponseWrapper<List<BookmarkInfo>>> getCharactersCharacterIdBookmarks(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/bookmarks/";
        
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
        ResponseParser<List<BookmarkInfo>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<BookmarkInfo>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    /**
     * A list of your character's personal bookmark folders
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of bookmark folders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterBookmarksFolder>>> getCharactersCharacterIdBookmarksFolders(int characterId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/characters/{character_id}/bookmarks/folders/";
        
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
        ResponseParser<List<CharacterBookmarksFolder>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<CharacterBookmarksFolder>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
