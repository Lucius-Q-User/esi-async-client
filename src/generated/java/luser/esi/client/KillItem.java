package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KillItem {
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
    private int itemTypeId;
    /**
     * item_type_id integer
     */
    public void setItemTypeId(int val) {
        itemTypeId = val;
    }
    /**
     * item_type_id integer
     */
    @JsonProperty("item_type_id")
    public int getItemTypeId() {
        return itemTypeId;
    }
    private Long quantityDestroyed;
    /**
     * quantity_destroyed integer
     */
    public void setQuantityDestroyed(Long val) {
        quantityDestroyed = val;
    }
    /**
     * quantity_destroyed integer
     */
    @JsonProperty("quantity_destroyed")
    public Long getQuantityDestroyed() {
        return quantityDestroyed;
    }
    private Long quantityDropped;
    /**
     * quantity_dropped integer
     */
    public void setQuantityDropped(Long val) {
        quantityDropped = val;
    }
    /**
     * quantity_dropped integer
     */
    @JsonProperty("quantity_dropped")
    public Long getQuantityDropped() {
        return quantityDropped;
    }
    private int singleton;
    /**
     * singleton integer
     */
    public void setSingleton(int val) {
        singleton = val;
    }
    /**
     * singleton integer
     */
    @JsonProperty("singleton")
    public int getSingleton() {
        return singleton;
    }
}
