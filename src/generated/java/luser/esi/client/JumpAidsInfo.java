package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JumpAidsInfo {
    private Instant jumpFatigueExpireDate;
    /**
     * Character's jump fatigue expiry
     */
    public void setJumpFatigueExpireDate(Instant val) {
        jumpFatigueExpireDate = val;
    }
    /**
     * Character's jump fatigue expiry
     */
    @JsonProperty("jump_fatigue_expire_date")
    public Instant getJumpFatigueExpireDate() {
        return jumpFatigueExpireDate;
    }
    private Instant lastJumpDate;
    /**
     * Character's last jump activation
     */
    public void setLastJumpDate(Instant val) {
        lastJumpDate = val;
    }
    /**
     * Character's last jump activation
     */
    @JsonProperty("last_jump_date")
    public Instant getLastJumpDate() {
        return lastJumpDate;
    }
    private Instant lastUpdateDate;
    /**
     * Character's last jump update
     */
    public void setLastUpdateDate(Instant val) {
        lastUpdateDate = val;
    }
    /**
     * Character's last jump update
     */
    @JsonProperty("last_update_date")
    public Instant getLastUpdateDate() {
        return lastUpdateDate;
    }
}
