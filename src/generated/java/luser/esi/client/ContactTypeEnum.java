package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ContactTypeEnum implements StringyEnum {
    CHARACTER("character"),
    CORPORATION("corporation"),
    ALLIANCE("alliance"),
    FACTION("faction");
    public final String stringValue;
    private ContactTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
