package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResolvedItemLocation {
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
    private Coordinate position;
    /**
     * position object
     */
    public void setPosition(Coordinate val) {
        position = val;
    }
    /**
     * position object
     */
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
}
