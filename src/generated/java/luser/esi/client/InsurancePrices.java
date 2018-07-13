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
    /**
     * A list of a available insurance levels for this ship type
     */
    public void setLevels(List<IsurancePrices> val) {
        levels = val;
    }
    /**
     * A list of a available insurance levels for this ship type
     */
    @JsonProperty("levels")
    public List<IsurancePrices> getLevels() {
        return levels;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
