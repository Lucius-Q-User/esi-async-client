package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class UniverseApi {
    private ApiClient apiClient;
    UniverseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    /**
     * Get all character ancestries
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of ancestries
     */
    
    public CompletableFuture<EsiResponseWrapper<List<AncestryInfo>>> getAncestries(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/ancestries/";
        
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
        TypeReference<List<AncestryInfo>> responseTypeRef = new TypeReference<List<AncestryInfo>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on an asteroid belt
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param asteroidBeltId asteroid_belt_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about an asteroid belt
     */
    
    public CompletableFuture<EsiResponseWrapper<AsteroidBeltInfo>> getAsteroidBeltInfo(int asteroidBeltId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/asteroid_belts/{asteroid_belt_id}/";
        
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
        parametersInUrl.put("asteroid_belt_id", String.valueOf(asteroidBeltId));
        String body = null;
        String method = "GET";
        TypeReference<AsteroidBeltInfo> responseTypeRef = new TypeReference<AsteroidBeltInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of bloodlines
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of bloodlines
     */
    
    public CompletableFuture<EsiResponseWrapper<List<BloodlineInfo>>> getBloodlines(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/bloodlines/";
        
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
        TypeReference<List<BloodlineInfo>> responseTypeRef = new TypeReference<List<BloodlineInfo>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of item categories
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of item category ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getCategories(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/categories/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information of an item category
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param categoryId An Eve item category ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about an item category
     */
    
    public CompletableFuture<EsiResponseWrapper<ItemCategoryInfo>> getCategoryInfo(AcceptLanguageEnum acceptLanguage, int categoryId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/categories/{category_id}/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("category_id", String.valueOf(categoryId));
        String body = null;
        String method = "GET";
        TypeReference<ItemCategoryInfo> responseTypeRef = new TypeReference<ItemCategoryInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of constellations
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of constellation ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getConstellations(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/constellations/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a constellation
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param constellationId constellation_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about a constellation
     */
    
    public CompletableFuture<EsiResponseWrapper<ConstellationInfo>> getConstellationInfo(AcceptLanguageEnum acceptLanguage, int constellationId, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/constellations/{constellation_id}/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("constellation_id", String.valueOf(constellationId));
        String body = null;
        String method = "GET";
        TypeReference<ConstellationInfo> responseTypeRef = new TypeReference<ConstellationInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of graphics
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of graphic ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getGraphics(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/graphics/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a graphic
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param graphicId graphic_id integer
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about a graphic
     */
    
    public CompletableFuture<EsiResponseWrapper<GhaphicInfo>> getGraphicInfo(DatasourceEnum datasource, int graphicId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/graphics/{graphic_id}/";
        
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
        parametersInUrl.put("graphic_id", String.valueOf(graphicId));
        String body = null;
        String method = "GET";
        TypeReference<GhaphicInfo> responseTypeRef = new TypeReference<GhaphicInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of item groups
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of item group ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getGroups(DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/universe/groups/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on an item group
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param groupId An Eve item group ID
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Information about an item group
     */
    
    public CompletableFuture<EsiResponseWrapper<ItemGroupInfo>> getGroupInfo(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, int groupId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/groups/{group_id}/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("group_id", String.valueOf(groupId));
        String body = null;
        String method = "GET";
        TypeReference<ItemGroupInfo> responseTypeRef = new TypeReference<ItemGroupInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours.
     * 
     * ---
     * 
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param names The names to resolve
     * @return List of id/name associations for a set of names divided by category. Any name passed in that did not have a match will be ommitted.
     */
    
    public CompletableFuture<EsiResponseWrapper<ResolvedItemId>> resolveIds(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, List<String> names) {
        String url = "https://esi.evetech.net/v1/universe/ids/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            parametersInHeaders.put("Accept-Language", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        body = ApiClientBase.renderToBody(names);
        String method = "POST";
        TypeReference<ResolvedItemId> responseTypeRef = new TypeReference<ResolvedItemId>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a moon
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param moonId moon_id integer
     * @return Information about a moon
     */
    
    public CompletableFuture<EsiResponseWrapper<MoonInfo>> getMoonInfo(DatasourceEnum datasource, String ifNoneMatch, int moonId) {
        String url = "https://esi.evetech.net/v1/universe/moons/{moon_id}/";
        
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
        parametersInUrl.put("moon_id", String.valueOf(moonId));
        String body = null;
        String method = "GET";
        TypeReference<MoonInfo> responseTypeRef = new TypeReference<MoonInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a planet
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param planetId planet_id integer
     * @return Information about a planet
     */
    
    public CompletableFuture<EsiResponseWrapper<UniversePlanetInfo>> getPlanetInfo(DatasourceEnum datasource, String ifNoneMatch, int planetId) {
        String url = "https://esi.evetech.net/v1/universe/planets/{planet_id}/";
        
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
        parametersInUrl.put("planet_id", String.valueOf(planetId));
        String body = null;
        String method = "GET";
        TypeReference<UniversePlanetInfo> responseTypeRef = new TypeReference<UniversePlanetInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of character races
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of character races
     */
    
    public CompletableFuture<EsiResponseWrapper<List<RaceInfo>>> getRaces(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/races/";
        
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
        TypeReference<List<RaceInfo>> responseTypeRef = new TypeReference<List<RaceInfo>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of regions
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of region ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getRegions(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/regions/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a region
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param regionId region_id integer
     * @return Information about a region
     */
    
    public CompletableFuture<EsiResponseWrapper<RegionInfo>> getRegionInfo(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch, int regionId) {
        String url = "https://esi.evetech.net/v1/universe/regions/{region_id}/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("region_id", String.valueOf(regionId));
        String body = null;
        String method = "GET";
        TypeReference<RegionInfo> responseTypeRef = new TypeReference<RegionInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a stargate
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param stargateId stargate_id integer
     * @return Information about a stargate
     */
    
    public CompletableFuture<EsiResponseWrapper<StargateInfo>> getStargateInfo(DatasourceEnum datasource, String ifNoneMatch, int stargateId) {
        String url = "https://esi.evetech.net/v1/universe/stargates/{stargate_id}/";
        
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
        parametersInUrl.put("stargate_id", String.valueOf(stargateId));
        String body = null;
        String method = "GET";
        TypeReference<StargateInfo> responseTypeRef = new TypeReference<StargateInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a star
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param starId star_id integer
     * @return Information about a star
     */
    
    public CompletableFuture<EsiResponseWrapper<StarInfo>> getStarInfo(DatasourceEnum datasource, String ifNoneMatch, int starId) {
        String url = "https://esi.evetech.net/v1/universe/stars/{star_id}/";
        
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
        parametersInUrl.put("star_id", String.valueOf(starId));
        String body = null;
        String method = "GET";
        TypeReference<StarInfo> responseTypeRef = new TypeReference<StarInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * List all public structures
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of public structure IDs
     */
    
    public CompletableFuture<EsiResponseWrapper<LongArrayList>> getStructures(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/structures/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<LongArrayList> responseTypeRef = new TypeReference<LongArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of systems and number of jumps
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SystemJumps>>> getSystemJumps(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/system_jumps/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<List<SystemJumps>> responseTypeRef = new TypeReference<List<SystemJumps>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of solar systems
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of solar system ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getSystems(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/universe/systems/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of type ids
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return A list of type ids
     */
    
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getTypes(DatasourceEnum datasource, String ifNoneMatch, Integer page) {
        String url = "https://esi.evetech.net/v1/universe/types/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get a list of factions
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of factions
     */
    
    public CompletableFuture<EsiResponseWrapper<List<UniverseFaction>>> getFactions(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/universe/factions/";
        
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
        TypeReference<List<UniverseFaction>> responseTypeRef = new TypeReference<List<UniverseFaction>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Resolve a set of IDs to names and categories. Supported ID's for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types.
     * 
     * ---
     * 
     * @param datasource The server name you would like data from
     * @param ids The ids to resolve
     * @return List of id/name associations for a set of ID's. All ID's must resolve to a name, or nothing will be returned.
     */
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemName>>> resolveNames(DatasourceEnum datasource, IntArrayList ids) {
        String url = "https://esi.evetech.net/v2/universe/names/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        body = ApiClientBase.renderToBody(ids);
        String method = "POST";
        TypeReference<List<ResolvedItemName>> responseTypeRef = new TypeReference<List<ResolvedItemName>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a station
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param stationId station_id integer
     * @return Information about a station
     */
    
    public CompletableFuture<EsiResponseWrapper<StationInfo>> getStationInfo(DatasourceEnum datasource, String ifNoneMatch, int stationId) {
        String url = "https://esi.evetech.net/v2/universe/stations/{station_id}/";
        
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
        parametersInUrl.put("station_id", String.valueOf(stationId));
        String body = null;
        String method = "GET";
        TypeReference<StationInfo> responseTypeRef = new TypeReference<StationInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Returns information on requested structure if you are on the ACL. Otherwise, returns "Forbidden" for all inputs.
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param structureId An Eve structure ID
     * @return Data about a structure
     */
    
    public CompletableFuture<EsiResponseWrapper<StructureInfo>> getStructureInfo(DatasourceEnum datasource, String ifNoneMatch, long structureId) {
        String url = "https://esi.evetech.net/v2/universe/structures/{structure_id}/";
        
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
        parametersInUrl.put("structure_id", String.valueOf(structureId));
        String body = null;
        String method = "GET";
        TypeReference<StructureInfo> responseTypeRef = new TypeReference<StructureInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed
     * 
     * ---
     * 
     * This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A list of systems and number of ship, pod and NPC kills
     */
    
    public CompletableFuture<EsiResponseWrapper<List<SystemKills>>> getSystemKills(DatasourceEnum datasource, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v2/universe/system_kills/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(0);
        String body = null;
        String method = "GET";
        TypeReference<List<SystemKills>> responseTypeRef = new TypeReference<List<SystemKills>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a type
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param typeId An Eve item type ID
     * @return Information about a type
     */
    
    public CompletableFuture<EsiResponseWrapper<TypeInfo>> getTypeInfo(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch, int typeId) {
        String url = "https://esi.evetech.net/v3/universe/types/{type_id}/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("type_id", String.valueOf(typeId));
        String body = null;
        String method = "GET";
        TypeReference<TypeInfo> responseTypeRef = new TypeReference<TypeInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    /**
     * Get information on a solar system.
     * 
     * ---
     * 
     * This route expires daily at 11:05
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param systemId system_id integer
     * @return Information about a solar system
     */
    
    public CompletableFuture<EsiResponseWrapper<SystemInfo>> getSystemInfo(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch, int systemId) {
        String url = "https://esi.evetech.net/v4/universe/systems/{system_id}/";
        
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

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("system_id", String.valueOf(systemId));
        String body = null;
        String method = "GET";
        TypeReference<SystemInfo> responseTypeRef = new TypeReference<SystemInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
