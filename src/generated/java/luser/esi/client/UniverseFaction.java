package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class UniverseFaction implements ApiParameterObject {
    private Integer corporationId;
    /**
     * corporation_id integer
     */
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    /**
     * corporation_id integer
     */
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int factionId;
    /**
     * faction_id integer
     */
    public void setFactionId(int val) {
        factionId = val;
    }
    /**
     * faction_id integer
     */
    @JsonProperty("faction_id")
    public int getFactionId() {
        return factionId;
    }
    private boolean isUnique;
    /**
     * is_unique boolean
     */
    public void setIsUnique(boolean val) {
        isUnique = val;
    }
    /**
     * is_unique boolean
     */
    @JsonProperty("is_unique")
    public boolean getIsUnique() {
        return isUnique;
    }
    private Integer militiaCorporationId;
    /**
     * militia_corporation_id integer
     */
    public void setMilitiaCorporationId(Integer val) {
        militiaCorporationId = val;
    }
    /**
     * militia_corporation_id integer
     */
    @JsonProperty("militia_corporation_id")
    public Integer getMilitiaCorporationId() {
        return militiaCorporationId;
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
    private float sizeFactor;
    /**
     * size_factor number
     */
    public void setSizeFactor(float val) {
        sizeFactor = val;
    }
    /**
     * size_factor number
     */
    @JsonProperty("size_factor")
    public float getSizeFactor() {
        return sizeFactor;
    }
    private Integer solarSystemId;
    /**
     * solar_system_id integer
     */
    public void setSolarSystemId(Integer val) {
        solarSystemId = val;
    }
    /**
     * solar_system_id integer
     */
    @JsonProperty("solar_system_id")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }
    private int stationCount;
    /**
     * station_count integer
     */
    public void setStationCount(int val) {
        stationCount = val;
    }
    /**
     * station_count integer
     */
    @JsonProperty("station_count")
    public int getStationCount() {
        return stationCount;
    }
    private int stationSystemCount;
    /**
     * station_system_count integer
     */
    public void setStationSystemCount(int val) {
        stationSystemCount = val;
    }
    /**
     * station_system_count integer
     */
    @JsonProperty("station_system_count")
    public int getStationSystemCount() {
        return stationSystemCount;
    }
}
