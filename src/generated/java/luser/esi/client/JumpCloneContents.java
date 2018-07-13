package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class JumpCloneContents implements ApiParameterObject {
    private int[] implants;
    public void setImplants(int[] val) {
        implants = val;
    }
    @JsonProperty("implants")
    public int[] getImplants() {
        return implants;
    }
    private int jumpCloneId;
    public void setJumpCloneId(int val) {
        jumpCloneId = val;
    }
    @JsonProperty("jump_clone_id")
    public int getJumpCloneId() {
        return jumpCloneId;
    }
    private long locationId;
    public void setLocationId(long val) {
        locationId = val;
    }
    @JsonProperty("location_id")
    public long getLocationId() {
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
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
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
