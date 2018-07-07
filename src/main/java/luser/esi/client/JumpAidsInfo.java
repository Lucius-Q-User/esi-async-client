package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class JumpAidsInfo {
    private String jumpFatigueExpireDate;
    public void setJumpFatigueExpireDate(String val) {
        jumpFatigueExpireDate = val;
    }
    public String getJumpFatigueExpireDate() {
        return jumpFatigueExpireDate;
    }
    private String lastJumpDate;
    public void setLastJumpDate(String val) {
        lastJumpDate = val;
    }
    public String getLastJumpDate() {
        return lastJumpDate;
    }
    private String lastUpdateDate;
    public void setLastUpdateDate(String val) {
        lastUpdateDate = val;
    }
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }
    static JumpAidsInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        JumpAidsInfo self = new JumpAidsInfo();
        Map<String, Json> js = json.asJsonMap();
        self.jumpFatigueExpireDate = ApiClientBase.optGetString(js.get("jump_fatigue_expire_date"));
        self.lastJumpDate = ApiClientBase.optGetString(js.get("last_jump_date"));
        self.lastUpdateDate = ApiClientBase.optGetString(js.get("last_update_date"));
        return self;
    }
}
