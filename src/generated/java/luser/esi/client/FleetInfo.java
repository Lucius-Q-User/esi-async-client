package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FleetInfo implements ApiParameterObject {
    private boolean isFreeMove;
    /**
     * Is free-move enabled
     */
    public void setIsFreeMove(boolean val) {
        isFreeMove = val;
    }
    /**
     * Is free-move enabled
     */
    @JsonProperty("is_free_move")
    public boolean getIsFreeMove() {
        return isFreeMove;
    }
    private boolean isRegistered;
    /**
     * Does the fleet have an active fleet advertisement
     */
    public void setIsRegistered(boolean val) {
        isRegistered = val;
    }
    /**
     * Does the fleet have an active fleet advertisement
     */
    @JsonProperty("is_registered")
    public boolean getIsRegistered() {
        return isRegistered;
    }
    private boolean isVoiceEnabled;
    /**
     * Is EVE Voice enabled
     */
    public void setIsVoiceEnabled(boolean val) {
        isVoiceEnabled = val;
    }
    /**
     * Is EVE Voice enabled
     */
    @JsonProperty("is_voice_enabled")
    public boolean getIsVoiceEnabled() {
        return isVoiceEnabled;
    }
    private String motd;
    /**
     * Fleet MOTD in CCP flavoured HTML
     */
    public void setMotd(String val) {
        motd = val;
    }
    /**
     * Fleet MOTD in CCP flavoured HTML
     */
    @JsonProperty("motd")
    public String getMotd() {
        return motd;
    }
}
