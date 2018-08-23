package luser.esi.client;

public enum ContactTypeEnum {
    CHARACTER("character"),
    CORPORATION("corporation"),
    ALLIANCE("alliance"),
    FACTION("faction");
    public final String stringValue;
    private ContactTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
