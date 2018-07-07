package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ResolvedItemLocation {
    private long itemId;
    public void setItemId(long val) {
        itemId = val;
    }
    public long getItemId() {
        return itemId;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    public Coordinate getPosition() {
        return position;
    }
    static ResolvedItemLocation fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ResolvedItemLocation self = new ResolvedItemLocation();
        Map<String, Json> js = json.asJsonMap();
        self.itemId = ApiClientBase.optGetLong(js.get("item_id"));
        self.position = Coordinate.fromJson(js.get("position"));
        return self;
    }
}
