package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterFwStats {
    private Integer currentRank;
    public void setCurrentRank(Integer val) {
        currentRank = val;
    }
    public Integer getCurrentRank() {
        return currentRank;
    }
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
    private Integer highestRank;
    public void setHighestRank(Integer val) {
        highestRank = val;
    }
    public Integer getHighestRank() {
        return highestRank;
    }
    private FwStats kills;
    public void setKills(FwStats val) {
        kills = val;
    }
    public FwStats getKills() {
        return kills;
    }
    private FwStats victoryPoints;
    public void setVictoryPoints(FwStats val) {
        victoryPoints = val;
    }
    public FwStats getVictoryPoints() {
        return victoryPoints;
    }
    static CharacterFwStats fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterFwStats self = new CharacterFwStats();
        Map<String, Json> js = json.asJsonMap();
        self.currentRank = ApiClientBase.optGetInteger(js.get("current_rank"));
        self.enlistedOn = ApiClientBase.optGetInstant(js.get("enlisted_on"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.highestRank = ApiClientBase.optGetInteger(js.get("highest_rank"));
        self.kills = FwStats.fromJson(js.get("kills"));
        self.victoryPoints = FwStats.fromJson(js.get("victory_points"));
        return self;
    }
}
