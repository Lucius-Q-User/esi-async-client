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
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int factionId;
    public void setFactionId(int val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public int getFactionId() {
        return factionId;
    }
    private boolean isUnique;
    public void setIsUnique(boolean val) {
        isUnique = val;
    }
    @JsonProperty("is_unique")
    public boolean getIsUnique() {
        return isUnique;
    }
    private Integer militiaCorporationId;
    public void setMilitiaCorporationId(Integer val) {
        militiaCorporationId = val;
    }
    @JsonProperty("militia_corporation_id")
    public Integer getMilitiaCorporationId() {
        return militiaCorporationId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private float sizeFactor;
    public void setSizeFactor(float val) {
        sizeFactor = val;
    }
    @JsonProperty("size_factor")
    public float getSizeFactor() {
        return sizeFactor;
    }
    private Integer solarSystemId;
    public void setSolarSystemId(Integer val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }
    private int stationCount;
    public void setStationCount(int val) {
        stationCount = val;
    }
    @JsonProperty("station_count")
    public int getStationCount() {
        return stationCount;
    }
    private int stationSystemCount;
    public void setStationSystemCount(int val) {
        stationSystemCount = val;
    }
    @JsonProperty("station_system_count")
    public int getStationSystemCount() {
        return stationSystemCount;
    }
}
