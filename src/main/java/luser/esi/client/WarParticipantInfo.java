package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class WarParticipantInfo {
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
    private float iskDestroyed;
    public void setIskDestroyed(float val) {
        iskDestroyed = val;
    }
    public float getIskDestroyed() {
        return iskDestroyed;
    }
    private int shipsKilled;
    public void setShipsKilled(int val) {
        shipsKilled = val;
    }
    public int getShipsKilled() {
        return shipsKilled;
    }
    static WarParticipantInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        WarParticipantInfo self = new WarParticipantInfo();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.iskDestroyed = ApiClientBase.optGetFloat(js.get("isk_destroyed"));
        self.shipsKilled = ApiClientBase.optGetInteger(js.get("ships_killed"));
        return self;
    }
}
