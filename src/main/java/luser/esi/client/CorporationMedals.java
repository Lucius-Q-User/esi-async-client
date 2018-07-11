package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationMedals implements ApiParameterObject {
    private Instant createdAt;
    public void setCreatedAt(Instant val) {
        createdAt = val;
    }
    @JsonProperty("created_at")
    public Instant getCreatedAt() {
        return createdAt;
    }
    private int creatorId;
    public void setCreatorId(int val) {
        creatorId = val;
    }
    @JsonProperty("creator_id")
    public int getCreatorId() {
        return creatorId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int medalId;
    public void setMedalId(int val) {
        medalId = val;
    }
    @JsonProperty("medal_id")
    public int getMedalId() {
        return medalId;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
}
