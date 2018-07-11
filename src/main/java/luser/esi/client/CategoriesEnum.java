package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
    @JsonCreator
    public static CategoriesEnum fromString(String str) {
        if (str == null) {
            return null;
        }
        for (CategoriesEnum self : CategoriesEnum.values()) {
            if (self.stringValue.equals(str)) {
                return self;
            }
        }
        throw new IllegalArgumentException();
    }
}
