package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class NewStoredFitting implements ApiParameterObject {
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private List<FittingItem> items;
    public void setItems(List<FittingItem> val) {
        items = val;
    }
    @JsonProperty("items")
    public List<FittingItem> getItems() {
        return items;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    @JsonProperty("ship_type_id")
    public int getShipTypeId() {
        return shipTypeId;
    }
}
