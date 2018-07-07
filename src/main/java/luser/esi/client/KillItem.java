package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class KillItem {
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
    static KillItem fromJson(Json json) {
        if (json == null) {
            return null;
        }
        KillItem self = new KillItem();
        Map<String, Json> js = json.asJsonMap();
        self.flag = ApiClientBase.optGetInteger(js.get("flag"));
        self.itemTypeId = ApiClientBase.optGetInteger(js.get("item_type_id"));
        self.quantityDestroyed = ApiClientBase.optGetLong(js.get("quantity_destroyed"));
        self.quantityDropped = ApiClientBase.optGetLong(js.get("quantity_dropped"));
        self.singleton = ApiClientBase.optGetInteger(js.get("singleton"));
        return self;
    }
}
