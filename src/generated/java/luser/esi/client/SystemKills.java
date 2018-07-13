package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SystemKills implements ApiParameterObject {
    private int npcKills;
    public void setNpcKills(int val) {
        npcKills = val;
    }
    @JsonProperty("npc_kills")
    public int getNpcKills() {
        return npcKills;
    }
    private int podKills;
    public void setPodKills(int val) {
        podKills = val;
    }
    @JsonProperty("pod_kills")
    public int getPodKills() {
        return podKills;
    }
    private int shipKills;
    public void setShipKills(int val) {
        shipKills = val;
    }
    @JsonProperty("ship_kills")
    public int getShipKills() {
        return shipKills;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
}
