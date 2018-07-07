package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FleetInfo {
    private boolean isFreeMove;
    public void setIsFreeMove(boolean val) {
        isFreeMove = val;
    }
    public boolean getIsFreeMove() {
        return isFreeMove;
    }
    private boolean isRegistered;
    public void setIsRegistered(boolean val) {
        isRegistered = val;
    }
    public boolean getIsRegistered() {
        return isRegistered;
    }
    private boolean isVoiceEnabled;
    public void setIsVoiceEnabled(boolean val) {
        isVoiceEnabled = val;
    }
    public boolean getIsVoiceEnabled() {
        return isVoiceEnabled;
    }
    private String motd;
    public void setMotd(String val) {
        motd = val;
    }
    public String getMotd() {
        return motd;
    }
    static FleetInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FleetInfo self = new FleetInfo();
        Map<String, Json> js = json.asJsonMap();
        self.isFreeMove = ApiClientBase.optGetBoolean(js.get("is_free_move"));
        self.isRegistered = ApiClientBase.optGetBoolean(js.get("is_registered"));
        self.isVoiceEnabled = ApiClientBase.optGetBoolean(js.get("is_voice_enabled"));
        self.motd = ApiClientBase.optGetString(js.get("motd"));
        return self;
    }
}
