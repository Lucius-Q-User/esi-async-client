package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class KillItems {
    private int flag;
    public void setFlag(int val) {
        flag = val;
    }
    public int getFlag() {
        return flag;
    }
    private int itemTypeId;
    public void setItemTypeId(int val) {
        itemTypeId = val;
    }
    public int getItemTypeId() {
        return itemTypeId;
    }
    private List<KillItem> items;
    public void setItems(List<KillItem> val) {
        items = val;
    }
    public List<KillItem> getItems() {
        return items;
    }
    private Long quantityDestroyed;
    public void setQuantityDestroyed(Long val) {
        quantityDestroyed = val;
    }
    public Long getQuantityDestroyed() {
        return quantityDestroyed;
    }
    private Long quantityDropped;
    public void setQuantityDropped(Long val) {
        quantityDropped = val;
    }
    public Long getQuantityDropped() {
        return quantityDropped;
    }
    private int singleton;
    public void setSingleton(int val) {
        singleton = val;
    }
    public int getSingleton() {
        return singleton;
    }
    static KillItems fromJson(Json json) {
        if (json == null) {
            return null;
        }
        KillItems self = new KillItems();
        Map<String, Json> js = json.asJsonMap();
        self.flag = ApiClientBase.optGetInteger(js.get("flag"));
        self.itemTypeId = ApiClientBase.optGetInteger(js.get("item_type_id"));
        {
            List<Json> jl = js.get("items").asJsonList();
            List<KillItem> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(KillItem.fromJson(jl.get(i)));
            }
            self.items = rt;
        }
        self.quantityDestroyed = ApiClientBase.optGetLong(js.get("quantity_destroyed"));
        self.quantityDropped = ApiClientBase.optGetLong(js.get("quantity_dropped"));
        self.singleton = ApiClientBase.optGetInteger(js.get("singleton"));
        return self;
    }
}
