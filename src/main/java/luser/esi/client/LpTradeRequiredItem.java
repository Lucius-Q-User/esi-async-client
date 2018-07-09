package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class LpTradeRequiredItem {
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    public int getQuantity() {
        return quantity;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static LpTradeRequiredItem fromJson(Json json) {
        if (json == null) {
            return null;
        }
        LpTradeRequiredItem self = new LpTradeRequiredItem();
        Map<String, Json> js = json.asJsonMap();
        self.quantity = ApiClientBase.optGetInteger(js.get("quantity"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
