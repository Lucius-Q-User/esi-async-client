package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwCorporationLeaderboard {
    private List<FwCorporationLeaderboardEntry> activeTotal;
    public void setActiveTotal(List<FwCorporationLeaderboardEntry> val) {
        activeTotal = val;
    }
    public List<FwCorporationLeaderboardEntry> getActiveTotal() {
        return activeTotal;
    }
    private List<FwCorporationLeaderboardEntry> lastWeek;
    public void setLastWeek(List<FwCorporationLeaderboardEntry> val) {
        lastWeek = val;
    }
    public List<FwCorporationLeaderboardEntry> getLastWeek() {
        return lastWeek;
    }
    private List<FwCorporationLeaderboardEntry> yesterday;
    public void setYesterday(List<FwCorporationLeaderboardEntry> val) {
        yesterday = val;
    }
    public List<FwCorporationLeaderboardEntry> getYesterday() {
        return yesterday;
    }
    static FwCorporationLeaderboard fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwCorporationLeaderboard self = new FwCorporationLeaderboard();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("active_total").asJsonList();
            List<FwCorporationLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, FwCorporationLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.activeTotal = rt;
        }

        {
            List<Json> jl = js.get("last_week").asJsonList();
            List<FwCorporationLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, FwCorporationLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.lastWeek = rt;
        }

        {
            List<Json> jl = js.get("yesterday").asJsonList();
            List<FwCorporationLeaderboardEntry> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, FwCorporationLeaderboardEntry.fromJson(jl.get(i)));
            }
            self.yesterday = rt;
        }

        return self;
    }
}
