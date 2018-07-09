package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationFwStatsResponse {
    private Instant enlistedOn;
    public void setEnlistedOn(Instant val) {
        enlistedOn = val;
    }
    public Instant getEnlistedOn() {
        return enlistedOn;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    private FwStats kills;
    public void setKills(FwStats val) {
        kills = val;
    }
    public FwStats getKills() {
        return kills;
    }
    private Integer pilots;
    public void setPilots(Integer val) {
        pilots = val;
    }
    public Integer getPilots() {
        return pilots;
    }
    private FwStats victoryPoints;
    public void setVictoryPoints(FwStats val) {
        victoryPoints = val;
    }
    public FwStats getVictoryPoints() {
        return victoryPoints;
    }
    static CorporationFwStatsResponse fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationFwStatsResponse self = new CorporationFwStatsResponse();
        Map<String, Json> js = json.asJsonMap();
        self.enlistedOn = ApiClientBase.optGetInstant(js.get("enlisted_on"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.kills = FwStats.fromJson(js.get("kills"));
        self.pilots = ApiClientBase.optGetInteger(js.get("pilots"));
        self.victoryPoints = FwStats.fromJson(js.get("victory_points"));
        return self;
    }
}
