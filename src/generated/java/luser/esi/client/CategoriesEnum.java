package luser.esi.client;

public enum CategoriesEnum {
    AGENT("agent"),
    ALLIANCE("alliance"),
    CHARACTER("character"),
    CONSTELLATION("constellation"),
    CORPORATION("corporation"),
    FACTION("faction"),
    INVENTORY_TYPE("inventory_type"),
    REGION("region"),
    SOLAR_SYSTEM("solar_system"),
    STATION("station");
    public final String stringValue;
    private CategoriesEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
