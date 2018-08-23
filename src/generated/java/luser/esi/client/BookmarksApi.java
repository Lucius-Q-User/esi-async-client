package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface BookmarksApi {
    public ApiClient getApiClient();
    
    /**
     * A list of your corporation's bookmarks
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of corporation owned bookmarks
     */
    
    public CompletableFuture<EsiResponseWrapper<List<BookmarkInfo>>> getCorporationBookmarks(int corporationId, String ifNoneMatch, Integer page);
    /**
     * A list of your corporation's bookmark folders
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of corporation owned bookmark folders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationBookmarkFolder>>> getCorporationBookmarkFolders(int corporationId, String ifNoneMatch, Integer page);
    /**
     * A list of your character's personal bookmarks
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of bookmarks
     */
    
    public CompletableFuture<EsiResponseWrapper<List<BookmarkInfo>>> getCharacterBookmarks(int characterId, String ifNoneMatch, Integer page);
    /**
     * A list of your character's personal bookmark folders
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of bookmark folders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterBookmarksFolder>>> getCharacterBookmarkFolders(int characterId, String ifNoneMatch, Integer page);
    
    public CompletableFuture<List<BookmarkInfo>> getCorporationBookmarksAllPages(int corporationId);
    
    public CompletableFuture<List<CorporationBookmarkFolder>> getCorporationBookmarkFoldersAllPages(int corporationId);
    
    public CompletableFuture<List<BookmarkInfo>> getCharacterBookmarksAllPages(int characterId);
    
    public CompletableFuture<List<CharacterBookmarksFolder>> getCharacterBookmarkFoldersAllPages(int characterId);
}
