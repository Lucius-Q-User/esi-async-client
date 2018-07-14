package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SovStructures implements ApiParameterObject {
    private int allianceId;
    /**
     * The alliance that owns the structure.

     */
    public void setAllianceId(int val) {
        allianceId = val;
    }
    /**
     * The alliance that owns the structure.

     */
    @JsonProperty("alliance_id")
    public int getAllianceId() {
        return allianceId;
    }
    private int solarSystemId;
    /**
     * Solar system in which the structure is located.

     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * Solar system in which the structure is located.

     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private long structureId;
    /**
     * Unique item ID for this structure.
     */
    public void setStructureId(long val) {
        structureId = val;
    }
    /**
     * Unique item ID for this structure.
     */
    @JsonProperty("structure_id")
    public long getStructureId() {
        return structureId;
    }
    private int structureTypeId;
    /**
     * A reference to the type of structure this is.

     */
    public void setStructureTypeId(int val) {
        structureTypeId = val;
    }
    /**
     * A reference to the type of structure this is.

     */
    @JsonProperty("structure_type_id")
    public int getStructureTypeId() {
        return structureTypeId;
    }
    private Float vulnerabilityOccupancyLevel;
    /**
     * The occupancy level for the next or current vulnerability window. This takes into account all development indexes and capital system bonuses. Also known as Activity Defense Multiplier from in the client. It increases the time that attackers must spend using their entosis links on the structure.

     */
    public void setVulnerabilityOccupancyLevel(Float val) {
        vulnerabilityOccupancyLevel = val;
    }
    /**
     * The occupancy level for the next or current vulnerability window. This takes into account all development indexes and capital system bonuses. Also known as Activity Defense Multiplier from in the client. It increases the time that attackers must spend using their entosis links on the structure.

     */
    @JsonProperty("vulnerability_occupancy_level")
    public Float getVulnerabilityOccupancyLevel() {
        return vulnerabilityOccupancyLevel;
    }
    private Instant vulnerableEndTime;
    /**
     * The time at which the next or current vulnerability window ends. At the end of a vulnerability window the next window is recalculated and locked in along with the vulnerabilityOccupancyLevel. If the structure is not in 100% entosis control of the defender, it will go in to 'overtime' and stay vulnerable for as long as that situation persists. Only once the defenders have 100% entosis control and has the vulnerableEndTime passed does the vulnerability interval expire and a new one is calculated.

     */
    public void setVulnerableEndTime(Instant val) {
        vulnerableEndTime = val;
    }
    /**
     * The time at which the next or current vulnerability window ends. At the end of a vulnerability window the next window is recalculated and locked in along with the vulnerabilityOccupancyLevel. If the structure is not in 100% entosis control of the defender, it will go in to 'overtime' and stay vulnerable for as long as that situation persists. Only once the defenders have 100% entosis control and has the vulnerableEndTime passed does the vulnerability interval expire and a new one is calculated.

     */
    @JsonProperty("vulnerable_end_time")
    public Instant getVulnerableEndTime() {
        return vulnerableEndTime;
    }
    private Instant vulnerableStartTime;
    /**
     * The next time at which the structure will become vulnerable. Or the start time of the current window if current time is between this and vulnerableEndTime.

     */
    public void setVulnerableStartTime(Instant val) {
        vulnerableStartTime = val;
    }
    /**
     * The next time at which the structure will become vulnerable. Or the start time of the current window if current time is between this and vulnerableEndTime.

     */
    @JsonProperty("vulnerable_start_time")
    public Instant getVulnerableStartTime() {
        return vulnerableStartTime;
    }
}
