package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CalendarInfo implements ApiParameterObject {
    private Instant eventDate;
    /**
     * event_date string
     */
    public void setEventDate(Instant val) {
        eventDate = val;
    }
    /**
     * event_date string
     */
    @JsonProperty("event_date")
    public Instant getEventDate() {
        return eventDate;
    }
    private Integer eventId;
    /**
     * event_id integer
     */
    public void setEventId(Integer val) {
        eventId = val;
    }
    /**
     * event_id integer
     */
    @JsonProperty("event_id")
    public Integer getEventId() {
        return eventId;
    }
    private EventResponseEnum eventResponse;
    /**
     * event_response string
     */
    public void setEventResponse(EventResponseEnum val) {
        eventResponse = val;
    }
    /**
     * event_response string
     */
    @JsonProperty("event_response")
    public EventResponseEnum getEventResponse() {
        return eventResponse;
    }
    private Integer importance;
    /**
     * importance integer
     */
    public void setImportance(Integer val) {
        importance = val;
    }
    /**
     * importance integer
     */
    @JsonProperty("importance")
    public Integer getImportance() {
        return importance;
    }
    private String title;
    /**
     * title string
     */
    public void setTitle(String val) {
        title = val;
    }
    /**
     * title string
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    public static enum EventResponseEnum {
        DECLINED("declined"),
        NOT_RESPONDED("not_responded"),
        ACCEPTED("accepted"),
        TENTATIVE("tentative");
        private final String stringValue;
        private EventResponseEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
