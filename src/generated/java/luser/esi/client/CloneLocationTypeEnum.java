package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CloneLocationTypeEnum implements StringyEnum {
    STATION("station"),
    STRUCTURE("structure");
    public final String stringValue;
    private CloneLocationTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
