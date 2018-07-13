package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ActiveFleetInfo implements ApiParameterObject {
    private long fleetId;
    /**
     * The character's current fleet ID
     */
    public void setFleetId(long val) {
        fleetId = val;
    }
    /**
     * The character's current fleet ID
     */
    @JsonProperty("fleet_id")
    public long getFleetId() {
        return fleetId;
    }
    private RoleEnum role;
    /**
     * Member’s role in fleet
     */
    public void setRole(RoleEnum val) {
        role = val;
    }
    /**
     * Member’s role in fleet
     */
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }
    private long squadId;
    /**
     * ID of the squad the member is in. If not applicable, will be set to -1
     */
    public void setSquadId(long val) {
        squadId = val;
    }
    /**
     * ID of the squad the member is in. If not applicable, will be set to -1
     */
    @JsonProperty("squad_id")
    public long getSquadId() {
        return squadId;
    }
    private long wingId;
    /**
     * ID of the wing the member is in. If not applicable, will be set to -1
     */
    public void setWingId(long val) {
        wingId = val;
    }
    /**
     * ID of the wing the member is in. If not applicable, will be set to -1
     */
    @JsonProperty("wing_id")
    public long getWingId() {
        return wingId;
    }
    public static enum RoleEnum {
        FLEET_COMMANDER("fleet_commander"),
        SQUAD_COMMANDER("squad_commander"),
        SQUAD_MEMBER("squad_member"),
        WING_COMMANDER("wing_commander");
        private final String stringValue;
        private RoleEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static RoleEnum fromString(String str) {
            for (RoleEnum self : RoleEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
