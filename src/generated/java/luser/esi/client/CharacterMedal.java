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
    /**
     * corporation_id integer
     */
    public void setCorporationId(int val) {
        corporationId = val;
    }
    /**
     * corporation_id integer
     */
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
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
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private List<MedalGraphic> graphics;
    /**
     * graphics array
     */
    public void setGraphics(List<MedalGraphic> val) {
        graphics = val;
    }
    /**
     * graphics array
     */
    @JsonProperty("graphics")
    public List<MedalGraphic> getGraphics() {
        return graphics;
    }
    private int issuerId;
    /**
     * issuer_id integer
     */
    public void setIssuerId(int val) {
        issuerId = val;
    }
    /**
     * issuer_id integer
     */
    @JsonProperty("issuer_id")
    public int getIssuerId() {
        return issuerId;
    }
    private int medalId;
    /**
     * medal_id integer
     */
    public void setMedalId(int val) {
        medalId = val;
    }
    /**
     * medal_id integer
     */
    @JsonProperty("medal_id")
    public int getMedalId() {
        return medalId;
    }
    private String reason;
    /**
     * reason string
     */
    public void setReason(String val) {
        reason = val;
    }
    /**
     * reason string
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }
    private StatusEnum status;
    /**
     * status string
     */
    public void setStatus(StatusEnum val) {
        status = val;
    }
    /**
     * status string
     */
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
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
