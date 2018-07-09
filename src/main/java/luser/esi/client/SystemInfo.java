package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SystemInfo {
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
    private List<SystemPlanetInfo> planets;
    public void setPlanets(List<SystemPlanetInfo> val) {
        planets = val;
    }
    public List<SystemPlanetInfo> getPlanets() {
        return planets;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    public Coordinate getPosition() {
        return position;
    }
    private String securityClass;
    public void setSecurityClass(String val) {
        securityClass = val;
    }
    public String getSecurityClass() {
        return securityClass;
    }
    private float securityStatus;
    public void setSecurityStatus(float val) {
        securityStatus = val;
    }
    public float getSecurityStatus() {
        return securityStatus;
    }
    private Integer starId;
    public void setStarId(Integer val) {
        starId = val;
    }
    public Integer getStarId() {
        return starId;
    }
    private int[] stargates;
    public void setStargates(int[] val) {
        stargates = val;
    }
    public int[] getStargates() {
        return stargates;
    }
    private int[] stations;
    public void setStations(int[] val) {
        stations = val;
    }
    public int[] getStations() {
        return stations;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    static SystemInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SystemInfo self = new SystemInfo();
        Map<String, Json> js = json.asJsonMap();
        self.constellationId = ApiClientBase.optGetInteger(js.get("constellation_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        {
            List<Json> jl = js.get("planets").asJsonList();
            List<SystemPlanetInfo> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(SystemPlanetInfo.fromJson(jl.get(i)));
            }
            self.planets = rt;
        }
        self.position = Coordinate.fromJson(js.get("position"));
        self.securityClass = ApiClientBase.optGetString(js.get("security_class"));
        self.securityStatus = ApiClientBase.optGetFloat(js.get("security_status"));
        self.starId = ApiClientBase.optGetInteger(js.get("star_id"));
        {
            List<Json> jl = js.get("stargates").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.stargates = rt;
        }
        {
            List<Json> jl = js.get("stations").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.stations = rt;
        }
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        return self;
    }
}
