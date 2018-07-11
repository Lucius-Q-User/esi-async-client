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
    public void setConstellations(int[] val) {
        constellations = val;
    }
    @JsonProperty("constellations")
    public int[] getConstellations() {
        return constellations;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int regionId;
    public void setRegionId(int val) {
        regionId = val;
    }
    @JsonProperty("region_id")
    public int getRegionId() {
        return regionId;
    }
}
