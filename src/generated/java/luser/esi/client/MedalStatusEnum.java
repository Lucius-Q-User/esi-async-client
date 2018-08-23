package luser.esi.client;

public enum MedalStatusEnum {
    PRIVATE("private"),
    PUBLIC("public");
    public final String stringValue;
    private MedalStatusEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
