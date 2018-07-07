package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ServerStatus {
    private int players;
    public void setPlayers(int val) {
        players = val;
    }
    public int getPlayers() {
        return players;
    }
    private String serverVersion;
    public void setServerVersion(String val) {
        serverVersion = val;
    }
    public String getServerVersion() {
        return serverVersion;
    }
    private String startTime;
    public void setStartTime(String val) {
        startTime = val;
    }
    public String getStartTime() {
        return startTime;
    }
    private Boolean vip;
    public void setVip(Boolean val) {
        vip = val;
    }
    public Boolean getVip() {
        return vip;
    }
    static ServerStatus fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ServerStatus self = new ServerStatus();
        Map<String, Json> js = json.asJsonMap();
        self.players = ApiClientBase.optGetInteger(js.get("players"));
        self.serverVersion = ApiClientBase.optGetString(js.get("server_version"));
        self.startTime = ApiClientBase.optGetString(js.get("start_time"));
        self.vip = ApiClientBase.optGetBoolean(js.get("vip"));
        return self;
    }
}
