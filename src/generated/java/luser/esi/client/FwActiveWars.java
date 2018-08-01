package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FwActiveWars {
    private int againstId;
    /**
     * The faction ID of the enemy faction.
     */
    public void setAgainstId(int val) {
        againstId = val;
    }
    /**
     * The faction ID of the enemy faction.
     */
    @JsonProperty("against_id")
    public int getAgainstId() {
        return againstId;
    }
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
}
