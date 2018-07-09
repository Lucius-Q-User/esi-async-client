package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class InsurancePrices {
    private List<IsurancePrices> levels;
    public void setLevels(List<IsurancePrices> val) {
        levels = val;
    }
    public List<IsurancePrices> getLevels() {
        return levels;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static InsurancePrices fromJson(Json json) {
        if (json == null) {
            return null;
        }
        InsurancePrices self = new InsurancePrices();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("levels").asJsonList();
            List<IsurancePrices> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(IsurancePrices.fromJson(jl.get(i)));
            }
            self.levels = rt;
        }
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
