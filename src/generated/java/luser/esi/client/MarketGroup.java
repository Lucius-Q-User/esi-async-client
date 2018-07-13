package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MarketGroup implements ApiParameterObject {
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
    private int[] types;
    /**
     * types array
     */
    public void setTypes(int[] val) {
        types = val;
    }
    /**
     * types array
     */
    @JsonProperty("types")
    public int[] getTypes() {
        return types;
    }
}
