package luser.esi.client;

public enum FleetRoleEnum {
    FLEET_COMMANDER("fleet_commander"),
    WING_COMMANDER("wing_commander"),
    SQUAD_COMMANDER("squad_commander"),
    SQUAD_MEMBER("squad_member");
    public final String stringValue;
    private FleetRoleEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
