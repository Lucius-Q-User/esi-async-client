package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class IsurancePrices {
    private float cost;
    public void setCost(float val) {
        cost = val;
    }
    public float getCost() {
        return cost;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private float payout;
    public void setPayout(float val) {
        payout = val;
    }
    public float getPayout() {
        return payout;
    }
    static IsurancePrices fromJson(Json json) {
        if (json == null) {
            return null;
        }
        IsurancePrices self = new IsurancePrices();
        Map<String, Json> js = json.asJsonMap();
        self.cost = ApiClientBase.optGetFloat(js.get("cost"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.payout = ApiClientBase.optGetFloat(js.get("payout"));
        return self;
    }
}
