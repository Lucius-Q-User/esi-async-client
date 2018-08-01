package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoonInfo {
    private int moonId;
    /**
     * moon_id integer
     */
    public void setMoonId(int val) {
        moonId = val;
    }
    /**
     * moon_id integer
     */
    @JsonProperty("moon_id")
    public int getMoonId() {
        return moonId;
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
    private int systemId;
    /**
     * The solar system this moon is in
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * The solar system this moon is in
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
}
