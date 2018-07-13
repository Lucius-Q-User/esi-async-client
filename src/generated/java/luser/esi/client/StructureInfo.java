package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class StructureInfo implements ApiParameterObject {
    private String name;
    /**
     * The full name of the structure
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * The full name of the structure
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int ownerId;
    /**
     * The ID of the corporation who owns this particular structure
     */
    public void setOwnerId(int val) {
        ownerId = val;
    }
    /**
     * The ID of the corporation who owns this particular structure
     */
    @JsonProperty("owner_id")
    public int getOwnerId() {
        return ownerId;
    }
    private Coordinate position;
    /**
     * Coordinates of the structure in Cartesian space relative to the Sun, in metres.

     */
    public void setPosition(Coordinate val) {
        position = val;
    }
    /**
     * Coordinates of the structure in Cartesian space relative to the Sun, in metres.

     */
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private int solarSystemId;
    /**
     * solar_system_id integer
     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * solar_system_id integer
     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Integer typeId;
    /**
     * type_id integer
     */
    public void setTypeId(Integer val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public Integer getTypeId() {
        return typeId;
    }
}
