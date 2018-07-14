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
public class DogmaEffectIfno implements ApiParameterObject {
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
    private Boolean disallowAutoRepeat;
    /**
     * disallow_auto_repeat boolean
     */
    public void setDisallowAutoRepeat(Boolean val) {
        disallowAutoRepeat = val;
    }
    /**
     * disallow_auto_repeat boolean
     */
    @JsonProperty("disallow_auto_repeat")
    public Boolean getDisallowAutoRepeat() {
        return disallowAutoRepeat;
    }
    private Integer dischargeAttributeId;
    /**
     * discharge_attribute_id integer
     */
    public void setDischargeAttributeId(Integer val) {
        dischargeAttributeId = val;
    }
    /**
     * discharge_attribute_id integer
     */
    @JsonProperty("discharge_attribute_id")
    public Integer getDischargeAttributeId() {
        return dischargeAttributeId;
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
    private Integer durationAttributeId;
    /**
     * duration_attribute_id integer
     */
    public void setDurationAttributeId(Integer val) {
        durationAttributeId = val;
    }
    /**
     * duration_attribute_id integer
     */
    @JsonProperty("duration_attribute_id")
    public Integer getDurationAttributeId() {
        return durationAttributeId;
    }
    private Integer effectCategory;
    /**
     * effect_category integer
     */
    public void setEffectCategory(Integer val) {
        effectCategory = val;
    }
    /**
     * effect_category integer
     */
    @JsonProperty("effect_category")
    public Integer getEffectCategory() {
        return effectCategory;
    }
    private int effectId;
    /**
     * effect_id integer
     */
    public void setEffectId(int val) {
        effectId = val;
    }
    /**
     * effect_id integer
     */
    @JsonProperty("effect_id")
    public int getEffectId() {
        return effectId;
    }
    private Boolean electronicChance;
    /**
     * electronic_chance boolean
     */
    public void setElectronicChance(Boolean val) {
        electronicChance = val;
    }
    /**
     * electronic_chance boolean
     */
    @JsonProperty("electronic_chance")
    public Boolean getElectronicChance() {
        return electronicChance;
    }
    private Integer falloffAttributeId;
    /**
     * falloff_attribute_id integer
     */
    public void setFalloffAttributeId(Integer val) {
        falloffAttributeId = val;
    }
    /**
     * falloff_attribute_id integer
     */
    @JsonProperty("falloff_attribute_id")
    public Integer getFalloffAttributeId() {
        return falloffAttributeId;
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
    private Boolean isAssistance;
    /**
     * is_assistance boolean
     */
    public void setIsAssistance(Boolean val) {
        isAssistance = val;
    }
    /**
     * is_assistance boolean
     */
    @JsonProperty("is_assistance")
    public Boolean getIsAssistance() {
        return isAssistance;
    }
    private Boolean isOffensive;
    /**
     * is_offensive boolean
     */
    public void setIsOffensive(Boolean val) {
        isOffensive = val;
    }
    /**
     * is_offensive boolean
     */
    @JsonProperty("is_offensive")
    public Boolean getIsOffensive() {
        return isOffensive;
    }
    private Boolean isWarpSafe;
    /**
     * is_warp_safe boolean
     */
    public void setIsWarpSafe(Boolean val) {
        isWarpSafe = val;
    }
    /**
     * is_warp_safe boolean
     */
    @JsonProperty("is_warp_safe")
    public Boolean getIsWarpSafe() {
        return isWarpSafe;
    }
    private List<DgmEffectModifier> modifiers;
    /**
     * modifiers array
     */
    public void setModifiers(List<DgmEffectModifier> val) {
        modifiers = val;
    }
    /**
     * modifiers array
     */
    @JsonProperty("modifiers")
    public List<DgmEffectModifier> getModifiers() {
        return modifiers;
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
    private Integer postExpression;
    /**
     * post_expression integer
     */
    public void setPostExpression(Integer val) {
        postExpression = val;
    }
    /**
     * post_expression integer
     */
    @JsonProperty("post_expression")
    public Integer getPostExpression() {
        return postExpression;
    }
    private Integer preExpression;
    /**
     * pre_expression integer
     */
    public void setPreExpression(Integer val) {
        preExpression = val;
    }
    /**
     * pre_expression integer
     */
    @JsonProperty("pre_expression")
    public Integer getPreExpression() {
        return preExpression;
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
    private Integer rangeAttributeId;
    /**
     * range_attribute_id integer
     */
    public void setRangeAttributeId(Integer val) {
        rangeAttributeId = val;
    }
    /**
     * range_attribute_id integer
     */
    @JsonProperty("range_attribute_id")
    public Integer getRangeAttributeId() {
        return rangeAttributeId;
    }
    private Boolean rangeChance;
    /**
     * range_chance boolean
     */
    public void setRangeChance(Boolean val) {
        rangeChance = val;
    }
    /**
     * range_chance boolean
     */
    @JsonProperty("range_chance")
    public Boolean getRangeChance() {
        return rangeChance;
    }
    private Integer trackingSpeedAttributeId;
    /**
     * tracking_speed_attribute_id integer
     */
    public void setTrackingSpeedAttributeId(Integer val) {
        trackingSpeedAttributeId = val;
    }
    /**
     * tracking_speed_attribute_id integer
     */
    @JsonProperty("tracking_speed_attribute_id")
    public Integer getTrackingSpeedAttributeId() {
        return trackingSpeedAttributeId;
    }
}
