package luser.esi.client;


import java.util.concurrent.CompletableFuture;

public interface StatusApi {
    public ApiClient getApiClient();
    /**
     * EVE Server status
     * 
     * ---
     * 
     * This route is cached for up to 30 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Server status
     */
    
    public CompletableFuture<EsiResponseWrapper<ServerStatus>> getStatus(DatasourceEnum datasource, String ifNoneMatch);
}
