package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CalendarEvent implements ApiParameterObject {
    private Instant date;
    public void setDate(Instant val) {
        date = val;
    }
    @JsonProperty("date")
    public Instant getDate() {
        return date;
    }
    private int duration;
    public void setDuration(int val) {
        duration = val;
    }
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }
    private int eventId;
    public void setEventId(int val) {
        eventId = val;
    }
    @JsonProperty("event_id")
    public int getEventId() {
        return eventId;
    }
    private int importance;
    public void setImportance(int val) {
        importance = val;
    }
    @JsonProperty("importance")
    public int getImportance() {
        return importance;
    }
    private int ownerId;
    public void setOwnerId(int val) {
        ownerId = val;
    }
    @JsonProperty("owner_id")
    public int getOwnerId() {
        return ownerId;
    }
    private String ownerName;
    public void setOwnerName(String val) {
        ownerName = val;
    }
    @JsonProperty("owner_name")
    public String getOwnerName() {
        return ownerName;
    }
    private OwnerTypeEnum ownerType;
    public void setOwnerType(OwnerTypeEnum val) {
        ownerType = val;
    }
    @JsonProperty("owner_type")
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }
    private String response;
    public void setResponse(String val) {
        response = val;
    }
    @JsonProperty("response")
    public String getResponse() {
        return response;
    }
    private String text;
    public void setText(String val) {
        text = val;
    }
    @JsonProperty("text")
    public String getText() {
        return text;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    public static enum OwnerTypeEnum {
        EVE_SERVER("eve_server"),
        CORPORATION("corporation"),
        FACTION("faction"),
        CHARACTER("character"),
        ALLIANCE("alliance");
        private final String stringValue;
        private OwnerTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
