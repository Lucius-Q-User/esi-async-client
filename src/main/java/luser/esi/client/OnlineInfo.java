package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class OnlineInfo {
    private Instant lastLogin;
    public void setLastLogin(Instant val) {
        lastLogin = val;
    }
    public Instant getLastLogin() {
        return lastLogin;
    }
    private Instant lastLogout;
    public void setLastLogout(Instant val) {
        lastLogout = val;
    }
    public Instant getLastLogout() {
        return lastLogout;
    }
    private Integer logins;
    public void setLogins(Integer val) {
        logins = val;
    }
    public Integer getLogins() {
        return logins;
    }
    private boolean online;
    public void setOnline(boolean val) {
        online = val;
    }
    public boolean getOnline() {
        return online;
    }
    static OnlineInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        OnlineInfo self = new OnlineInfo();
        Map<String, Json> js = json.asJsonMap();
        self.lastLogin = ApiClientBase.optGetInstant(js.get("last_login"));
        self.lastLogout = ApiClientBase.optGetInstant(js.get("last_logout"));
        self.logins = ApiClientBase.optGetInteger(js.get("logins"));
        self.online = ApiClientBase.optGetBoolean(js.get("online"));
        return self;
    }
}
