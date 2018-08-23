package luser.esi.client;

public enum OrderRangeEnum {
    _1("1"),
    _10("10"),
    _2("2"),
    _20("20"),
    _3("3"),
    _30("30"),
    _4("4"),
    _40("40"),
    _5("5"),
    REGION("region"),
    SOLARSYSTEM("solarsystem"),
    STATION("station");
    public final String stringValue;
    private OrderRangeEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
