package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AcceptLanguageEnum implements StringyEnum {
    DE("de"),
    EN_US("en-us"),
    FR("fr"),
    JA("ja"),
    RU("ru"),
    ZH("zh");
    public final String stringValue;
    private AcceptLanguageEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
