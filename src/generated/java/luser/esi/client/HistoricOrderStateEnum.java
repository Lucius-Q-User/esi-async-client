package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HistoricOrderStateEnum implements StringyEnum {
    CANCELLED("cancelled"),
    EXPIRED("expired");
    public final String stringValue;
    private HistoricOrderStateEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
