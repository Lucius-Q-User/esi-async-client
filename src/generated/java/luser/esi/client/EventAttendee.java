package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventAttendee {
    private Integer characterId;
    /**
     * character_id integer
     */
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    /**
     * character_id integer
     */
    @JsonProperty("character_id")
    public Integer getCharacterId() {
        return characterId;
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
}
