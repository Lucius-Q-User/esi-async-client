package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CalendarInfo {
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
    private CalendarEventResponseEnum eventResponse;
    /**
     * event_response string
     */
    public void setEventResponse(CalendarEventResponseEnum val) {
        eventResponse = val;
    }
    /**
     * event_response string
     */
    @JsonProperty("event_response")
    public CalendarEventResponseEnum getEventResponse() {
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
}
