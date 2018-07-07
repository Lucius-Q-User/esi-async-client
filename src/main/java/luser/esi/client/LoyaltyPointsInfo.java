package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class LoyaltyPointsInfo {
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    public int getCorporationId() {
        return corporationId;
    }
    private int loyaltyPoints;
    public void setLoyaltyPoints(int val) {
        loyaltyPoints = val;
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    static LoyaltyPointsInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        LoyaltyPointsInfo self = new LoyaltyPointsInfo();
        Map<String, Json> js = json.asJsonMap();
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.loyaltyPoints = ApiClientBase.optGetInteger(js.get("loyalty_points"));
        return self;
    }
}
