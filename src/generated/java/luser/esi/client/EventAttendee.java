package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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
    public static enum EventResponseEnum implements StringyEnum{
        DECLINED("declined"),
        NOT_RESPONDED("not_responded"),
        ACCEPTED("accepted"),
        TENTATIVE("tentative");
        private final String stringValue;
        private EventResponseEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
