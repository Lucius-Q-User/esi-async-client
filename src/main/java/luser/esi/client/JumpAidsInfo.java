package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class JumpAidsInfo {
    private Instant jumpFatigueExpireDate;
    public void setJumpFatigueExpireDate(Instant val) {
        jumpFatigueExpireDate = val;
    }
    public Instant getJumpFatigueExpireDate() {
        return jumpFatigueExpireDate;
    }
    private Instant lastJumpDate;
    public void setLastJumpDate(Instant val) {
        lastJumpDate = val;
    }
    public Instant getLastJumpDate() {
        return lastJumpDate;
    }
    private Instant lastUpdateDate;
    public void setLastUpdateDate(Instant val) {
        lastUpdateDate = val;
    }
    public Instant getLastUpdateDate() {
        return lastUpdateDate;
    }
    static JumpAidsInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        JumpAidsInfo self = new JumpAidsInfo();
        Map<String, Json> js = json.asJsonMap();
        self.jumpFatigueExpireDate = ApiClientBase.optGetInstant(js.get("jump_fatigue_expire_date"));
        self.lastJumpDate = ApiClientBase.optGetInstant(js.get("last_jump_date"));
        self.lastUpdateDate = ApiClientBase.optGetInstant(js.get("last_update_date"));
        return self;
    }
}
