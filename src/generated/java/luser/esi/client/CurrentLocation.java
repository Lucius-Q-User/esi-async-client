package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentLocation {
    private int solarSystemId;
    /**
     * solar_system_id integer
     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * solar_system_id integer
     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Integer stationId;
    /**
     * station_id integer
     */
    public void setStationId(Integer val) {
        stationId = val;
    }
    /**
     * station_id integer
     */
    @JsonProperty("station_id")
    public Integer getStationId() {
        return stationId;
    }
    private Long structureId;
    /**
     * structure_id integer
     */
    public void setStructureId(Long val) {
        structureId = val;
    }
    /**
     * structure_id integer
     */
    @JsonProperty("structure_id")
    public Long getStructureId() {
        return structureId;
    }
}
