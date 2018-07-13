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
    public void setIsFreeMove(boolean val) {
        isFreeMove = val;
    }
    @JsonProperty("is_free_move")
    public boolean getIsFreeMove() {
        return isFreeMove;
    }
    private boolean isRegistered;
    public void setIsRegistered(boolean val) {
        isRegistered = val;
    }
    @JsonProperty("is_registered")
    public boolean getIsRegistered() {
        return isRegistered;
    }
    private boolean isVoiceEnabled;
    public void setIsVoiceEnabled(boolean val) {
        isVoiceEnabled = val;
    }
    @JsonProperty("is_voice_enabled")
    public boolean getIsVoiceEnabled() {
        return isVoiceEnabled;
    }
    private String motd;
    public void setMotd(String val) {
        motd = val;
    }
    @JsonProperty("motd")
    public String getMotd() {
        return motd;
    }
}
