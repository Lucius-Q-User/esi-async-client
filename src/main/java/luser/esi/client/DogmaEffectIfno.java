package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class DogmaEffectIfno {
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private Boolean disallowAutoRepeat;
    public void setDisallowAutoRepeat(Boolean val) {
        disallowAutoRepeat = val;
    }
    public Boolean getDisallowAutoRepeat() {
        return disallowAutoRepeat;
    }
    private Integer dischargeAttributeId;
    public void setDischargeAttributeId(Integer val) {
        dischargeAttributeId = val;
    }
    public Integer getDischargeAttributeId() {
        return dischargeAttributeId;
    }
    private String displayName;
    public void setDisplayName(String val) {
        displayName = val;
    }
    public String getDisplayName() {
        return displayName;
    }
    private Integer durationAttributeId;
    public void setDurationAttributeId(Integer val) {
        durationAttributeId = val;
    }
    public Integer getDurationAttributeId() {
        return durationAttributeId;
    }
    private Integer effectCategory;
    public void setEffectCategory(Integer val) {
        effectCategory = val;
    }
    public Integer getEffectCategory() {
        return effectCategory;
    }
    private int effectId;
    public void setEffectId(int val) {
        effectId = val;
    }
    public int getEffectId() {
        return effectId;
    }
    private Boolean electronicChance;
    public void setElectronicChance(Boolean val) {
        electronicChance = val;
    }
    public Boolean getElectronicChance() {
        return electronicChance;
    }
    private Integer falloffAttributeId;
    public void setFalloffAttributeId(Integer val) {
        falloffAttributeId = val;
    }
    public Integer getFalloffAttributeId() {
        return falloffAttributeId;
    }
    private Integer iconId;
    public void setIconId(Integer val) {
        iconId = val;
    }
    public Integer getIconId() {
        return iconId;
    }
    private Boolean isAssistance;
    public void setIsAssistance(Boolean val) {
        isAssistance = val;
    }
    public Boolean getIsAssistance() {
        return isAssistance;
    }
    private Boolean isOffensive;
    public void setIsOffensive(Boolean val) {
        isOffensive = val;
    }
    public Boolean getIsOffensive() {
        return isOffensive;
    }
    private Boolean isWarpSafe;
    public void setIsWarpSafe(Boolean val) {
        isWarpSafe = val;
    }
    public Boolean getIsWarpSafe() {
        return isWarpSafe;
    }
    private List<DgmEffectModifier> modifiers;
    public void setModifiers(List<DgmEffectModifier> val) {
        modifiers = val;
    }
    public List<DgmEffectModifier> getModifiers() {
        return modifiers;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private Integer postExpression;
    public void setPostExpression(Integer val) {
        postExpression = val;
    }
    public Integer getPostExpression() {
        return postExpression;
    }
    private Integer preExpression;
    public void setPreExpression(Integer val) {
        preExpression = val;
    }
    public Integer getPreExpression() {
        return preExpression;
    }
    private Boolean published;
    public void setPublished(Boolean val) {
        published = val;
    }
    public Boolean getPublished() {
        return published;
    }
    private Integer rangeAttributeId;
    public void setRangeAttributeId(Integer val) {
        rangeAttributeId = val;
    }
    public Integer getRangeAttributeId() {
        return rangeAttributeId;
    }
    private Boolean rangeChance;
    public void setRangeChance(Boolean val) {
        rangeChance = val;
    }
    public Boolean getRangeChance() {
        return rangeChance;
    }
    private Integer trackingSpeedAttributeId;
    public void setTrackingSpeedAttributeId(Integer val) {
        trackingSpeedAttributeId = val;
    }
    public Integer getTrackingSpeedAttributeId() {
        return trackingSpeedAttributeId;
    }
    static DogmaEffectIfno fromJson(Json json) {
        if (json == null) {
            return null;
        }
        DogmaEffectIfno self = new DogmaEffectIfno();
        Map<String, Json> js = json.asJsonMap();
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.disallowAutoRepeat = ApiClientBase.optGetBoolean(js.get("disallow_auto_repeat"));
        self.dischargeAttributeId = ApiClientBase.optGetInteger(js.get("discharge_attribute_id"));
        self.displayName = ApiClientBase.optGetString(js.get("display_name"));
        self.durationAttributeId = ApiClientBase.optGetInteger(js.get("duration_attribute_id"));
        self.effectCategory = ApiClientBase.optGetInteger(js.get("effect_category"));
        self.effectId = ApiClientBase.optGetInteger(js.get("effect_id"));
        self.electronicChance = ApiClientBase.optGetBoolean(js.get("electronic_chance"));
        self.falloffAttributeId = ApiClientBase.optGetInteger(js.get("falloff_attribute_id"));
        self.iconId = ApiClientBase.optGetInteger(js.get("icon_id"));
        self.isAssistance = ApiClientBase.optGetBoolean(js.get("is_assistance"));
        self.isOffensive = ApiClientBase.optGetBoolean(js.get("is_offensive"));
        self.isWarpSafe = ApiClientBase.optGetBoolean(js.get("is_warp_safe"));
        {
            List<Json> jl = js.get("modifiers").asJsonList();
            List<DgmEffectModifier> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(DgmEffectModifier.fromJson(jl.get(i)));
            }
            self.modifiers = rt;
        }
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.postExpression = ApiClientBase.optGetInteger(js.get("post_expression"));
        self.preExpression = ApiClientBase.optGetInteger(js.get("pre_expression"));
        self.published = ApiClientBase.optGetBoolean(js.get("published"));
        self.rangeAttributeId = ApiClientBase.optGetInteger(js.get("range_attribute_id"));
        self.rangeChance = ApiClientBase.optGetBoolean(js.get("range_chance"));
        self.trackingSpeedAttributeId = ApiClientBase.optGetInteger(js.get("tracking_speed_attribute_id"));
        return self;
    }
}
