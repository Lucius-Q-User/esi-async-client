package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class EventAttendee implements ApiParameterObject {
    private Integer characterId;
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public Integer getCharacterId() {
        return characterId;
    }
    private EventResponseEnum eventResponse;
    public void setEventResponse(EventResponseEnum val) {
        eventResponse = val;
    }
    @JsonProperty("event_response")
    public EventResponseEnum getEventResponse() {
        return eventResponse;
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
