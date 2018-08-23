package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class RoutesApiImpl implements RoutesApi {
    
    private ApiClient apiClient;
    RoutesApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getRoute(IntArrayList avoid, List<IntArrayList> connections, int destination, FlagEnum flag, String ifNoneMatch, int origin) {
        String url = "https://esi.evetech.net/v1/route/" + origin + "/" + destination + "/";
        RequestBuilder builder = Dsl.get(url);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (avoid != null) {
            String val = ApiClientBase.renderArrayToQuery(avoid, null);
            builder.addQueryParam("avoid", val);
        }
        
        if (connections != null) {
            String val = ApiClientBase.renderArrayToQuery(connections, null);
            builder.addQueryParam("connections", val);
        }
        
        if (flag != null) {
            String val = flag.stringValue;
            builder.addQueryParam("flag", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
