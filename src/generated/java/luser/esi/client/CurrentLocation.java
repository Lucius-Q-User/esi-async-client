package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CurrentLocation implements ApiParameterObject {
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Integer stationId;
    public void setStationId(Integer val) {
        stationId = val;
    }
    @JsonProperty("station_id")
    public Integer getStationId() {
        return stationId;
    }
    private Long structureId;
    public void setStructureId(Long val) {
        structureId = val;
    }
    @JsonProperty("structure_id")
    public Long getStructureId() {
        return structureId;
    }
}
