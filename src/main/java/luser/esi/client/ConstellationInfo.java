package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ConstellationInfo {
    private int constellationId;
    public void setConstellationId(int val) {
        constellationId = val;
    }
    public int getConstellationId() {
        return constellationId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    public Coordinate getPosition() {
        return position;
    }
    private int regionId;
    public void setRegionId(int val) {
        regionId = val;
    }
    public int getRegionId() {
        return regionId;
    }
    private int[] systems;
    public void setSystems(int[] val) {
        systems = val;
    }
    public int[] getSystems() {
        return systems;
    }
    static ConstellationInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ConstellationInfo self = new ConstellationInfo();
        Map<String, Json> js = json.asJsonMap();
        self.constellationId = ApiClientBase.optGetInteger(js.get("constellation_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.position = Coordinate.fromJson(js.get("position"));
        self.regionId = ApiClientBase.optGetInteger(js.get("region_id"));
        {
            List<Json> jl = js.get("systems").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.systems = rt;
        }
        return self;
    }
}
