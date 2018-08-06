package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AssetLocationTypeEnum implements StringyEnum {
    STATION("station"),
    SOLAR_SYSTEM("solar_system"),
    OTHER("other");
    public final String stringValue;
    private AssetLocationTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
