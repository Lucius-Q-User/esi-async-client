package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class DogmaAttributeInfo implements ApiParameterObject {
    private int attributeId;
    /**
     * attribute_id integer
     */
    public void setAttributeId(int val) {
        attributeId = val;
    }
    /**
     * attribute_id integer
     */
    @JsonProperty("attribute_id")
    public int getAttributeId() {
        return attributeId;
    }
    private Float defaultValue;
    /**
     * default_value number
     */
    public void setDefaultValue(Float val) {
        defaultValue = val;
    }
    /**
     * default_value number
     */
    @JsonProperty("default_value")
    public Float getDefaultValue() {
        return defaultValue;
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
    private String displayName;
    /**
     * display_name string
     */
    public void setDisplayName(String val) {
        displayName = val;
    }
    /**
     * display_name string
     */
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }
    private Boolean highIsGood;
    /**
     * high_is_good boolean
     */
    public void setHighIsGood(Boolean val) {
        highIsGood = val;
    }
    /**
     * high_is_good boolean
     */
    @JsonProperty("high_is_good")
    public Boolean getHighIsGood() {
        return highIsGood;
    }
    private Integer iconId;
    /**
     * icon_id integer
     */
    public void setIconId(Integer val) {
        iconId = val;
    }
    /**
     * icon_id integer
     */
    @JsonProperty("icon_id")
    public Integer getIconId() {
        return iconId;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Boolean published;
    /**
     * published boolean
     */
    public void setPublished(Boolean val) {
        published = val;
    }
    /**
     * published boolean
     */
    @JsonProperty("published")
    public Boolean getPublished() {
        return published;
    }
    private Boolean stackable;
    /**
     * stackable boolean
     */
    public void setStackable(Boolean val) {
        stackable = val;
    }
    /**
     * stackable boolean
     */
    @JsonProperty("stackable")
    public Boolean getStackable() {
        return stackable;
    }
    private Integer unitId;
    /**
     * unit_id integer
     */
    public void setUnitId(Integer val) {
        unitId = val;
    }
    /**
     * unit_id integer
     */
    @JsonProperty("unit_id")
    public Integer getUnitId() {
        return unitId;
    }
}
