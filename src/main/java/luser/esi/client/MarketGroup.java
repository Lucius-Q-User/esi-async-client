package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MarketGroup {
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private int marketGroupId;
    public void setMarketGroupId(int val) {
        marketGroupId = val;
    }
    public int getMarketGroupId() {
        return marketGroupId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private Integer parentGroupId;
    public void setParentGroupId(Integer val) {
        parentGroupId = val;
    }
    public Integer getParentGroupId() {
        return parentGroupId;
    }
    private int[] types;
    public void setTypes(int[] val) {
        types = val;
    }
    public int[] getTypes() {
        return types;
    }
    static MarketGroup fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MarketGroup self = new MarketGroup();
        Map<String, Json> js = json.asJsonMap();
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.marketGroupId = ApiClientBase.optGetInteger(js.get("market_group_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.parentGroupId = ApiClientBase.optGetInteger(js.get("parent_group_id"));
        {
            List<Json> jl = js.get("types").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.types = rt;
        }
        return self;
    }
}
