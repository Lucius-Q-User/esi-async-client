package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwFactionLeaderboard implements ApiParameterObject {
    private List<FwFactionLeaderboardEntry> activeTotal;
    public void setActiveTotal(List<FwFactionLeaderboardEntry> val) {
        activeTotal = val;
    }
    @JsonProperty("active_total")
    public List<FwFactionLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwFactionLeaderboardEntry> lastWeek;
    public void setLastWeek(List<FwFactionLeaderboardEntry> val) {
        lastWeek = val;
    }
    @JsonProperty("last_week")
    public List<FwFactionLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwFactionLeaderboardEntry> yesterday;
    public void setYesterday(List<FwFactionLeaderboardEntry> val) {
        yesterday = val;
    }
    @JsonProperty("yesterday")
    public List<FwFactionLeaderboardEntry> getYesterday() {
        return yesterday;
    }
}
