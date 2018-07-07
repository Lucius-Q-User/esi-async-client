package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PIContext {
    private long amount;
    public void setAmount(long val) {
        amount = val;
    }
    public long getAmount() {
        return amount;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static PIContext fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PIContext self = new PIContext();
        Map<String, Json> js = json.asJsonMap();
        self.amount = ApiClientBase.optGetLong(js.get("amount"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
