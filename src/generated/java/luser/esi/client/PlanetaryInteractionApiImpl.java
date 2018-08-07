package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class PlanetaryInteractionApiImpl implements PlanetaryInteractionApi {
    private ApiClient apiClient;
    PlanetaryInteractionApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<PlanetInfo>>> getPlanets(int characterId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/planets/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<PlanetInfo>> responseTypeRef = new TypeReference<List<PlanetInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CorporationCustomsOffice>>> getCustomsOffices(int corporationId, String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/corporations/" + corporationId + "/customs_offices/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<List<CorporationCustomsOffice>> responseTypeRef = new TypeReference<List<CorporationCustomsOffice>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<SchematicInfo>> getSchematicInfo(String ifNoneMatch, int schematicId) {         
        String url = "https://esi.evetech.net/v1/universe/schematics/" + schematicId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<SchematicInfo> responseTypeRef = new TypeReference<SchematicInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<PlanetContents>> getPlanetInfo(int characterId, String ifNoneMatch, int planetId) {         
        String url = "https://esi.evetech.net/v3/characters/" + characterId + "/planets/" + planetId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<PlanetContents> responseTypeRef = new TypeReference<PlanetContents>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
