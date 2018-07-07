package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FleetMemberList {
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    public int getCharacterId() {
        return characterId;
    }
    private String joinTime;
    public void setJoinTime(String val) {
        joinTime = val;
    }
    public String getJoinTime() {
        return joinTime;
    }
    private RoleEnum role;
    public void setRole(RoleEnum val) {
        role = val;
    }
    public RoleEnum getRole() {
        return role;
    }
    private String roleName;
    public void setRoleName(String val) {
        roleName = val;
    }
    public String getRoleName() {
        return roleName;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    public int getShipTypeId() {
        return shipTypeId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private long squadId;
    public void setSquadId(long val) {
        squadId = val;
    }
    public long getSquadId() {
        return squadId;
    }
    private Long stationId;
    public void setStationId(Long val) {
        stationId = val;
    }
    public Long getStationId() {
        return stationId;
    }
    private boolean takesFleetWarp;
    public void setTakesFleetWarp(boolean val) {
        takesFleetWarp = val;
    }
    public boolean getTakesFleetWarp() {
        return takesFleetWarp;
    }
    private long wingId;
    public void setWingId(long val) {
        wingId = val;
    }
    public long getWingId() {
        return wingId;
    }
    static FleetMemberList fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FleetMemberList self = new FleetMemberList();
        Map<String, Json> js = json.asJsonMap();
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.joinTime = ApiClientBase.optGetString(js.get("join_time"));
        self.role = RoleEnum.fromString(ApiClientBase.optGetString(js.get("role")));
        self.roleName = ApiClientBase.optGetString(js.get("role_name"));
        self.shipTypeId = ApiClientBase.optGetInteger(js.get("ship_type_id"));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.squadId = ApiClientBase.optGetLong(js.get("squad_id"));
        self.stationId = ApiClientBase.optGetLong(js.get("station_id"));
        self.takesFleetWarp = ApiClientBase.optGetBoolean(js.get("takes_fleet_warp"));
        self.wingId = ApiClientBase.optGetLong(js.get("wing_id"));
        return self;
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
