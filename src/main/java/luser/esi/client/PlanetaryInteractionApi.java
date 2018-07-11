package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;

@SuppressWarnings("unused")
public class PlanetaryInteractionApi {
    private ApiClient apiClient;
    PlanetaryInteractionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<PlanetInfo>>> getCharactersCharacterIdPlanets(int characterId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/planets/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        ResponseParser<List<PlanetInfo>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<PlanetInfo>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<CorporationCustomsOffice>>> getCorporationsCorporationIdCustomsOffices(int corporationId, DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/corporations/{corporation_id}/customs_offices/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            parametersInQuery.put("page", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("corporation_id", String.valueOf(corporationId));
        String body = null;
        String method = "GET";
        ResponseParser<List<CorporationCustomsOffice>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<CorporationCustomsOffice>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<SchematicInfo>> getUniverseSchematicsSchematicId(DatasourceEnum datasource, String ifNoneMatch, int schematicId) {
        String url = "https://esi.evetech.net/v1/universe/schematics/{schematic_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("schematic_id", String.valueOf(schematicId));
        String body = null;
        String method = "GET";
        ResponseParser<SchematicInfo> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, SchematicInfo.class);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<PlanetContents>> getCharactersCharacterIdPlanetsPlanetId(int characterId, DatasourceEnum datasource, String ifNoneMatch, int planetId) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/planets/{planet_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("planet_id", String.valueOf(planetId));
        String body = null;
        String method = "GET";
        ResponseParser<PlanetContents> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, PlanetContents.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
