package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SavedFitting {
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private int fittingId;
    public void setFittingId(int val) {
        fittingId = val;
    }
    public int getFittingId() {
        return fittingId;
    }
    private List<FittingItem> items;
    public void setItems(List<FittingItem> val) {
        items = val;
    }
    public List<FittingItem> getItems() {
        return items;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    public int getShipTypeId() {
        return shipTypeId;
    }
    static SavedFitting fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SavedFitting self = new SavedFitting();
        Map<String, Json> js = json.asJsonMap();
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.fittingId = ApiClientBase.optGetInteger(js.get("fitting_id"));
        {
            List<Json> jl = js.get("items").asJsonList();
            List<FittingItem> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(FittingItem.fromJson(jl.get(i)));
            }
            self.items = rt;
        }
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.shipTypeId = ApiClientBase.optGetInteger(js.get("ship_type_id"));
        return self;
    }
}
