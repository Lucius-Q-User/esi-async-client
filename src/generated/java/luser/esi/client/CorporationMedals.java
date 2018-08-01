package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationMedals {
    private Instant createdAt;
    /**
     * created_at string
     */
    public void setCreatedAt(Instant val) {
        createdAt = val;
    }
    /**
     * created_at string
     */
    @JsonProperty("created_at")
    public Instant getCreatedAt() {
        return createdAt;
    }
    private int creatorId;
    /**
     * ID of the character who created this medal
     */
    public void setCreatorId(int val) {
        creatorId = val;
    }
    /**
     * ID of the character who created this medal
     */
    @JsonProperty("creator_id")
    public int getCreatorId() {
        return creatorId;
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
