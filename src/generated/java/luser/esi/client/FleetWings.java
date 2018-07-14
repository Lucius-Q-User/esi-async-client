package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FleetWings implements ApiParameterObject {
    private long id;
    /**
     * id integer
     */
    public void setId(long val) {
        id = val;
    }
    /**
     * id integer
     */
    @JsonProperty("id")
    public long getId() {
        return id;
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
    private List<SquadsInWing> squads;
    /**
     * squads array
     */
    public void setSquads(List<SquadsInWing> val) {
        squads = val;
    }
    /**
     * squads array
     */
    @JsonProperty("squads")
    public List<SquadsInWing> getSquads() {
        return squads;
    }
}
