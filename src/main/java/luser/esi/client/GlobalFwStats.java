package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class GlobalFwStats {
    private int factionId;
    public void setFactionId(int val) {
        factionId = val;
    }
    public int getFactionId() {
        return factionId;
    }
    private FwStats kills;
    public void setKills(FwStats val) {
        kills = val;
    }
    public FwStats getKills() {
        return kills;
    }
    private int pilots;
    public void setPilots(int val) {
        pilots = val;
    }
    public int getPilots() {
        return pilots;
    }
    private int systemsControlled;
    public void setSystemsControlled(int val) {
        systemsControlled = val;
    }
    public int getSystemsControlled() {
        return systemsControlled;
    }
    private FwStats victoryPoints;
    public void setVictoryPoints(FwStats val) {
        victoryPoints = val;
    }
    public FwStats getVictoryPoints() {
        return victoryPoints;
    }
    static GlobalFwStats fromJson(Json json) {
        if (json == null) {
            return null;
        }
        GlobalFwStats self = new GlobalFwStats();
        Map<String, Json> js = json.asJsonMap();
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.kills = FwStats.fromJson(js.get("kills"));
        self.pilots = ApiClientBase.optGetInteger(js.get("pilots"));
        self.systemsControlled = ApiClientBase.optGetInteger(js.get("systems_controlled"));
        self.victoryPoints = FwStats.fromJson(js.get("victory_points"));
        return self;
    }
}
