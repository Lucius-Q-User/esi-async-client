package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class DgmEffectValue implements ApiParameterObject {
    private int effectId;
    public void setEffectId(int val) {
        effectId = val;
    }
    @JsonProperty("effect_id")
    public int getEffectId() {
        return effectId;
    }
    private boolean isDefault;
    public void setIsDefault(boolean val) {
        isDefault = val;
    }
    @JsonProperty("is_default")
    public boolean getIsDefault() {
        return isDefault;
    }
}
