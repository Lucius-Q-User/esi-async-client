package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class DogmaAttributeInfo implements ApiParameterObject {
    private int attributeId;
    public void setAttributeId(int val) {
        attributeId = val;
    }
    @JsonProperty("attribute_id")
    public int getAttributeId() {
        return attributeId;
    }
    private Float defaultValue;
    public void setDefaultValue(Float val) {
        defaultValue = val;
    }
    @JsonProperty("default_value")
    public Float getDefaultValue() {
        return defaultValue;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private String displayName;
    public void setDisplayName(String val) {
        displayName = val;
    }
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }
    private Boolean highIsGood;
    public void setHighIsGood(Boolean val) {
        highIsGood = val;
    }
    @JsonProperty("high_is_good")
    public Boolean getHighIsGood() {
        return highIsGood;
    }
    private Integer iconId;
    public void setIconId(Integer val) {
        iconId = val;
    }
    @JsonProperty("icon_id")
    public Integer getIconId() {
        return iconId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Boolean published;
    public void setPublished(Boolean val) {
        published = val;
    }
    @JsonProperty("published")
    public Boolean getPublished() {
        return published;
    }
    private Boolean stackable;
    public void setStackable(Boolean val) {
        stackable = val;
    }
    @JsonProperty("stackable")
    public Boolean getStackable() {
        return stackable;
    }
    private Integer unitId;
    public void setUnitId(Integer val) {
        unitId = val;
    }
    @JsonProperty("unit_id")
    public Integer getUnitId() {
        return unitId;
    }
}
