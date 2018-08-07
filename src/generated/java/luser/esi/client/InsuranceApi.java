package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface InsuranceApi {
    public ApiClient getApiClient();
    /**
     * Return available insurance levels for all ship types
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of insurance levels for all ship types
     */
    
    public CompletableFuture<EsiResponseWrapper<List<InsurancePrices>>> getInsurancePrices(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch);
}
