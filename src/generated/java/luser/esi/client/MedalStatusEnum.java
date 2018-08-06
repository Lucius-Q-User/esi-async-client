package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MedalStatusEnum implements StringyEnum {
    PRIVATE("private"),
    PUBLIC("public");
    public final String stringValue;
    private MedalStatusEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
