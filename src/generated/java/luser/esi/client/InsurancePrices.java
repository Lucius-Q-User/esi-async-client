package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class InsurancePrices implements ApiParameterObject {
    private List<IsurancePrices> levels;
    public void setLevels(List<IsurancePrices> val) {
        levels = val;
    }
    @JsonProperty("levels")
    public List<IsurancePrices> getLevels() {
        return levels;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
