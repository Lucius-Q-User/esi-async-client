package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FleetRoleEnum implements StringyEnum {
    FLEET_COMMANDER("fleet_commander"),
    WING_COMMANDER("wing_commander"),
    SQUAD_COMMANDER("squad_commander"),
    SQUAD_MEMBER("squad_member");
    public final String stringValue;
    private FleetRoleEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
