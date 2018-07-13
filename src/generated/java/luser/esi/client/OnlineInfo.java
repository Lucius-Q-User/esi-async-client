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
    /**
     * Timestamp of the last login
     */
    public void setLastLogin(Instant val) {
        lastLogin = val;
    }
    /**
     * Timestamp of the last login
     */
    @JsonProperty("last_login")
    public Instant getLastLogin() {
        return lastLogin;
    }
    private Instant lastLogout;
    /**
     * Timestamp of the last logout
     */
    public void setLastLogout(Instant val) {
        lastLogout = val;
    }
    /**
     * Timestamp of the last logout
     */
    @JsonProperty("last_logout")
    public Instant getLastLogout() {
        return lastLogout;
    }
    private Integer logins;
    /**
     * Total number of times the character has logged in
     */
    public void setLogins(Integer val) {
        logins = val;
    }
    /**
     * Total number of times the character has logged in
     */
    @JsonProperty("logins")
    public Integer getLogins() {
        return logins;
    }
    private boolean online;
    /**
     * If the character is online
     */
    public void setOnline(boolean val) {
        online = val;
    }
    /**
     * If the character is online
     */
    @JsonProperty("online")
    public boolean getOnline() {
        return online;
    }
}
