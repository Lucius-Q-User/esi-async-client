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
public class DgmEffectValue implements ApiParameterObject {
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
    private boolean isDefault;
    /**
     * is_default boolean
     */
    public void setIsDefault(boolean val) {
        isDefault = val;
    }
    /**
     * is_default boolean
     */
    @JsonProperty("is_default")
    public boolean getIsDefault() {
        return isDefault;
    }
}
