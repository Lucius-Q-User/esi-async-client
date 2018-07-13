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
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int marketGroupId;
    public void setMarketGroupId(int val) {
        marketGroupId = val;
    }
    @JsonProperty("market_group_id")
    public int getMarketGroupId() {
        return marketGroupId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Integer parentGroupId;
    public void setParentGroupId(Integer val) {
        parentGroupId = val;
    }
    @JsonProperty("parent_group_id")
    public Integer getParentGroupId() {
        return parentGroupId;
    }
    private int[] types;
    public void setTypes(int[] val) {
        types = val;
    }
    @JsonProperty("types")
    public int[] getTypes() {
        return types;
    }
}
