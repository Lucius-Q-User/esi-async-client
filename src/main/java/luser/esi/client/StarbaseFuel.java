package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class StarbaseFuel {
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
    static StarbaseFuel fromJson(Json json) {
        if (json == null) {
            return null;
        }
        StarbaseFuel self = new StarbaseFuel();
        Map<String, Json> js = json.asJsonMap();
        self.quantity = ApiClientBase.optGetInteger(js.get("quantity"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
