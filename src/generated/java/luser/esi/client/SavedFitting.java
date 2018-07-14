package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SavedFitting implements ApiParameterObject {
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
    private int fittingId;
    /**
     * fitting_id integer
     */
    public void setFittingId(int val) {
        fittingId = val;
    }
    /**
     * fitting_id integer
     */
    @JsonProperty("fitting_id")
    public int getFittingId() {
        return fittingId;
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
