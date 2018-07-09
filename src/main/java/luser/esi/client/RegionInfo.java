package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class RegionInfo {
    private int[] constellations;
    public void setConstellations(int[] val) {
        constellations = val;
    }
    public int[] getConstellations() {
        return constellations;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private int regionId;
    public void setRegionId(int val) {
        regionId = val;
    }
    public int getRegionId() {
        return regionId;
    }
    static RegionInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        RegionInfo self = new RegionInfo();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("constellations").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.constellations = rt;
        }
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.regionId = ApiClientBase.optGetInteger(js.get("region_id"));
        return self;
    }
}
