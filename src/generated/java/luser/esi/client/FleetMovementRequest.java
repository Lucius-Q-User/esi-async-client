package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FleetMovementRequest {
    private FleetRoleEnum role;
    /**
     * If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is moved to the `wing_commander` role, only `wing_id` should be specified. If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified.
     */
    public void setRole(FleetRoleEnum val) {
        role = val;
    }
    /**
     * If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is moved to the `wing_commander` role, only `wing_id` should be specified. If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified.
     */
    @JsonProperty("role")
    public FleetRoleEnum getRole() {
        return role;
    }
    private Long squadId;
    /**
     * squad_id integer
     */
    public void setSquadId(Long val) {
        squadId = val;
    }
    /**
     * squad_id integer
     */
    @JsonProperty("squad_id")
    public Long getSquadId() {
        return squadId;
    }
    private Long wingId;
    /**
     * wing_id integer
     */
    public void setWingId(Long val) {
        wingId = val;
    }
    /**
     * wing_id integer
     */
    @JsonProperty("wing_id")
    public Long getWingId() {
        return wingId;
    }
}
