package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;

@SuppressWarnings("unused")
public class InsuranceApi {
    private ApiClient apiClient;
    InsuranceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<InsurancePrices>>> getInsurancePrices(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/insurance/prices/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(2);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            parametersInHeaders.put("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        ResponseParser<List<InsurancePrices>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<InsurancePrices>>() {});
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}