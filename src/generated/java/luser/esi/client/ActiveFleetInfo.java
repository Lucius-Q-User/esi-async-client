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
    public void setFleetId(long val) {
        fleetId = val;
    }
    @JsonProperty("fleet_id")
    public long getFleetId() {
        return fleetId;
    }
    private RoleEnum role;
    public void setRole(RoleEnum val) {
        role = val;
    }
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }
    private long squadId;
    public void setSquadId(long val) {
        squadId = val;
    }
    @JsonProperty("squad_id")
    public long getSquadId() {
        return squadId;
    }
    private long wingId;
    public void setWingId(long val) {
        wingId = val;
    }
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
