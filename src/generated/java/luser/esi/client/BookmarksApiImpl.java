package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class BookmarksApiImpl implements BookmarksApi {
    
    private ApiClient apiClient;
    BookmarksApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<BookmarkInfo>>> getCorporationBookmarks(int corporationId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/bookmarks/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<BookmarkInfo>> responseTypeRef = new TypeReference<List<BookmarkInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationBookmarkFolder>>> getCorporationBookmarkFolders(int corporationId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/bookmarks/folders/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationBookmarkFolder>> responseTypeRef = new TypeReference<List<CorporationBookmarkFolder>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<BookmarkInfo>>> getCharacterBookmarks(int characterId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/bookmarks/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<BookmarkInfo>> responseTypeRef = new TypeReference<List<BookmarkInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CharacterBookmarksFolder>>> getCharacterBookmarkFolders(int characterId, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v2/characters/" + characterId + "/bookmarks/folders/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CharacterBookmarksFolder>> responseTypeRef = new TypeReference<List<CharacterBookmarksFolder>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<List<BookmarkInfo>> getCorporationBookmarksAllPages(int corporationId) {
        return ApiClientBase.pagingHelper((page) -> getCorporationBookmarks(corporationId, null, page), (List<BookmarkInfo>)null);
    }
    
    @Override
    public CompletableFuture<List<CorporationBookmarkFolder>> getCorporationBookmarkFoldersAllPages(int corporationId) {
        return ApiClientBase.pagingHelper((page) -> getCorporationBookmarkFolders(corporationId, null, page), (List<CorporationBookmarkFolder>)null);
    }
    
    @Override
    public CompletableFuture<List<BookmarkInfo>> getCharacterBookmarksAllPages(int characterId) {
        return ApiClientBase.pagingHelper((page) -> getCharacterBookmarks(characterId, null, page), (List<BookmarkInfo>)null);
    }
    
    @Override
    public CompletableFuture<List<CharacterBookmarksFolder>> getCharacterBookmarkFoldersAllPages(int characterId) {
        return ApiClientBase.pagingHelper((page) -> getCharacterBookmarkFolders(characterId, null, page), (List<CharacterBookmarksFolder>)null);
    }
}
