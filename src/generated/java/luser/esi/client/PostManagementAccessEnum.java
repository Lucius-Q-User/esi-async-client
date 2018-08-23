package luser.esi.client;

public enum PostManagementAccessEnum {
    ALLIANCE_MEMBER("alliance_member"),
    CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),
    CORPORATION_MEMBER("corporation_member"),
    STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");
    public final String stringValue;
    private PostManagementAccessEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
