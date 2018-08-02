package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class FleetMemberList {
    private int characterId;
    /**
     * character_id integer
     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * character_id integer
     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private Instant joinTime;
    /**
     * join_time string
     */
    public void setJoinTime(Instant val) {
        joinTime = val;
    }
    /**
     * join_time string
     */
    @JsonProperty("join_time")
    public Instant getJoinTime() {
        return joinTime;
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
    private String roleName;
    /**
     * Localized role names
     */
    public void setRoleName(String val) {
        roleName = val;
    }
    /**
     * Localized role names
     */
    @JsonProperty("role_name")
    public String getRoleName() {
        return roleName;
    }
    private int shipTypeId;
    /**
     * ship_type_id integer
     */
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    /**
     * ship_type_id integer
     */
    @JsonProperty("ship_type_id")
    public int getShipTypeId() {
        return shipTypeId;
    }
    private int solarSystemId;
    /**
     * Solar system the member is located in
     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * Solar system the member is located in
     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
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
    private Long stationId;
    /**
     * Station in which the member is docked in, if applicable
     */
    public void setStationId(Long val) {
        stationId = val;
    }
    /**
     * Station in which the member is docked in, if applicable
     */
    @JsonProperty("station_id")
    public Long getStationId() {
        return stationId;
    }
    private boolean takesFleetWarp;
    /**
     * Whether the member take fleet warps
     */
    public void setTakesFleetWarp(boolean val) {
        takesFleetWarp = val;
    }
    /**
     * Whether the member take fleet warps
     */
    @JsonProperty("takes_fleet_warp")
    public boolean getTakesFleetWarp() {
        return takesFleetWarp;
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
    public static enum RoleEnum implements StringyEnum{
        FLEET_COMMANDER("fleet_commander"),
        WING_COMMANDER("wing_commander"),
        SQUAD_COMMANDER("squad_commander"),
        SQUAD_MEMBER("squad_member");
        private final String stringValue;
        private RoleEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
