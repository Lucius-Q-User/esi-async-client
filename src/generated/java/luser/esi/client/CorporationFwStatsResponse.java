package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationFwStatsResponse implements ApiParameterObject {
    private Instant enlistedOn;
    /**
     * The enlistment date of the given corporation into faction warfare. Will not be included if corporation is not enlisted in faction warfare
     */
    public void setEnlistedOn(Instant val) {
        enlistedOn = val;
    }
    /**
     * The enlistment date of the given corporation into faction warfare. Will not be included if corporation is not enlisted in faction warfare
     */
    @JsonProperty("enlisted_on")
    public Instant getEnlistedOn() {
        return enlistedOn;
    }
    private Integer factionId;
    /**
     * The faction the given corporation is enlisted to fight for. Will not be included if corporation is not enlisted in faction warfare
     */
    public void setFactionId(Integer val) {
        factionId = val;
    }
    /**
     * The faction the given corporation is enlisted to fight for. Will not be included if corporation is not enlisted in faction warfare
     */
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private FwStats kills;
    /**
     * Summary of kills done by the given corporation against enemy factions
     */
    public void setKills(FwStats val) {
        kills = val;
    }
    /**
     * Summary of kills done by the given corporation against enemy factions
     */
    @JsonProperty("kills")
    public FwStats getKills() {
        return kills;
    }
    private Integer pilots;
    /**
     * How many pilots the enlisted corporation has. Will not be included if corporation is not enlisted in faction warfare
     */
    public void setPilots(Integer val) {
        pilots = val;
    }
    /**
     * How many pilots the enlisted corporation has. Will not be included if corporation is not enlisted in faction warfare
     */
    @JsonProperty("pilots")
    public Integer getPilots() {
        return pilots;
    }
    private FwStats victoryPoints;
    /**
     * Summary of victory points gained by the given corporation for the enlisted faction
     */
    public void setVictoryPoints(FwStats val) {
        victoryPoints = val;
    }
    /**
     * Summary of victory points gained by the given corporation for the enlisted faction
     */
    @JsonProperty("victory_points")
    public FwStats getVictoryPoints() {
        return victoryPoints;
    }
}
