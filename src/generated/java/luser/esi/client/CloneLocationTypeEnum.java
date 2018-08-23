package luser.esi.client;

public enum CloneLocationTypeEnum {
    STATION("station"),
    STRUCTURE("structure");
    public final String stringValue;
    private CloneLocationTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
