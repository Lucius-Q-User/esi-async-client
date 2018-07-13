package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class JumpAidsInfo implements ApiParameterObject {
    private Instant jumpFatigueExpireDate;
    public void setJumpFatigueExpireDate(Instant val) {
        jumpFatigueExpireDate = val;
    }
    @JsonProperty("jump_fatigue_expire_date")
    public Instant getJumpFatigueExpireDate() {
        return jumpFatigueExpireDate;
    }
    private Instant lastJumpDate;
    public void setLastJumpDate(Instant val) {
        lastJumpDate = val;
    }
    @JsonProperty("last_jump_date")
    public Instant getLastJumpDate() {
        return lastJumpDate;
    }
    private Instant lastUpdateDate;
    public void setLastUpdateDate(Instant val) {
        lastUpdateDate = val;
    }
    @JsonProperty("last_update_date")
    public Instant getLastUpdateDate() {
        return lastUpdateDate;
    }
}
