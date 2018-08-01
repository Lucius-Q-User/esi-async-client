package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketGroup {
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int marketGroupId;
    /**
     * market_group_id integer
     */
    public void setMarketGroupId(int val) {
        marketGroupId = val;
    }
    /**
     * market_group_id integer
     */
    @JsonProperty("market_group_id")
    public int getMarketGroupId() {
        return marketGroupId;
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
    private Integer parentGroupId;
    /**
     * parent_group_id integer
     */
    public void setParentGroupId(Integer val) {
        parentGroupId = val;
    }
    /**
     * parent_group_id integer
     */
    @JsonProperty("parent_group_id")
    public Integer getParentGroupId() {
        return parentGroupId;
    }
    private IntArrayList types;
    /**
     * types array
     */
    public void setTypes(IntArrayList val) {
        types = val;
    }
    /**
     * types array
     */
    @JsonProperty("types")
    public IntArrayList getTypes() {
        return types;
    }
}
