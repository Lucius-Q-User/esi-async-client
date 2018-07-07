package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class NewStoredFitting extends JsonConvertible {
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
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
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("description", Json.make(description));
        {
            Json arr = Json.array();
            for (JsonConvertible i : items){
                arr.add(i.toJson());
            }
            object.set("items", arr);
        }
        object.set("name", Json.make(name));
        object.set("ship_type_id", Json.make(shipTypeId));
        return object;
    }
}
