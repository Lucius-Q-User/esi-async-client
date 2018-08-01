package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class CalendarEvent {
    private Instant date;
    /**
     * date string
     */
    public void setDate(Instant val) {
        date = val;
    }
    /**
     * date string
     */
    @JsonProperty("date")
    public Instant getDate() {
        return date;
    }
    private int duration;
    /**
     * Length in minutes
     */
    public void setDuration(int val) {
        duration = val;
    }
    /**
     * Length in minutes
     */
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }
    private int eventId;
    /**
     * event_id integer
     */
    public void setEventId(int val) {
        eventId = val;
    }
    /**
     * event_id integer
     */
    @JsonProperty("event_id")
    public int getEventId() {
        return eventId;
    }
    private int importance;
    /**
     * importance integer
     */
    public void setImportance(int val) {
        importance = val;
    }
    /**
     * importance integer
     */
    @JsonProperty("importance")
    public int getImportance() {
        return importance;
    }
    private int ownerId;
    /**
     * owner_id integer
     */
    public void setOwnerId(int val) {
        ownerId = val;
    }
    /**
     * owner_id integer
     */
    @JsonProperty("owner_id")
    public int getOwnerId() {
        return ownerId;
    }
    private String ownerName;
    /**
     * owner_name string
     */
    public void setOwnerName(String val) {
        ownerName = val;
    }
    /**
     * owner_name string
     */
    @JsonProperty("owner_name")
    public String getOwnerName() {
        return ownerName;
    }
    private OwnerTypeEnum ownerType;
    /**
     * owner_type string
     */
    public void setOwnerType(OwnerTypeEnum val) {
        ownerType = val;
    }
    /**
     * owner_type string
     */
    @JsonProperty("owner_type")
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }
    private String response;
    /**
     * response string
     */
    public void setResponse(String val) {
        response = val;
    }
    /**
     * response string
     */
    @JsonProperty("response")
    public String getResponse() {
        return response;
    }
    private String text;
    /**
     * text string
     */
    public void setText(String val) {
        text = val;
    }
    /**
     * text string
     */
    @JsonProperty("text")
    public String getText() {
        return text;
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
