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
     * @param datasource The server name you would like data from
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
     * @param datasource The server name you would like data from
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
     * @param datasource The server name you would like data from
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
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List of bookmark folders
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CharacterBookmarksFolder>>> getCharacterBookmarkFolders(int characterId, String ifNoneMatch, Integer page);
}
