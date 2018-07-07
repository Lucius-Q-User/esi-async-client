package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwFactionLeaderboard {
    private List<FwFactionLeaderboardEntry> activeTotal;
    public void setActiveTotal(List<FwFactionLeaderboardEntry> val) {
        activeTotal = val;
    }
    public List<FwFactionLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwFactionLeaderboardEntry> lastWeek;
    public void setLastWeek(List<FwFactionLeaderboardEntry> val) {
        lastWeek = val;
    }
    public List<FwFactionLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwFactionLeaderboardEntry> yesterday;
    public void setYesterday(List<FwFactionLeaderboardEntry> val) {
        yesterday = val;
    }
    public List<FwFactionLeaderboardEntry> getYesterday() {
        return yesterday;
    }
    static FwFactionLeaderboard fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwFactionLeaderboard self = new FwFactionLeaderboard();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("active_total").asJsonList();
            List<FwFactionLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, FwFactionLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.activeTotal = rt;
        }

        {
            List<Json> jl = js.get("last_week").asJsonList();
            List<FwFactionLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, FwFactionLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.lastWeek = rt;
        }

        {
            List<Json> jl = js.get("yesterday").asJsonList();
            List<FwFactionLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, FwFactionLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.yesterday = rt;
        }

        return self;
    }
}
