package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class UniverseFaction {
    private Integer corporationId;
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    public Integer getCorporationId() {
        return corporationId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private int factionId;
    public void setFactionId(int val) {
        factionId = val;
    }
    public int getFactionId() {
        return factionId;
    }
    private boolean isUnique;
    public void setIsUnique(boolean val) {
        isUnique = val;
    }
    public boolean getIsUnique() {
        return isUnique;
    }
    private Integer militiaCorporationId;
    public void setMilitiaCorporationId(Integer val) {
        militiaCorporationId = val;
    }
    public Integer getMilitiaCorporationId() {
        return militiaCorporationId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private float sizeFactor;
    public void setSizeFactor(float val) {
        sizeFactor = val;
    }
    public float getSizeFactor() {
        return sizeFactor;
    }
    private Integer solarSystemId;
    public void setSolarSystemId(Integer val) {
        solarSystemId = val;
    }
    public Integer getSolarSystemId() {
        return solarSystemId;
    }
    private int stationCount;
    public void setStationCount(int val) {
        stationCount = val;
    }
    public int getStationCount() {
        return stationCount;
    }
    private int stationSystemCount;
    public void setStationSystemCount(int val) {
        stationSystemCount = val;
    }
    public int getStationSystemCount() {
        return stationSystemCount;
    }
    static UniverseFaction fromJson(Json json) {
        if (json == null) {
            return null;
        }
        UniverseFaction self = new UniverseFaction();
        Map<String, Json> js = json.asJsonMap();
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.isUnique = ApiClientBase.optGetBoolean(js.get("is_unique"));
        self.militiaCorporationId = ApiClientBase.optGetInteger(js.get("militia_corporation_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.sizeFactor = ApiClientBase.optGetFloat(js.get("size_factor"));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.stationCount = ApiClientBase.optGetInteger(js.get("station_count"));
        self.stationSystemCount = ApiClientBase.optGetInteger(js.get("station_system_count"));
        return self;
    }
}
