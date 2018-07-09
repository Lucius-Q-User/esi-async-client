package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ActiveShip {
    private long shipItemId;
    public void setShipItemId(long val) {
        shipItemId = val;
    }
    public long getShipItemId() {
        return shipItemId;
    }
    private String shipName;
    public void setShipName(String val) {
        shipName = val;
    }
    public String getShipName() {
        return shipName;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    public int getShipTypeId() {
        return shipTypeId;
    }
    static ActiveShip fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ActiveShip self = new ActiveShip();
        Map<String, Json> js = json.asJsonMap();
        self.shipItemId = ApiClientBase.optGetLong(js.get("ship_item_id"));
        self.shipName = ApiClientBase.optGetString(js.get("ship_name"));
        self.shipTypeId = ApiClientBase.optGetInteger(js.get("ship_type_id"));
        return self;
    }
}
