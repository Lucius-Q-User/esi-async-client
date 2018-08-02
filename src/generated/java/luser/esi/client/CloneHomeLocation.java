package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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
    private LocationTypeEnum locationType;
    /**
     * location_type string
     */
    public void setLocationType(LocationTypeEnum val) {
        locationType = val;
    }
    /**
     * location_type string
     */
    @JsonProperty("location_type")
    public LocationTypeEnum getLocationType() {
        return locationType;
    }
    public static enum LocationTypeEnum implements StringyEnum{
        STATION("station"),
        STRUCTURE("structure");
        private final String stringValue;
        private LocationTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
