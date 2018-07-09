package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class IndustrySystems {
    private List<SystemCostIndex> costIndices;
    public void setCostIndices(List<SystemCostIndex> val) {
        costIndices = val;
    }
    public List<SystemCostIndex> getCostIndices() {
        return costIndices;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    static IndustrySystems fromJson(Json json) {
        if (json == null) {
            return null;
        }
        IndustrySystems self = new IndustrySystems();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("cost_indices").asJsonList();
            List<SystemCostIndex> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(SystemCostIndex.fromJson(jl.get(i)));
            }
            self.costIndices = rt;
        }
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        return self;
    }
}
