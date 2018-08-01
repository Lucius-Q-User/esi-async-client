package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FwFactionLeaderboardEntry {
    private Integer amount;
    /**
     * Amount of kills
     */
    public void setAmount(Integer val) {
        amount = val;
    }
    /**
     * Amount of kills
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }
    private Integer factionId;
    /**
     * faction_id integer
     */
    public void setFactionId(Integer val) {
        factionId = val;
    }
    /**
     * faction_id integer
     */
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
}
