package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FleetMovementRequest extends JsonConvertible {
    private RoleEnum role;
    public void setRole(RoleEnum val) {
        role = val;
    }
    public RoleEnum getRole() {
        return role;
    }
    private Long squadId;
    public void setSquadId(Long val) {
        squadId = val;
    }
    public Long getSquadId() {
        return squadId;
    }
    private Long wingId;
    public void setWingId(Long val) {
        wingId = val;
    }
    public Long getWingId() {
        return wingId;
    }
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("role", Json.make(role.stringValue));
        object.set("squad_id", Json.make(squadId));
        object.set("wing_id", Json.make(wingId));
        return object;
    }
    public static enum RoleEnum {
        FLEET_COMMANDER("fleet_commander"),
        WING_COMMANDER("wing_commander"),
        SQUAD_COMMANDER("squad_commander"),
        SQUAD_MEMBER("squad_member");
        public final String stringValue;
        private RoleEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
