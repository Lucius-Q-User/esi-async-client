package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class KillItem implements ApiParameterObject {
    private int flag;
    public void setFlag(int val) {
        flag = val;
    }
    @JsonProperty("flag")
    public int getFlag() {
        return flag;
    }
    private int itemTypeId;
    public void setItemTypeId(int val) {
        itemTypeId = val;
    }
    @JsonProperty("item_type_id")
    public int getItemTypeId() {
        return itemTypeId;
    }
    private Long quantityDestroyed;
    public void setQuantityDestroyed(Long val) {
        quantityDestroyed = val;
    }
    @JsonProperty("quantity_destroyed")
    public Long getQuantityDestroyed() {
        return quantityDestroyed;
    }
    private Long quantityDropped;
    public void setQuantityDropped(Long val) {
        quantityDropped = val;
    }
    @JsonProperty("quantity_dropped")
    public Long getQuantityDropped() {
        return quantityDropped;
    }
    private int singleton;
    public void setSingleton(int val) {
        singleton = val;
    }
    @JsonProperty("singleton")
    public int getSingleton() {
        return singleton;
    }
}
