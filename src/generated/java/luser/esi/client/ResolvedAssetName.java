package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResolvedAssetName implements ApiParameterObject {
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
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
}
