package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class DgmEffectValue {
    private int effectId;
    public void setEffectId(int val) {
        effectId = val;
    }
    public int getEffectId() {
        return effectId;
    }
    private boolean isDefault;
    public void setIsDefault(boolean val) {
        isDefault = val;
    }
    public boolean getIsDefault() {
        return isDefault;
    }
    static DgmEffectValue fromJson(Json json) {
        if (json == null) {
            return null;
        }
        DgmEffectValue self = new DgmEffectValue();
        Map<String, Json> js = json.asJsonMap();
        self.effectId = ApiClientBase.optGetInteger(js.get("effect_id"));
        self.isDefault = ApiClientBase.optGetBoolean(js.get("is_default"));
        return self;
    }
}
