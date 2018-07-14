package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobalFwStats implements ApiParameterObject {
    private int factionId;
    /**
     * faction_id integer
     */
    public void setFactionId(int val) {
        factionId = val;
    }
    /**
     * faction_id integer
     */
    @JsonProperty("faction_id")
    public int getFactionId() {
        return factionId;
    }
    private FwStats kills;
    /**
     * Summary of kills against an enemy faction for the given faction
     */
    public void setKills(FwStats val) {
        kills = val;
    }
    /**
     * Summary of kills against an enemy faction for the given faction
     */
    @JsonProperty("kills")
    public FwStats getKills() {
        return kills;
    }
    private int pilots;
    /**
     * How many pilots fight for the given faction
     */
    public void setPilots(int val) {
        pilots = val;
    }
    /**
     * How many pilots fight for the given faction
     */
    @JsonProperty("pilots")
    public int getPilots() {
        return pilots;
    }
    private int systemsControlled;
    /**
     * The number of solar systems controlled by the given faction
     */
    public void setSystemsControlled(int val) {
        systemsControlled = val;
    }
    /**
     * The number of solar systems controlled by the given faction
     */
    @JsonProperty("systems_controlled")
    public int getSystemsControlled() {
        return systemsControlled;
    }
    private FwStats victoryPoints;
    /**
     * Summary of victory points gained for the given faction
     */
    public void setVictoryPoints(FwStats val) {
        victoryPoints = val;
    }
    /**
     * Summary of victory points gained for the given faction
     */
    @JsonProperty("victory_points")
    public FwStats getVictoryPoints() {
        return victoryPoints;
    }
}
