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
public class FittingItem implements ApiParameterObject {
    private int flag;
    /**
     * flag integer
     */
    public void setFlag(int val) {
        flag = val;
    }
    /**
     * flag integer
     */
    @JsonProperty("flag")
    public int getFlag() {
        return flag;
    }
    private int quantity;
    /**
     * quantity integer
     */
    public void setQuantity(int val) {
        quantity = val;
    }
    /**
     * quantity integer
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
