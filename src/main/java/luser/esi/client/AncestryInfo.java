package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class AncestryInfo implements ApiParameterObject {
    private int bloodlineId;
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    @JsonProperty("bloodline_id")
    public int getBloodlineId() {
        return bloodlineId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private Integer iconId;
    public void setIconId(Integer val) {
        iconId = val;
    }
    @JsonProperty("icon_id")
    public Integer getIconId() {
        return iconId;
    }
    private int id;
    public void setId(int val) {
        id = val;
    }
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private String shortDescription;
    public void setShortDescription(String val) {
        shortDescription = val;
    }
    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
    }
}
