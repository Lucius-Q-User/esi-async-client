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
    public void setShipItemId(long val) {
        shipItemId = val;
    }
    @JsonProperty("ship_item_id")
    public long getShipItemId() {
        return shipItemId;
    }
    private String shipName;
    public void setShipName(String val) {
        shipName = val;
    }
    @JsonProperty("ship_name")
    public String getShipName() {
        return shipName;
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
