package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FittingItem extends JsonConvertible {
    private int flag;
    public void setFlag(int val) {
        flag = val;
    }
    public int getFlag() {
        return flag;
    }
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
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("flag", Json.make(flag));
        object.set("quantity", Json.make(quantity));
        object.set("type_id", Json.make(typeId));
        return object;
    }
    static FittingItem fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FittingItem self = new FittingItem();
        Map<String, Json> js = json.asJsonMap();
        self.flag = ApiClientBase.optGetInteger(js.get("flag"));
        self.quantity = ApiClientBase.optGetInteger(js.get("quantity"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
