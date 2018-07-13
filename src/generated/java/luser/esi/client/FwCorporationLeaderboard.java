package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwCorporationLeaderboard implements ApiParameterObject {
    private List<FwCorporationLeaderboardEntry> activeTotal;
    public void setActiveTotal(List<FwCorporationLeaderboardEntry> val) {
        activeTotal = val;
    }
    @JsonProperty("active_total")
    public List<FwCorporationLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwCorporationLeaderboardEntry> lastWeek;
    public void setLastWeek(List<FwCorporationLeaderboardEntry> val) {
        lastWeek = val;
    }
    @JsonProperty("last_week")
    public List<FwCorporationLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwCorporationLeaderboardEntry> yesterday;
    public void setYesterday(List<FwCorporationLeaderboardEntry> val) {
        yesterday = val;
    }
    @JsonProperty("yesterday")
    public List<FwCorporationLeaderboardEntry> getYesterday() {
        return yesterday;
    }
}
