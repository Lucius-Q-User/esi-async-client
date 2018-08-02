package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlagEnum implements StringyEnum {
    SHORTEST("shortest"),
    SECURE("secure"),
    INSECURE("insecure");
    public final String stringValue;
    private FlagEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
