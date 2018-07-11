package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FleetWings implements ApiParameterObject {
    private long id;
    public void setId(long val) {
        id = val;
    }
    @JsonProperty("id")
    public long getId() {
        return id;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private List<SquadsInWing> squads;
    public void setSquads(List<SquadsInWing> val) {
        squads = val;
    }
    @JsonProperty("squads")
    public List<SquadsInWing> getSquads() {
        return squads;
    }
}
