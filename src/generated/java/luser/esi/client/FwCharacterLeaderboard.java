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
public class FwCharacterLeaderboard implements ApiParameterObject {
    private List<FwCharacterLeaderboardEntry> activeTotal;
    /**
     * Top 100 ranking of pilots active in faction warfare by total kills. A pilot is considered "active" if they have participated in faction warfare in the past 14 days.
     */
    public void setActiveTotal(List<FwCharacterLeaderboardEntry> val) {
        activeTotal = val;
    }
    /**
     * Top 100 ranking of pilots active in faction warfare by total kills. A pilot is considered "active" if they have participated in faction warfare in the past 14 days.
     */
    @JsonProperty("active_total")
    public List<FwCharacterLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwCharacterLeaderboardEntry> lastWeek;
    /**
     * Top 100 ranking of pilots by kills in the past week
     */
    public void setLastWeek(List<FwCharacterLeaderboardEntry> val) {
        lastWeek = val;
    }
    /**
     * Top 100 ranking of pilots by kills in the past week
     */
    @JsonProperty("last_week")
    public List<FwCharacterLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwCharacterLeaderboardEntry> yesterday;
    /**
     * Top 100 ranking of pilots by kills in the past day
     */
    public void setYesterday(List<FwCharacterLeaderboardEntry> val) {
        yesterday = val;
    }
    /**
     * Top 100 ranking of pilots by kills in the past day
     */
    @JsonProperty("yesterday")
    public List<FwCharacterLeaderboardEntry> getYesterday() {
        return yesterday;
    }
}
