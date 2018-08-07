package luser.esi.client;

import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class UniverseApiImpl implements UniverseApi {
    private ApiClient apiClient;
    UniverseApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<AncestryInfo>>> getAncestries(AcceptLanguageEnum acceptLanguage, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/ancestries/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<AncestryInfo>> responseTypeRef = new TypeReference<List<AncestryInfo>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<AsteroidBeltInfo>> getAsteroidBeltInfo(int asteroidBeltId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/asteroid_belts/" + asteroidBeltId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<AsteroidBeltInfo> responseTypeRef = new TypeReference<AsteroidBeltInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<BloodlineInfo>>> getBloodlines(AcceptLanguageEnum acceptLanguage, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/bloodlines/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<BloodlineInfo>> responseTypeRef = new TypeReference<List<BloodlineInfo>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getCategories(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/categories/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<ItemCategoryInfo>> getCategoryInfo(AcceptLanguageEnum acceptLanguage, int categoryId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/categories/" + categoryId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<ItemCategoryInfo> responseTypeRef = new TypeReference<ItemCategoryInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getConstellations(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/constellations/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<ConstellationInfo>> getConstellationInfo(AcceptLanguageEnum acceptLanguage, int constellationId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/constellations/" + constellationId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<ConstellationInfo> responseTypeRef = new TypeReference<ConstellationInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getGraphics(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/graphics/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<GhaphicInfo>> getGraphicInfo(int graphicId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/graphics/" + graphicId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<GhaphicInfo> responseTypeRef = new TypeReference<GhaphicInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getGroups(String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/universe/groups/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<ItemGroupInfo>> getGroupInfo(AcceptLanguageEnum acceptLanguage, int groupId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/groups/" + groupId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<ItemGroupInfo> responseTypeRef = new TypeReference<ItemGroupInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<ResolvedItemId>> resolveIds(AcceptLanguageEnum acceptLanguage, List<String> names) {         
        String url = "https://esi.evetech.net/v1/universe/ids/";
        RequestBuilder builder = Dsl.post(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        builder.setBody(ApiClientBase.renderToBody(names));
        TypeReference<ResolvedItemId> responseTypeRef = new TypeReference<ResolvedItemId>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<MoonInfo>> getMoonInfo(String ifNoneMatch, int moonId) {         
        String url = "https://esi.evetech.net/v1/universe/moons/" + moonId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<MoonInfo> responseTypeRef = new TypeReference<MoonInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<UniversePlanetInfo>> getPlanetInfo(String ifNoneMatch, int planetId) {         
        String url = "https://esi.evetech.net/v1/universe/planets/" + planetId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<UniversePlanetInfo> responseTypeRef = new TypeReference<UniversePlanetInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<RaceInfo>>> getRaces(AcceptLanguageEnum acceptLanguage, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/races/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<RaceInfo>> responseTypeRef = new TypeReference<List<RaceInfo>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getRegions(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/regions/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<RegionInfo>> getRegionInfo(AcceptLanguageEnum acceptLanguage, String ifNoneMatch, int regionId) {         
        String url = "https://esi.evetech.net/v1/universe/regions/" + regionId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<RegionInfo> responseTypeRef = new TypeReference<RegionInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<StargateInfo>> getStargateInfo(String ifNoneMatch, int stargateId) {         
        String url = "https://esi.evetech.net/v1/universe/stargates/" + stargateId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<StargateInfo> responseTypeRef = new TypeReference<StargateInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<StarInfo>> getStarInfo(String ifNoneMatch, int starId) {         
        String url = "https://esi.evetech.net/v1/universe/stars/" + starId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<StarInfo> responseTypeRef = new TypeReference<StarInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<LongArrayList>> getStructures(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/structures/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<LongArrayList> responseTypeRef = new TypeReference<LongArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<SystemJumps>>> getSystemJumps(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/system_jumps/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<SystemJumps>> responseTypeRef = new TypeReference<List<SystemJumps>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getSystems(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/universe/systems/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<IntArrayList>> getTypes(String ifNoneMatch, Integer page) {         
        String url = "https://esi.evetech.net/v1/universe/types/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (page != null) {
            String val = String.valueOf(page);
            builder.addQueryParam("page", val);
        }
        TypeReference<IntArrayList> responseTypeRef = new TypeReference<IntArrayList>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<UniverseFaction>>> getFactions(AcceptLanguageEnum acceptLanguage, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v2/universe/factions/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<UniverseFaction>> responseTypeRef = new TypeReference<List<UniverseFaction>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<ResolvedItemName>>> resolveNames(IntArrayList ids) {         
        String url = "https://esi.evetech.net/v2/universe/names/";
        RequestBuilder builder = Dsl.post(url);

        builder.setBody(ApiClientBase.renderToBody(ids));
        TypeReference<List<ResolvedItemName>> responseTypeRef = new TypeReference<List<ResolvedItemName>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<StationInfo>> getStationInfo(String ifNoneMatch, int stationId) {         
        String url = "https://esi.evetech.net/v2/universe/stations/" + stationId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<StationInfo> responseTypeRef = new TypeReference<StationInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<StructureInfo>> getStructureInfo(String ifNoneMatch, long structureId) {         
        String url = "https://esi.evetech.net/v2/universe/structures/" + structureId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<StructureInfo> responseTypeRef = new TypeReference<StructureInfo>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<SystemKills>>> getSystemKills(String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v2/universe/system_kills/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<SystemKills>> responseTypeRef = new TypeReference<List<SystemKills>>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<TypeInfo>> getTypeInfo(AcceptLanguageEnum acceptLanguage, String ifNoneMatch, int typeId) {         
        String url = "https://esi.evetech.net/v3/universe/types/" + typeId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<TypeInfo> responseTypeRef = new TypeReference<TypeInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<SystemInfo>> getSystemInfo(AcceptLanguageEnum acceptLanguage, String ifNoneMatch, int systemId) {         
        String url = "https://esi.evetech.net/v4/universe/systems/" + systemId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (acceptLanguage != null) {
            String val = acceptLanguage.stringValue;
            builder.addHeader("Accept-Language", val);
        }
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<SystemInfo> responseTypeRef = new TypeReference<SystemInfo>() {};
        boolean needsAuth = false;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
