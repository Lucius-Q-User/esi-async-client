package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationFwStatsResponse implements ApiParameterObject {
    private Instant enlistedOn;
    public void setEnlistedOn(Instant val) {
        enlistedOn = val;
    }
    @JsonProperty("enlisted_on")
    public Instant getEnlistedOn() {
        return enlistedOn;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private FwStats kills;
    public void setKills(FwStats val) {
        kills = val;
    }
    @JsonProperty("kills")
    public FwStats getKills() {
        return kills;
    }
    private Integer pilots;
    public void setPilots(Integer val) {
        pilots = val;
    }
    @JsonProperty("pilots")
    public Integer getPilots() {
        return pilots;
    }
    private FwStats victoryPoints;
    public void setVictoryPoints(FwStats val) {
        victoryPoints = val;
    }
    @JsonProperty("victory_points")
    public FwStats getVictoryPoints() {
        return victoryPoints;
    }
}
