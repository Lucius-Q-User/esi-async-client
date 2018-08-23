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
    @Override
    public String toString() {
        return stringValue;
    }
}
