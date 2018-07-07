package luser.esi.client;

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
    public String getStringValue() {
        return stringValue;
    }
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
