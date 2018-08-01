package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookmarkedItem {
    private long itemId;
    /**
     * item_id integer
     */
    public void setItemId(long val) {
        itemId = val;
    }
    /**
     * item_id integer
     */
    @JsonProperty("item_id")
    public long getItemId() {
        return itemId;
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
