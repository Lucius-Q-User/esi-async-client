package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class InsuranceApiImpl implements InsuranceApi {
    
    private ApiClient apiClient;
    InsuranceApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<InsurancePrices>>> getInsurancePrices(AcceptLanguageEnum acceptLanguage, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/insurance/prices/";
        RequestBuilder builder = Dsl.get(url);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<InsurancePrices>> responseTypeRef = new TypeReference<List<InsurancePrices>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
