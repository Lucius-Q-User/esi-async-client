package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CategoriesEnum implements StringyEnum {
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
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
