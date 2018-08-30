package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FwFactionLeaderboard {
    private List<FwFactionLeaderboardEntry> activeTotal;
    /**
     * Top 4 ranking of factions active in faction warfare by total kills. A faction is considered "active" if they have participated in faction warfare in the past 14 days
     */
    public void setActiveTotal(List<FwFactionLeaderboardEntry> val) {
        activeTotal = val;
    }
    /**
     * Top 4 ranking of factions active in faction warfare by total kills. A faction is considered "active" if they have participated in faction warfare in the past 14 days
     */
    @JsonProperty("active_total")
    public List<FwFactionLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwFactionLeaderboardEntry> lastWeek;
    /**
     * Top 4 ranking of factions by kills in the past week
     */
    public void setLastWeek(List<FwFactionLeaderboardEntry> val) {
        lastWeek = val;
    }
    /**
     * Top 4 ranking of factions by kills in the past week
     */
    @JsonProperty("last_week")
    public List<FwFactionLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwFactionLeaderboardEntry> yesterday;
    /**
     * Top 4 ranking of factions by kills in the past day
     */
    public void setYesterday(List<FwFactionLeaderboardEntry> val) {
        yesterday = val;
    }
    /**
     * Top 4 ranking of factions by kills in the past day
     */
    @JsonProperty("yesterday")
    public List<FwFactionLeaderboardEntry> getYesterday() {
        return yesterday;
    }
}
