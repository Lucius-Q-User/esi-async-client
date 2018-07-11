package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterMedal implements ApiParameterObject {
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private Instant date;
    public void setDate(Instant val) {
        date = val;
    }
    @JsonProperty("date")
    public Instant getDate() {
        return date;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private List<MedalGraphic> graphics;
    public void setGraphics(List<MedalGraphic> val) {
        graphics = val;
    }
    @JsonProperty("graphics")
    public List<MedalGraphic> getGraphics() {
        return graphics;
    }
    private int issuerId;
    public void setIssuerId(int val) {
        issuerId = val;
    }
    @JsonProperty("issuer_id")
    public int getIssuerId() {
        return issuerId;
    }
    private int medalId;
    public void setMedalId(int val) {
        medalId = val;
    }
    @JsonProperty("medal_id")
    public int getMedalId() {
        return medalId;
    }
    private String reason;
    public void setReason(String val) {
        reason = val;
    }
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }
    private StatusEnum status;
    public void setStatus(StatusEnum val) {
        status = val;
    }
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    public static enum StatusEnum {
        PUBLIC("public"),
        PRIVATE("private");
        private final String stringValue;
        private StatusEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static StatusEnum fromString(String str) {
            for (StatusEnum self : StatusEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
