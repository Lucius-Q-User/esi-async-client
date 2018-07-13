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
    /**
     * The given character's current faction rank
     */
    public void setCurrentRank(Integer val) {
        currentRank = val;
    }
    /**
     * The given character's current faction rank
     */
    @JsonProperty("current_rank")
    public Integer getCurrentRank() {
        return currentRank;
    }
    private Instant enlistedOn;
    /**
     * The enlistment date of the given character into faction warfare. Will not be included if character is not enlisted in faction warfare
     */
    public void setEnlistedOn(Instant val) {
        enlistedOn = val;
    }
    /**
     * The enlistment date of the given character into faction warfare. Will not be included if character is not enlisted in faction warfare
     */
    @JsonProperty("enlisted_on")
    public Instant getEnlistedOn() {
        return enlistedOn;
    }
    private Integer factionId;
    /**
     * The faction the given character is enlisted to fight for. Will not be included if character is not enlisted in faction warfare
     */
    public void setFactionId(Integer val) {
        factionId = val;
    }
    /**
     * The faction the given character is enlisted to fight for. Will not be included if character is not enlisted in faction warfare
     */
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private Integer highestRank;
    /**
     * The given character's highest faction rank achieved
     */
    public void setHighestRank(Integer val) {
        highestRank = val;
    }
    /**
     * The given character's highest faction rank achieved
     */
    @JsonProperty("highest_rank")
    public Integer getHighestRank() {
        return highestRank;
    }
    private FwStats kills;
    /**
     * Summary of kills done by the given character against enemy factions
     */
    public void setKills(FwStats val) {
        kills = val;
    }
    /**
     * Summary of kills done by the given character against enemy factions
     */
    @JsonProperty("kills")
    public FwStats getKills() {
        return kills;
    }
    private FwStats victoryPoints;
    /**
     * Summary of victory points gained by the given character for the enlisted faction
     */
    public void setVictoryPoints(FwStats val) {
        victoryPoints = val;
    }
    /**
     * Summary of victory points gained by the given character for the enlisted faction
     */
    @JsonProperty("victory_points")
    public FwStats getVictoryPoints() {
        return victoryPoints;
    }
}
