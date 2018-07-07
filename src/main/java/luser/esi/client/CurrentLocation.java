package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CurrentLocation {
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Integer stationId;
    public void setStationId(Integer val) {
        stationId = val;
    }
    public Integer getStationId() {
        return stationId;
    }
    private Long structureId;
    public void setStructureId(Long val) {
        structureId = val;
    }
    public Long getStructureId() {
        return structureId;
    }
    static CurrentLocation fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CurrentLocation self = new CurrentLocation();
        Map<String, Json> js = json.asJsonMap();
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.stationId = ApiClientBase.optGetInteger(js.get("station_id"));
        self.structureId = ApiClientBase.optGetLong(js.get("structure_id"));
        return self;
    }
}
