package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SovStructures {
    private int allianceId;
    public void setAllianceId(int val) {
        allianceId = val;
    }
    public int getAllianceId() {
        return allianceId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private long structureId;
    public void setStructureId(long val) {
        structureId = val;
    }
    public long getStructureId() {
        return structureId;
    }
    private int structureTypeId;
    public void setStructureTypeId(int val) {
        structureTypeId = val;
    }
    public int getStructureTypeId() {
        return structureTypeId;
    }
    private Float vulnerabilityOccupancyLevel;
    public void setVulnerabilityOccupancyLevel(Float val) {
        vulnerabilityOccupancyLevel = val;
    }
    public Float getVulnerabilityOccupancyLevel() {
        return vulnerabilityOccupancyLevel;
    }
    private Instant vulnerableEndTime;
    public void setVulnerableEndTime(Instant val) {
        vulnerableEndTime = val;
    }
    public Instant getVulnerableEndTime() {
        return vulnerableEndTime;
    }
    private Instant vulnerableStartTime;
    public void setVulnerableStartTime(Instant val) {
        vulnerableStartTime = val;
    }
    public Instant getVulnerableStartTime() {
        return vulnerableStartTime;
    }
    static SovStructures fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SovStructures self = new SovStructures();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.structureId = ApiClientBase.optGetLong(js.get("structure_id"));
        self.structureTypeId = ApiClientBase.optGetInteger(js.get("structure_type_id"));
        self.vulnerabilityOccupancyLevel = ApiClientBase.optGetFloat(js.get("vulnerability_occupancy_level"));
        self.vulnerableEndTime = ApiClientBase.optGetInstant(js.get("vulnerable_end_time"));
        self.vulnerableStartTime = ApiClientBase.optGetInstant(js.get("vulnerable_start_time"));
        return self;
    }
}
