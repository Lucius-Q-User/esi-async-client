package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class IndustrySystems implements ApiParameterObject {
    private List<SystemCostIndex> costIndices;
    public void setCostIndices(List<SystemCostIndex> val) {
        costIndices = val;
    }
    @JsonProperty("cost_indices")
    public List<SystemCostIndex> getCostIndices() {
        return costIndices;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
}
