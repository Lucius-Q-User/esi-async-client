package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwStats {
    private int lastWeek;
    public void setLastWeek(int val) {
        lastWeek = val;
    }
    public int getLastWeek() {
        return lastWeek;
    }
    private int total;
    public void setTotal(int val) {
        total = val;
    }
    public int getTotal() {
        return total;
    }
    private int yesterday;
    public void setYesterday(int val) {
        yesterday = val;
    }
    public int getYesterday() {
        return yesterday;
    }
    static FwStats fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwStats self = new FwStats();
        Map<String, Json> js = json.asJsonMap();
        self.lastWeek = ApiClientBase.optGetInteger(js.get("last_week"));
        self.total = ApiClientBase.optGetInteger(js.get("total"));
        self.yesterday = ApiClientBase.optGetInteger(js.get("yesterday"));
        return self;
    }
}
