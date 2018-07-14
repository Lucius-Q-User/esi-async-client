package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

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
