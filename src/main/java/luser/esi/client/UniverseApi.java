package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class UniverseApi {
    private ApiClient apiClient;
    UniverseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<AncestryInfo>>> getUniverseAncestries(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, List<AncestryInfo>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<AncestryInfo> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(AncestryInfo.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<AsteroidBeltInfo>> getUniverseAsteroidBeltsAsteroidBeltId(int asteroidBeltId, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, AsteroidBeltInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return AsteroidBeltInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<BloodlineInfo>>> getUniverseBloodlines(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, List<BloodlineInfo>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<BloodlineInfo> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(BloodlineInfo.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getUniverseCategories(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<ItemCategoryInfo>> getUniverseCategoriesCategoryId(AcceptLanguageEnum acceptLanguage, int categoryId, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, ItemCategoryInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return ItemCategoryInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getUniverseConstellations(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<ConstellationInfo>> getUniverseConstellationsConstellationId(AcceptLanguageEnum acceptLanguage, int constellationId, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, ConstellationInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return ConstellationInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getUniverseGraphics(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<GhaphicInfo>> getUniverseGraphicsGraphicId(DatasourceEnum datasource, int graphicId, String ifNoneMatch) {
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
        Function<String, GhaphicInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return GhaphicInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getUniverseGroups(DatasourceEnum datasource, String ifNoneMatch, Integer page) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<ItemGroupInfo>> getUniverseGroupsGroupId(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, int groupId, String ifNoneMatch) {
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
        Function<String, ItemGroupInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return ItemGroupInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<ResolvedItemId>> postUniverseIds(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, List<String> names) {
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
        Function<String, ResolvedItemId> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return ResolvedItemId.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<MoonInfo>> getUniverseMoonsMoonId(DatasourceEnum datasource, String ifNoneMatch, int moonId) {
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
        Function<String, MoonInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return MoonInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<UniversePlanetInfo>> getUniversePlanetsPlanetId(DatasourceEnum datasource, String ifNoneMatch, int planetId) {
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
        Function<String, UniversePlanetInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return UniversePlanetInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<RaceInfo>>> getUniverseRaces(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, List<RaceInfo>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<RaceInfo> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(RaceInfo.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getUniverseRegions(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<RegionInfo>> getUniverseRegionsRegionId(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch, int regionId) {
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
        Function<String, RegionInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return RegionInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<StargateInfo>> getUniverseStargatesStargateId(DatasourceEnum datasource, String ifNoneMatch, int stargateId) {
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
        Function<String, StargateInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return StargateInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<StarInfo>> getUniverseStarsStarId(DatasourceEnum datasource, String ifNoneMatch, int starId) {
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
        Function<String, StarInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return StarInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<long[]>> getUniverseStructures(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, long[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            long[] ret = new long[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asLong();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<StructureInfo>> getUniverseStructuresStructureId(DatasourceEnum datasource, String ifNoneMatch, long structureId) {
        String url = "https://esi.evetech.net/v1/universe/structures/{structure_id}/";
        
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
        Function<String, StructureInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return StructureInfo.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<SystemJumps>>> getUniverseSystemJumps(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, List<SystemJumps>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<SystemJumps> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(SystemJumps.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getUniverseSystems(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<int[]>> getUniverseTypes(DatasourceEnum datasource, String ifNoneMatch, Integer page) {
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
        Function<String, int[]> responseParser = (resp) -> {
            List<Json> json = Json.read(resp).asJsonList();
            int[] ret = new int[json.size()];
            for (int i = 0; i < json.size(); i++) {
                ret[i] = json.get(i).asInteger();
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<UniverseFaction>>> getUniverseFactions(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, List<UniverseFaction>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<UniverseFaction> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(UniverseFaction.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemName>>> postUniverseNames(DatasourceEnum datasource, int[] ids) {
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
        Function<String, List<ResolvedItemName>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<ResolvedItemName> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(ResolvedItemName.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<StationInfo>> getUniverseStationsStationId(DatasourceEnum datasource, String ifNoneMatch, int stationId) {
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
        Function<String, StationInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return StationInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<SystemKills>>> getUniverseSystemKills(DatasourceEnum datasource, String ifNoneMatch) {
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
        Function<String, List<SystemKills>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<SystemKills> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(SystemKills.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<SystemInfo>> getUniverseSystemsSystemId(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch, int systemId) {
        String url = "https://esi.evetech.net/v3/universe/systems/{system_id}/";
        
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
        Function<String, SystemInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return SystemInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<TypeInfo>> getUniverseTypesTypeId(AcceptLanguageEnum acceptLanguage, DatasourceEnum datasource, String ifNoneMatch, int typeId) {
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
        Function<String, TypeInfo> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return TypeInfo.fromJson(js);
        };
        boolean needsAuth = false;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
