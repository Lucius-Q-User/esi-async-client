package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FleetMemberList implements ApiParameterObject {
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private Instant joinTime;
    public void setJoinTime(Instant val) {
        joinTime = val;
    }
    @JsonProperty("join_time")
    public Instant getJoinTime() {
        return joinTime;
    }
    private RoleEnum role;
    public void setRole(RoleEnum val) {
        role = val;
    }
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }
    private String roleName;
    public void setRoleName(String val) {
        roleName = val;
    }
    @JsonProperty("role_name")
    public String getRoleName() {
        return roleName;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    @JsonProperty("ship_type_id")
    public int getShipTypeId() {
        return shipTypeId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private long squadId;
    public void setSquadId(long val) {
        squadId = val;
    }
    @JsonProperty("squad_id")
    public long getSquadId() {
        return squadId;
    }
    private Long stationId;
    public void setStationId(Long val) {
        stationId = val;
    }
    @JsonProperty("station_id")
    public Long getStationId() {
        return stationId;
    }
    private boolean takesFleetWarp;
    public void setTakesFleetWarp(boolean val) {
        takesFleetWarp = val;
    }
    @JsonProperty("takes_fleet_warp")
    public boolean getTakesFleetWarp() {
        return takesFleetWarp;
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
        WING_COMMANDER("wing_commander"),
        SQUAD_COMMANDER("squad_commander"),
        SQUAD_MEMBER("squad_member");
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
