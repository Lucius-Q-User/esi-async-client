package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CalendarEventResponseEnum implements StringyEnum {
    DECLINED("declined"),
    NOT_RESPONDED("not_responded"),
    ACCEPTED("accepted"),
    TENTATIVE("tentative");
    public final String stringValue;
    private CalendarEventResponseEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
