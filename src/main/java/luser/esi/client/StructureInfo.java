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
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int ownerId;
    public void setOwnerId(int val) {
        ownerId = val;
    }
    @JsonProperty("owner_id")
    public int getOwnerId() {
        return ownerId;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Integer typeId;
    public void setTypeId(Integer val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public Integer getTypeId() {
        return typeId;
    }
}
