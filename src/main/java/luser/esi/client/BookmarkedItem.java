package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class BookmarkedItem {
    private long itemId;
    public void setItemId(long val) {
        itemId = val;
    }
    public long getItemId() {
        return itemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static BookmarkedItem fromJson(Json json) {
        if (json == null) {
            return null;
        }
        BookmarkedItem self = new BookmarkedItem();
        Map<String, Json> js = json.asJsonMap();
        self.itemId = ApiClientBase.optGetLong(js.get("item_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
