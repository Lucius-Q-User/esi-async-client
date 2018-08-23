package luser.esi.client;

public enum OrderTypeEnum {
    BUY("buy"),
    SELL("sell"),
    ALL("all");
    public final String stringValue;
    private OrderTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
