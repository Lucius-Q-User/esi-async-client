package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloneHomeLocation {
    private Long locationId;
    /**
     * location_id integer
     */
    public void setLocationId(Long val) {
        locationId = val;
    }
    /**
     * location_id integer
     */
    @JsonProperty("location_id")
    public Long getLocationId() {
        return locationId;
    }
    private CloneLocationTypeEnum locationType;
    /**
     * location_type string
     */
    public void setLocationType(CloneLocationTypeEnum val) {
        locationType = val;
    }
    /**
     * location_type string
     */
    @JsonProperty("location_type")
    public CloneLocationTypeEnum getLocationType() {
        return locationType;
    }
}
