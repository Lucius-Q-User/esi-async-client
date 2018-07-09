package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class EventAttendee {
    private Integer characterId;
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    public Integer getCharacterId() {
        return characterId;
    }
    private EventResponseEnum eventResponse;
    public void setEventResponse(EventResponseEnum val) {
        eventResponse = val;
    }
    public EventResponseEnum getEventResponse() {
        return eventResponse;
    }
    static EventAttendee fromJson(Json json) {
        if (json == null) {
            return null;
        }
        EventAttendee self = new EventAttendee();
        Map<String, Json> js = json.asJsonMap();
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.eventResponse = EventResponseEnum.fromString(ApiClientBase.optGetString(js.get("event_response")));
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
