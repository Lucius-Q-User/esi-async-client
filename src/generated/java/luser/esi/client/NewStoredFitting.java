package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewStoredFitting {
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private List<FittingItem> items;
    /**
     * items array
     */
    public void setItems(List<FittingItem> val) {
        items = val;
    }
    /**
     * items array
     */
    @JsonProperty("items")
    public List<FittingItem> getItems() {
        return items;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int shipTypeId;
    /**
     * ship_type_id integer
     */
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    /**
     * ship_type_id integer
     */
    @JsonProperty("ship_type_id")
    public int getShipTypeId() {
        return shipTypeId;
    }
}
