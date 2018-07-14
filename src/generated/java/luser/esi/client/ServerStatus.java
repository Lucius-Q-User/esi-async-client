package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServerStatus implements ApiParameterObject {
    private int players;
    /**
     * Current online player count
     */
    public void setPlayers(int val) {
        players = val;
    }
    /**
     * Current online player count
     */
    @JsonProperty("players")
    public int getPlayers() {
        return players;
    }
    private String serverVersion;
    /**
     * Running version as string
     */
    public void setServerVersion(String val) {
        serverVersion = val;
    }
    /**
     * Running version as string
     */
    @JsonProperty("server_version")
    public String getServerVersion() {
        return serverVersion;
    }
    private Instant startTime;
    /**
     * Server start timestamp
     */
    public void setStartTime(Instant val) {
        startTime = val;
    }
    /**
     * Server start timestamp
     */
    @JsonProperty("start_time")
    public Instant getStartTime() {
        return startTime;
    }
    private Boolean vip;
    /**
     * If the server is in VIP mode
     */
    public void setVip(Boolean val) {
        vip = val;
    }
    /**
     * If the server is in VIP mode
     */
    @JsonProperty("vip")
    public Boolean getVip() {
        return vip;
    }
}
