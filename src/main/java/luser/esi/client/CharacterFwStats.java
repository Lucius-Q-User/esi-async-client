package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterFwStats implements ApiParameterObject {
    private Integer currentRank;
    public void setCurrentRank(Integer val) {
        currentRank = val;
    }
    @JsonProperty("current_rank")
    public Integer getCurrentRank() {
        return currentRank;
    }
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
    private Integer highestRank;
    public void setHighestRank(Integer val) {
        highestRank = val;
    }
    @JsonProperty("highest_rank")
    public Integer getHighestRank() {
        return highestRank;
    }
    private FwStats kills;
    public void setKills(FwStats val) {
        kills = val;
    }
    @JsonProperty("kills")
    public FwStats getKills() {
        return kills;
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
