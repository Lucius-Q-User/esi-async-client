package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ConstellationInfo implements ApiParameterObject {
    private int constellationId;
    public void setConstellationId(int val) {
        constellationId = val;
    }
    @JsonProperty("constellation_id")
    public int getConstellationId() {
        return constellationId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private int regionId;
    public void setRegionId(int val) {
        regionId = val;
    }
    @JsonProperty("region_id")
    public int getRegionId() {
        return regionId;
    }
    private int[] systems;
    public void setSystems(int[] val) {
        systems = val;
    }
    @JsonProperty("systems")
    public int[] getSystems() {
        return systems;
    }
}
