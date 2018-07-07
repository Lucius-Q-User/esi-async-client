package luser.esi.client;

public enum OrderTypeEnum {
    BUY("buy"),
    SELL("sell"),
    ALL("all");
    public final String stringValue;
    private OrderTypeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    public String getStringValue() {
        return stringValue;
    }
    public static OrderTypeEnum fromString(String str) {
        if (str == null) {
            return null;
        }
        for (OrderTypeEnum self : OrderTypeEnum.values()) {
            if (self.stringValue.equals(str)) {
                return self;
            }
        }
        throw new IllegalArgumentException();
    }
}
