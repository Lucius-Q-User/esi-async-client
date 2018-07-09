package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SystemKills {
    private int npcKills;
    public void setNpcKills(int val) {
        npcKills = val;
    }
    public int getNpcKills() {
        return npcKills;
    }
    private int podKills;
    public void setPodKills(int val) {
        podKills = val;
    }
    public int getPodKills() {
        return podKills;
    }
    private int shipKills;
    public void setShipKills(int val) {
        shipKills = val;
    }
    public int getShipKills() {
        return shipKills;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    static SystemKills fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SystemKills self = new SystemKills();
        Map<String, Json> js = json.asJsonMap();
        self.npcKills = ApiClientBase.optGetInteger(js.get("npc_kills"));
        self.podKills = ApiClientBase.optGetInteger(js.get("pod_kills"));
        self.shipKills = ApiClientBase.optGetInteger(js.get("ship_kills"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        return self;
    }
}
