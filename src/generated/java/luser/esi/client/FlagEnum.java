package luser.esi.client;

public enum FlagEnum {
    SHORTEST("shortest"),
    SECURE("secure"),
    INSECURE("insecure");
    public final String stringValue;
    private FlagEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
