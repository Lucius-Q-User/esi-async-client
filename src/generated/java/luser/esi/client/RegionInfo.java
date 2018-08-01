package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RegionInfo {
    private IntArrayList constellations;
    /**
     * constellations array
     */
    public void setConstellations(IntArrayList val) {
        constellations = val;
    }
    /**
     * constellations array
     */
    @JsonProperty("constellations")
    public IntArrayList getConstellations() {
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
