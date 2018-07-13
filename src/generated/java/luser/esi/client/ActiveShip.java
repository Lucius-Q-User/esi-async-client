package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ActiveShip implements ApiParameterObject {
    private long shipItemId;
    /**
     * Item id's are unique to a ship and persist until it is repackaged. This value can be used to track repeated uses of a ship, or detect when a pilot changes into a different instance of the same ship type.
     */
    public void setShipItemId(long val) {
        shipItemId = val;
    }
    /**
     * Item id's are unique to a ship and persist until it is repackaged. This value can be used to track repeated uses of a ship, or detect when a pilot changes into a different instance of the same ship type.
     */
    @JsonProperty("ship_item_id")
    public long getShipItemId() {
        return shipItemId;
    }
    private String shipName;
    /**
     * ship_name string
     */
    public void setShipName(String val) {
        shipName = val;
    }
    /**
     * ship_name string
     */
    @JsonProperty("ship_name")
    public String getShipName() {
        return shipName;
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
