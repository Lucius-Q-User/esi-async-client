package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwCharacterLeaderboard implements ApiParameterObject {
    private List<FwCharacterLeaderboardEntry> activeTotal;
    public void setActiveTotal(List<FwCharacterLeaderboardEntry> val) {
        activeTotal = val;
    }
    @JsonProperty("active_total")
    public List<FwCharacterLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwCharacterLeaderboardEntry> lastWeek;
    public void setLastWeek(List<FwCharacterLeaderboardEntry> val) {
        lastWeek = val;
    }
    @JsonProperty("last_week")
    public List<FwCharacterLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwCharacterLeaderboardEntry> yesterday;
    public void setYesterday(List<FwCharacterLeaderboardEntry> val) {
        yesterday = val;
    }
    @JsonProperty("yesterday")
    public List<FwCharacterLeaderboardEntry> getYesterday() {
        return yesterday;
    }
}
