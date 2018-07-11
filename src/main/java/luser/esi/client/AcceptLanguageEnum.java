package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AcceptLanguageEnum {
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
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
    @JsonCreator
    public static AcceptLanguageEnum fromString(String str) {
        if (str == null) {
            return null;
        }
        for (AcceptLanguageEnum self : AcceptLanguageEnum.values()) {
            if (self.stringValue.equals(str)) {
                return self;
            }
        }
        throw new IllegalArgumentException();
    }
}
