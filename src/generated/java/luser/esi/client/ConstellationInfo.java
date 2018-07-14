package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ConstellationInfo implements ApiParameterObject {
    private int constellationId;
    /**
     * constellation_id integer
     */
    public void setConstellationId(int val) {
        constellationId = val;
    }
    /**
     * constellation_id integer
     */
    @JsonProperty("constellation_id")
    public int getConstellationId() {
        return constellationId;
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
    private Coordinate position;
    /**
     * position object
     */
    public void setPosition(Coordinate val) {
        position = val;
    }
    /**
     * position object
     */
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private int regionId;
    /**
     * The region this constellation is in
     */
    public void setRegionId(int val) {
        regionId = val;
    }
    /**
     * The region this constellation is in
     */
    @JsonProperty("region_id")
    public int getRegionId() {
        return regionId;
    }
    private IntArrayList systems;
    /**
     * systems array
     */
    public void setSystems(IntArrayList val) {
        systems = val;
    }
    /**
     * systems array
     */
    @JsonProperty("systems")
    public IntArrayList getSystems() {
        return systems;
    }
}
