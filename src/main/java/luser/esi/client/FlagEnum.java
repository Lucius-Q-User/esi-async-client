package luser.esi.client;

public enum FlagEnum {
    SHORTEST("shortest"),
    SECURE("secure"),
    INSECURE("insecure");
    public final String stringValue;
    private FlagEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    public String getStringValue() {
        return stringValue;
    }
    public static FlagEnum fromString(String str) {
        if (str == null) {
            return null;
        }
        for (FlagEnum self : FlagEnum.values()) {
            if (self.stringValue.equals(str)) {
                return self;
            }
        }
        throw new IllegalArgumentException();
    }
}
