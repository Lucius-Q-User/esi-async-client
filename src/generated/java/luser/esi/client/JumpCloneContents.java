package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class JumpCloneContents {
    private IntArrayList implants;
    /**
     * implants array
     */
    public void setImplants(IntArrayList val) {
        implants = val;
    }
    /**
     * implants array
     */
    @JsonProperty("implants")
    public IntArrayList getImplants() {
        return implants;
    }
    private int jumpCloneId;
    /**
     * jump_clone_id integer
     */
    public void setJumpCloneId(int val) {
        jumpCloneId = val;
    }
    /**
     * jump_clone_id integer
     */
    @JsonProperty("jump_clone_id")
    public int getJumpCloneId() {
        return jumpCloneId;
    }
    private long locationId;
    /**
     * location_id integer
     */
    public void setLocationId(long val) {
        locationId = val;
    }
    /**
     * location_id integer
     */
    @JsonProperty("location_id")
    public long getLocationId() {
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
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
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
