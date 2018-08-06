package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterMedal {
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
    private MedalStatusEnum status;
    /**
     * status string
     */
    public void setStatus(MedalStatusEnum val) {
        status = val;
    }
    /**
     * status string
     */
    @JsonProperty("status")
    public MedalStatusEnum getStatus() {
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
}
