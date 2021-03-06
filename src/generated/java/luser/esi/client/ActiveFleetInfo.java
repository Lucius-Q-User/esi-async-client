package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveFleetInfo {
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
    private FleetRoleEnum role;
    /**
     * Member’s role in fleet
     */
    public void setRole(FleetRoleEnum val) {
        role = val;
    }
    /**
     * Member’s role in fleet
     */
    @JsonProperty("role")
    public FleetRoleEnum getRole() {
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
}
