package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwCorporationLeaderboardEntry {
    private Integer amount;
    public void setAmount(Integer val) {
        amount = val;
    }
    public Integer getAmount() {
        return amount;
    }
    private Integer corporationId;
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    public Integer getCorporationId() {
        return corporationId;
    }
    static FwCorporationLeaderboardEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwCorporationLeaderboardEntry self = new FwCorporationLeaderboardEntry();
        Map<String, Json> js = json.asJsonMap();
        self.amount = ApiClientBase.optGetInteger(js.get("amount"));
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        return self;
    }
}
