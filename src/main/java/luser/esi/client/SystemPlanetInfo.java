package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SystemPlanetInfo {
    private int[] asteroidBelts;
    public void setAsteroidBelts(int[] val) {
        asteroidBelts = val;
    }
    public int[] getAsteroidBelts() {
        return asteroidBelts;
    }
    private int[] moons;
    public void setMoons(int[] val) {
        moons = val;
    }
    public int[] getMoons() {
        return moons;
    }
    private int planetId;
    public void setPlanetId(int val) {
        planetId = val;
    }
    public int getPlanetId() {
        return planetId;
    }
    static SystemPlanetInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SystemPlanetInfo self = new SystemPlanetInfo();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("asteroid_belts").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.asteroidBelts = rt;
        }
        {
            List<Json> jl = js.get("moons").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.moons = rt;
        }
        self.planetId = ApiClientBase.optGetInteger(js.get("planet_id"));
        return self;
    }
}
