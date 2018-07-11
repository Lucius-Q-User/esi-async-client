package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CloneHomeLocation implements ApiParameterObject {
    private Long locationId;
    public void setLocationId(Long val) {
        locationId = val;
    }
    @JsonProperty("location_id")
    public Long getLocationId() {
        return locationId;
    }
    private LocationTypeEnum locationType;
    public void setLocationType(LocationTypeEnum val) {
        locationType = val;
    }
    @JsonProperty("location_type")
    public LocationTypeEnum getLocationType() {
        return locationType;
    }
    public static enum LocationTypeEnum {
        STATION("station"),
        STRUCTURE("structure");
        private final String stringValue;
        private LocationTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static LocationTypeEnum fromString(String str) {
            for (LocationTypeEnum self : LocationTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
