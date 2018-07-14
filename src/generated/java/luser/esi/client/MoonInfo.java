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
public class MoonInfo implements ApiParameterObject {
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
