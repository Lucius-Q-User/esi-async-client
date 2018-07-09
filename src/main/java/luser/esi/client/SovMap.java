package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SovMap {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer corporationId;
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    public Integer getCorporationId() {
        return corporationId;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    static SovMap fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SovMap self = new SovMap();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        return self;
    }
}
