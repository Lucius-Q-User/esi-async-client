package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CalendarEvent {
    private Instant date;
    public void setDate(Instant val) {
        date = val;
    }
    public Instant getDate() {
        return date;
    }
    private int duration;
    public void setDuration(int val) {
        duration = val;
    }
    public int getDuration() {
        return duration;
    }
    private int eventId;
    public void setEventId(int val) {
        eventId = val;
    }
    public int getEventId() {
        return eventId;
    }
    private int importance;
    public void setImportance(int val) {
        importance = val;
    }
    public int getImportance() {
        return importance;
    }
    private int ownerId;
    public void setOwnerId(int val) {
        ownerId = val;
    }
    public int getOwnerId() {
        return ownerId;
    }
    private String ownerName;
    public void setOwnerName(String val) {
        ownerName = val;
    }
    public String getOwnerName() {
        return ownerName;
    }
    private OwnerTypeEnum ownerType;
    public void setOwnerType(OwnerTypeEnum val) {
        ownerType = val;
    }
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }
    private String response;
    public void setResponse(String val) {
        response = val;
    }
    public String getResponse() {
        return response;
    }
    private String text;
    public void setText(String val) {
        text = val;
    }
    public String getText() {
        return text;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    public String getTitle() {
        return title;
    }
    static CalendarEvent fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CalendarEvent self = new CalendarEvent();
        Map<String, Json> js = json.asJsonMap();
        self.date = ApiClientBase.optGetInstant(js.get("date"));
        self.duration = ApiClientBase.optGetInteger(js.get("duration"));
        self.eventId = ApiClientBase.optGetInteger(js.get("event_id"));
        self.importance = ApiClientBase.optGetInteger(js.get("importance"));
        self.ownerId = ApiClientBase.optGetInteger(js.get("owner_id"));
        self.ownerName = ApiClientBase.optGetString(js.get("owner_name"));
        self.ownerType = OwnerTypeEnum.fromString(ApiClientBase.optGetString(js.get("owner_type")));
        self.response = ApiClientBase.optGetString(js.get("response"));
        self.text = ApiClientBase.optGetString(js.get("text"));
        self.title = ApiClientBase.optGetString(js.get("title"));
        return self;
    }
    public static enum OwnerTypeEnum {
        EVE_SERVER("eve_server"),
        CORPORATION("corporation"),
        FACTION("faction"),
        CHARACTER("character"),
        ALLIANCE("alliance");
        public final String stringValue;
        private OwnerTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static OwnerTypeEnum fromString(String str) {
            for (OwnerTypeEnum self : OwnerTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
