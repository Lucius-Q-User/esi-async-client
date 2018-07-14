package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FwStats implements ApiParameterObject {
    private int lastWeek;
    /**
     * Last week's total number of kills by a given character against enemy factions
     */
    public void setLastWeek(int val) {
        lastWeek = val;
    }
    /**
     * Last week's total number of kills by a given character against enemy factions
     */
    @JsonProperty("last_week")
    public int getLastWeek() {
        return lastWeek;
    }
    private int total;
    /**
     * Total number of kills by a given character against enemy factions since the character enlisted
     */
    public void setTotal(int val) {
        total = val;
    }
    /**
     * Total number of kills by a given character against enemy factions since the character enlisted
     */
    @JsonProperty("total")
    public int getTotal() {
        return total;
    }
    private int yesterday;
    /**
     * Yesterday's total number of kills by a given character against enemy factions
     */
    public void setYesterday(int val) {
        yesterday = val;
    }
    /**
     * Yesterday's total number of kills by a given character against enemy factions
     */
    @JsonProperty("yesterday")
    public int getYesterday() {
        return yesterday;
    }
}
