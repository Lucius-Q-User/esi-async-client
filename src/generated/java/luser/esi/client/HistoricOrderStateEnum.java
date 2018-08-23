package luser.esi.client;

public enum HistoricOrderStateEnum {
    CANCELLED("cancelled"),
    EXPIRED("expired");
    public final String stringValue;
    private HistoricOrderStateEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
