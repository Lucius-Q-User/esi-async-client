package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface FittingsApi {
    public ApiClient getApiClient();
    /**
     * Return fittings of a character
     * 
     * ---
     * 
     * This route is cached for up to 300 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of fittings
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SavedFitting>>> getFittings(int characterId, DatasourceEnum datasource, String ifNoneMatch);
    /**
     * Save a new fitting for a character
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param fitting Details about the new fitting
     * @return A list of fittings
     */
    
    public CompletableFuture<EsiResponseWrapper<FittingCreatedResponse>> createFitting(int characterId, DatasourceEnum datasource, NewStoredFitting fitting);
    /**
     * Delete a fitting from a character
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param fittingId ID for a fitting of this character
     * @return Fitting deleted
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> deleteFitting(int characterId, DatasourceEnum datasource, int fittingId);
}
