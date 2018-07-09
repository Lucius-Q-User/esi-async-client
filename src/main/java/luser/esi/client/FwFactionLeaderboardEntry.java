package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwFactionLeaderboardEntry {
    private Integer amount;
    public void setAmount(Integer val) {
        amount = val;
    }
    public Integer getAmount() {
        return amount;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    static FwFactionLeaderboardEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwFactionLeaderboardEntry self = new FwFactionLeaderboardEntry();
        Map<String, Json> js = json.asJsonMap();
        self.amount = ApiClientBase.optGetInteger(js.get("amount"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        return self;
    }
}
