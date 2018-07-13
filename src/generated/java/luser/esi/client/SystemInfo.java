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
    /**
     * The constellation this solar system is in
     */
    public void setConstellationId(int val) {
        constellationId = val;
    }
    /**
     * The constellation this solar system is in
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
    private List<SystemPlanetInfo> planets;
    /**
     * planets array
     */
    public void setPlanets(List<SystemPlanetInfo> val) {
        planets = val;
    }
    /**
     * planets array
     */
    @JsonProperty("planets")
    public List<SystemPlanetInfo> getPlanets() {
        return planets;
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
    private String securityClass;
    /**
     * security_class string
     */
    public void setSecurityClass(String val) {
        securityClass = val;
    }
    /**
     * security_class string
     */
    @JsonProperty("security_class")
    public String getSecurityClass() {
        return securityClass;
    }
    private float securityStatus;
    /**
     * security_status number
     */
    public void setSecurityStatus(float val) {
        securityStatus = val;
    }
    /**
     * security_status number
     */
    @JsonProperty("security_status")
    public float getSecurityStatus() {
        return securityStatus;
    }
    private Integer starId;
    /**
     * star_id integer
     */
    public void setStarId(Integer val) {
        starId = val;
    }
    /**
     * star_id integer
     */
    @JsonProperty("star_id")
    public Integer getStarId() {
        return starId;
    }
    private int[] stargates;
    /**
     * stargates array
     */
    public void setStargates(int[] val) {
        stargates = val;
    }
    /**
     * stargates array
     */
    @JsonProperty("stargates")
    public int[] getStargates() {
        return stargates;
    }
    private int[] stations;
    /**
     * stations array
     */
    public void setStations(int[] val) {
        stations = val;
    }
    /**
     * stations array
     */
    @JsonProperty("stations")
    public int[] getStations() {
        return stations;
    }
    private int systemId;
    /**
     * system_id integer
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * system_id integer
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
}
