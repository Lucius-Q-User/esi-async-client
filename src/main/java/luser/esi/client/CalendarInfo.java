package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CalendarInfo {
    private Instant eventDate;
    public void setEventDate(Instant val) {
        eventDate = val;
    }
    public Instant getEventDate() {
        return eventDate;
    }
    private Integer eventId;
    public void setEventId(Integer val) {
        eventId = val;
    }
    public Integer getEventId() {
        return eventId;
    }
    private EventResponseEnum eventResponse;
    public void setEventResponse(EventResponseEnum val) {
        eventResponse = val;
    }
    public EventResponseEnum getEventResponse() {
        return eventResponse;
    }
    private Integer importance;
    public void setImportance(Integer val) {
        importance = val;
    }
    public Integer getImportance() {
        return importance;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    public String getTitle() {
        return title;
    }
    static CalendarInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CalendarInfo self = new CalendarInfo();
        Map<String, Json> js = json.asJsonMap();
        self.eventDate = ApiClientBase.optGetInstant(js.get("event_date"));
        self.eventId = ApiClientBase.optGetInteger(js.get("event_id"));
        self.eventResponse = EventResponseEnum.fromString(ApiClientBase.optGetString(js.get("event_response")));
        self.importance = ApiClientBase.optGetInteger(js.get("importance"));
        self.title = ApiClientBase.optGetString(js.get("title"));
        return self;
    }
    public static enum EventResponseEnum {
        DECLINED("declined"),
        NOT_RESPONDED("not_responded"),
        ACCEPTED("accepted"),
        TENTATIVE("tentative");
        public final String stringValue;
        private EventResponseEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static EventResponseEnum fromString(String str) {
            for (EventResponseEnum self : EventResponseEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
