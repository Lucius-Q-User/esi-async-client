package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PIContext {
    private long amount;
    /**
     * amount integer
     */
    public void setAmount(long val) {
        amount = val;
    }
    /**
     * amount integer
     */
    @JsonProperty("amount")
    public long getAmount() {
        return amount;
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
