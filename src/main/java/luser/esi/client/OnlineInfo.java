package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class OnlineInfo implements ApiParameterObject {
    private Instant lastLogin;
    public void setLastLogin(Instant val) {
        lastLogin = val;
    }
    @JsonProperty("last_login")
    public Instant getLastLogin() {
        return lastLogin;
    }
    private Instant lastLogout;
    public void setLastLogout(Instant val) {
        lastLogout = val;
    }
    @JsonProperty("last_logout")
    public Instant getLastLogout() {
        return lastLogout;
    }
    private Integer logins;
    public void setLogins(Integer val) {
        logins = val;
    }
    @JsonProperty("logins")
    public Integer getLogins() {
        return logins;
    }
    private boolean online;
    public void setOnline(boolean val) {
        online = val;
    }
    @JsonProperty("online")
    public boolean getOnline() {
        return online;
    }
}
