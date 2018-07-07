package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ResolvedAssetName {
    private long itemId;
    public void setItemId(long val) {
        itemId = val;
    }
    public long getItemId() {
        return itemId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    static ResolvedAssetName fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ResolvedAssetName self = new ResolvedAssetName();
        Map<String, Json> js = json.asJsonMap();
        self.itemId = ApiClientBase.optGetLong(js.get("item_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
}
