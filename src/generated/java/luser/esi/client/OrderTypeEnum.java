package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderTypeEnum implements StringyEnum {
    BUY("buy"),
    SELL("sell"),
    ALL("all");
    public final String stringValue;
    private OrderTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
