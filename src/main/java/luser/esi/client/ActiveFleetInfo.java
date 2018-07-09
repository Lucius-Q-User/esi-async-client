package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ActiveFleetInfo {
    private long fleetId;
    public void setFleetId(long val) {
        fleetId = val;
    }
    public long getFleetId() {
        return fleetId;
    }
    private RoleEnum role;
    public void setRole(RoleEnum val) {
        role = val;
    }
    public RoleEnum getRole() {
        return role;
    }
    private long squadId;
    public void setSquadId(long val) {
        squadId = val;
    }
    public long getSquadId() {
        return squadId;
    }
    private long wingId;
    public void setWingId(long val) {
        wingId = val;
    }
    public long getWingId() {
        return wingId;
    }
    static ActiveFleetInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ActiveFleetInfo self = new ActiveFleetInfo();
        Map<String, Json> js = json.asJsonMap();
        self.fleetId = ApiClientBase.optGetLong(js.get("fleet_id"));
        self.role = RoleEnum.fromString(ApiClientBase.optGetString(js.get("role")));
        self.squadId = ApiClientBase.optGetLong(js.get("squad_id"));
        self.wingId = ApiClientBase.optGetLong(js.get("wing_id"));
        return self;
    }
    public static enum RoleEnum {
        FLEET_COMMANDER("fleet_commander"),
        SQUAD_COMMANDER("squad_commander"),
        SQUAD_MEMBER("squad_member"),
        WING_COMMANDER("wing_commander");
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
