package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ServerStatus implements ApiParameterObject {
    private int players;
    public void setPlayers(int val) {
        players = val;
    }
    @JsonProperty("players")
    public int getPlayers() {
        return players;
    }
    private String serverVersion;
    public void setServerVersion(String val) {
        serverVersion = val;
    }
    @JsonProperty("server_version")
    public String getServerVersion() {
        return serverVersion;
    }
    private Instant startTime;
    public void setStartTime(Instant val) {
        startTime = val;
    }
    @JsonProperty("start_time")
    public Instant getStartTime() {
        return startTime;
    }
    private Boolean vip;
    public void setVip(Boolean val) {
        vip = val;
    }
    @JsonProperty("vip")
    public Boolean getVip() {
        return vip;
    }
}
