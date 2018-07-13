package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class RegionInfo implements ApiParameterObject {
    private int[] constellations;
    /**
     * constellations array
     */
    public void setConstellations(int[] val) {
        constellations = val;
    }
    /**
     * constellations array
     */
    @JsonProperty("constellations")
    public int[] getConstellations() {
        return constellations;
    }
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
    private int regionId;
    /**
     * region_id integer
     */
    public void setRegionId(int val) {
        regionId = val;
    }
    /**
     * region_id integer
     */
    @JsonProperty("region_id")
    public int getRegionId() {
        return regionId;
    }
}
