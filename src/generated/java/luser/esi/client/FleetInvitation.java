package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class FleetInvitation {
    private int characterId;
    /**
     * The character you want to invite
     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * The character you want to invite
     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private RoleEnum role;
    /**
     * If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.
     */
    public void setRole(RoleEnum val) {
        role = val;
    }
    /**
     * If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.
     */
    @JsonProperty("role")
    public RoleEnum getRole() {
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
