package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FwCorporationLeaderboard {
    private List<FwCorporationLeaderboardEntry> activeTotal;
    /**
     * Top 10 ranking of corporations active in faction warfare by total kills. A corporation is considered "active" if they have participated in faction warfare in the past 14 days
     */
    public void setActiveTotal(List<FwCorporationLeaderboardEntry> val) {
        activeTotal = val;
    }
    /**
     * Top 10 ranking of corporations active in faction warfare by total kills. A corporation is considered "active" if they have participated in faction warfare in the past 14 days
     */
    @JsonProperty("active_total")
    public List<FwCorporationLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwCorporationLeaderboardEntry> lastWeek;
    /**
     * Top 10 ranking of corporations by kills in the past week
     */
    public void setLastWeek(List<FwCorporationLeaderboardEntry> val) {
        lastWeek = val;
    }
    /**
     * Top 10 ranking of corporations by kills in the past week
     */
    @JsonProperty("last_week")
    public List<FwCorporationLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwCorporationLeaderboardEntry> yesterday;
    /**
     * Top 10 ranking of corporations by kills in the past day
     */
    public void setYesterday(List<FwCorporationLeaderboardEntry> val) {
        yesterday = val;
    }
    /**
     * Top 10 ranking of corporations by kills in the past day
     */
    @JsonProperty("yesterday")
    public List<FwCorporationLeaderboardEntry> getYesterday() {
        return yesterday;
    }
}
