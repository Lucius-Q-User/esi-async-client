package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FittingItem implements ApiParameterObject {
    private int flag;
    public void setFlag(int val) {
        flag = val;
    }
    @JsonProperty("flag")
    public int getFlag() {
        return flag;
    }
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
