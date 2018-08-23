package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface SearchApi {
    public ApiClient getApiClient();
    
    /**
     * Search for entities that match a given sub-string.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param acceptLanguage Language to use in the response
     * @param categories Type of entities to search for
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param search The string to search on
     * @param strict Whether the search should be a strict match
     * @return A list of search results
     */
    
    public CompletableFuture<EsiResponseWrapper<SearchResult>> searchUnauthed(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, String ifNoneMatch, String search, Boolean strict);
    /**
     * Search for entities that match a given sub-string.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param acceptLanguage Language to use in the response
     * @param categories Type of entities to search for
     * @param characterId An EVE character ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param search The string to search on
     * @param strict Whether the search should be a strict match
     * @return A list of search results
     */
    
    public CompletableFuture<EsiResponseWrapper<CharacterSearchResult>> searchAuthed(AcceptLanguageEnum acceptLanguage, List<CategoriesEnum> categories, int characterId, String ifNoneMatch, String search, Boolean strict);
}
