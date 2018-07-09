package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwCharacterLeaderboard {
    private List<FwCharacterLeaderboardEntry> activeTotal;
    public void setActiveTotal(List<FwCharacterLeaderboardEntry> val) {
        activeTotal = val;
    }
    public List<FwCharacterLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwCharacterLeaderboardEntry> lastWeek;
    public void setLastWeek(List<FwCharacterLeaderboardEntry> val) {
        lastWeek = val;
    }
    public List<FwCharacterLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwCharacterLeaderboardEntry> yesterday;
    public void setYesterday(List<FwCharacterLeaderboardEntry> val) {
        yesterday = val;
    }
    public List<FwCharacterLeaderboardEntry> getYesterday() {
        return yesterday;
    }
    static FwCharacterLeaderboard fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwCharacterLeaderboard self = new FwCharacterLeaderboard();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("active_total").asJsonList();
            List<FwCharacterLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(FwCharacterLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.activeTotal = rt;
        }
        {
            List<Json> jl = js.get("last_week").asJsonList();
            List<FwCharacterLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(FwCharacterLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.lastWeek = rt;
        }
        {
            List<Json> jl = js.get("yesterday").asJsonList();
            List<FwCharacterLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(FwCharacterLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.yesterday = rt;
        }
        return self;
    }
}
