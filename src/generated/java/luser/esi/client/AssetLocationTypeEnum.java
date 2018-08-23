package luser.esi.client;

public enum AssetLocationTypeEnum {
    STATION("station"),
    SOLAR_SYSTEM("solar_system"),
    OTHER("other");
    public final String stringValue;
    private AssetLocationTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
