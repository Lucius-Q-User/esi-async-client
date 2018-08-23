package luser.esi.client;

public enum CalendarEventResponseEnum {
    DECLINED("declined"),
    NOT_RESPONDED("not_responded"),
    ACCEPTED("accepted"),
    TENTATIVE("tentative");
    public final String stringValue;
    private CalendarEventResponseEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
