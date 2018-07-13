package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class DogmaEffectIfno implements ApiParameterObject {
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private Boolean disallowAutoRepeat;
    public void setDisallowAutoRepeat(Boolean val) {
        disallowAutoRepeat = val;
    }
    @JsonProperty("disallow_auto_repeat")
    public Boolean getDisallowAutoRepeat() {
        return disallowAutoRepeat;
    }
    private Integer dischargeAttributeId;
    public void setDischargeAttributeId(Integer val) {
        dischargeAttributeId = val;
    }
    @JsonProperty("discharge_attribute_id")
    public Integer getDischargeAttributeId() {
        return dischargeAttributeId;
    }
    private String displayName;
    public void setDisplayName(String val) {
        displayName = val;
    }
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }
    private Integer durationAttributeId;
    public void setDurationAttributeId(Integer val) {
        durationAttributeId = val;
    }
    @JsonProperty("duration_attribute_id")
    public Integer getDurationAttributeId() {
        return durationAttributeId;
    }
    private Integer effectCategory;
    public void setEffectCategory(Integer val) {
        effectCategory = val;
    }
    @JsonProperty("effect_category")
    public Integer getEffectCategory() {
        return effectCategory;
    }
    private int effectId;
    public void setEffectId(int val) {
        effectId = val;
    }
    @JsonProperty("effect_id")
    public int getEffectId() {
        return effectId;
    }
    private Boolean electronicChance;
    public void setElectronicChance(Boolean val) {
        electronicChance = val;
    }
    @JsonProperty("electronic_chance")
    public Boolean getElectronicChance() {
        return electronicChance;
    }
    private Integer falloffAttributeId;
    public void setFalloffAttributeId(Integer val) {
        falloffAttributeId = val;
    }
    @JsonProperty("falloff_attribute_id")
    public Integer getFalloffAttributeId() {
        return falloffAttributeId;
    }
    private Integer iconId;
    public void setIconId(Integer val) {
        iconId = val;
    }
    @JsonProperty("icon_id")
    public Integer getIconId() {
        return iconId;
    }
    private Boolean isAssistance;
    public void setIsAssistance(Boolean val) {
        isAssistance = val;
    }
    @JsonProperty("is_assistance")
    public Boolean getIsAssistance() {
        return isAssistance;
    }
    private Boolean isOffensive;
    public void setIsOffensive(Boolean val) {
        isOffensive = val;
    }
    @JsonProperty("is_offensive")
    public Boolean getIsOffensive() {
        return isOffensive;
    }
    private Boolean isWarpSafe;
    public void setIsWarpSafe(Boolean val) {
        isWarpSafe = val;
    }
    @JsonProperty("is_warp_safe")
    public Boolean getIsWarpSafe() {
        return isWarpSafe;
    }
    private List<DgmEffectModifier> modifiers;
    public void setModifiers(List<DgmEffectModifier> val) {
        modifiers = val;
    }
    @JsonProperty("modifiers")
    public List<DgmEffectModifier> getModifiers() {
        return modifiers;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Integer postExpression;
    public void setPostExpression(Integer val) {
        postExpression = val;
    }
    @JsonProperty("post_expression")
    public Integer getPostExpression() {
        return postExpression;
    }
    private Integer preExpression;
    public void setPreExpression(Integer val) {
        preExpression = val;
    }
    @JsonProperty("pre_expression")
    public Integer getPreExpression() {
        return preExpression;
    }
    private Boolean published;
    public void setPublished(Boolean val) {
        published = val;
    }
    @JsonProperty("published")
    public Boolean getPublished() {
        return published;
    }
    private Integer rangeAttributeId;
    public void setRangeAttributeId(Integer val) {
        rangeAttributeId = val;
    }
    @JsonProperty("range_attribute_id")
    public Integer getRangeAttributeId() {
        return rangeAttributeId;
    }
    private Boolean rangeChance;
    public void setRangeChance(Boolean val) {
        rangeChance = val;
    }
    @JsonProperty("range_chance")
    public Boolean getRangeChance() {
        return rangeChance;
    }
    private Integer trackingSpeedAttributeId;
    public void setTrackingSpeedAttributeId(Integer val) {
        trackingSpeedAttributeId = val;
    }
    @JsonProperty("tracking_speed_attribute_id")
    public Integer getTrackingSpeedAttributeId() {
        return trackingSpeedAttributeId;
    }
}
