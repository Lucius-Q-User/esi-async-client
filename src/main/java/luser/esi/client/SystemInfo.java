package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SystemInfo implements ApiParameterObject {
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
    private List<SystemPlanetInfo> planets;
    public void setPlanets(List<SystemPlanetInfo> val) {
        planets = val;
    }
    @JsonProperty("planets")
    public List<SystemPlanetInfo> getPlanets() {
        return planets;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private String securityClass;
    public void setSecurityClass(String val) {
        securityClass = val;
    }
    @JsonProperty("security_class")
    public String getSecurityClass() {
        return securityClass;
    }
    private float securityStatus;
    public void setSecurityStatus(float val) {
        securityStatus = val;
    }
    @JsonProperty("security_status")
    public float getSecurityStatus() {
        return securityStatus;
    }
    private Integer starId;
    public void setStarId(Integer val) {
        starId = val;
    }
    @JsonProperty("star_id")
    public Integer getStarId() {
        return starId;
    }
    private int[] stargates;
    public void setStargates(int[] val) {
        stargates = val;
    }
    @JsonProperty("stargates")
    public int[] getStargates() {
        return stargates;
    }
    private int[] stations;
    public void setStations(int[] val) {
        stations = val;
    }
    @JsonProperty("stations")
    public int[] getStations() {
        return stations;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
}
