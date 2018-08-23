package luser.esi.client;

public enum MailLabelColorEnum {
    _0000FE("#0000fe"),
    _006634("#006634"),
    _0099FF("#0099ff"),
    _00FF33("#00ff33"),
    _01FFFF("#01ffff"),
    _349800("#349800"),
    _660066("#660066"),
    _666666("#666666"),
    _999999("#999999"),
    _99FFFF("#99ffff"),
    _9A0000("#9a0000"),
    _CCFF9A("#ccff9a"),
    _E6E6E6("#e6e6e6"),
    _FE0000("#fe0000"),
    _FF6600("#ff6600"),
    _FFFF01("#ffff01"),
    _FFFFCD("#ffffcd"),
    _FFFFFF("#ffffff");
    public final String stringValue;
    private MailLabelColorEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
