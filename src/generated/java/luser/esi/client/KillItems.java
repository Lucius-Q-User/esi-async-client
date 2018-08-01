package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KillItems {
    private int flag;
    /**
     * Flag for the location of the item

     */
    public void setFlag(int val) {
        flag = val;
    }
    /**
     * Flag for the location of the item

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
    private List<KillItem> items;
    /**
     * items array
     */
    public void setItems(List<KillItem> val) {
        items = val;
    }
    /**
     * items array
     */
    @JsonProperty("items")
    public List<KillItem> getItems() {
        return items;
    }
    private Long quantityDestroyed;
    /**
     * How many of the item were destroyed if any

     */
    public void setQuantityDestroyed(Long val) {
        quantityDestroyed = val;
    }
    /**
     * How many of the item were destroyed if any

     */
    @JsonProperty("quantity_destroyed")
    public Long getQuantityDestroyed() {
        return quantityDestroyed;
    }
    private Long quantityDropped;
    /**
     * How many of the item were dropped if any

     */
    public void setQuantityDropped(Long val) {
        quantityDropped = val;
    }
    /**
     * How many of the item were dropped if any

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
