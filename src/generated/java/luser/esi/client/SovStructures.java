package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SovStructures implements ApiParameterObject {
    private int allianceId;
    public void setAllianceId(int val) {
        allianceId = val;
    }
    @JsonProperty("alliance_id")
    public int getAllianceId() {
        return allianceId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private long structureId;
    public void setStructureId(long val) {
        structureId = val;
    }
    @JsonProperty("structure_id")
    public long getStructureId() {
        return structureId;
    }
    private int structureTypeId;
    public void setStructureTypeId(int val) {
        structureTypeId = val;
    }
    @JsonProperty("structure_type_id")
    public int getStructureTypeId() {
        return structureTypeId;
    }
    private Float vulnerabilityOccupancyLevel;
    public void setVulnerabilityOccupancyLevel(Float val) {
        vulnerabilityOccupancyLevel = val;
    }
    @JsonProperty("vulnerability_occupancy_level")
    public Float getVulnerabilityOccupancyLevel() {
        return vulnerabilityOccupancyLevel;
    }
    private Instant vulnerableEndTime;
    public void setVulnerableEndTime(Instant val) {
        vulnerableEndTime = val;
    }
    @JsonProperty("vulnerable_end_time")
    public Instant getVulnerableEndTime() {
        return vulnerableEndTime;
    }
    private Instant vulnerableStartTime;
    public void setVulnerableStartTime(Instant val) {
        vulnerableStartTime = val;
    }
    @JsonProperty("vulnerable_start_time")
    public Instant getVulnerableStartTime() {
        return vulnerableStartTime;
    }
}
