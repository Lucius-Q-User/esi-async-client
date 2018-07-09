package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class RaceInfo {
    private int allianceId;
    public void setAllianceId(int val) {
        allianceId = val;
    }
    public int getAllianceId() {
        return allianceId;
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
    private int raceId;
    public void setRaceId(int val) {
        raceId = val;
    }
    public int getRaceId() {
        return raceId;
    }
    static RaceInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        RaceInfo self = new RaceInfo();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.raceId = ApiClientBase.optGetInteger(js.get("race_id"));
        return self;
    }
}
