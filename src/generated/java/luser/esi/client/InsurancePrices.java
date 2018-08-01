package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InsurancePrices {
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
