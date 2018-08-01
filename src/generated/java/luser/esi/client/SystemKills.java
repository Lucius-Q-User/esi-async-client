package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemKills {
    private int npcKills;
    /**
     * Number of NPC ships killed in this system
     */
    public void setNpcKills(int val) {
        npcKills = val;
    }
    /**
     * Number of NPC ships killed in this system
     */
    @JsonProperty("npc_kills")
    public int getNpcKills() {
        return npcKills;
    }
    private int podKills;
    /**
     * Number of pods killed in this system
     */
    public void setPodKills(int val) {
        podKills = val;
    }
    /**
     * Number of pods killed in this system
     */
    @JsonProperty("pod_kills")
    public int getPodKills() {
        return podKills;
    }
    private int shipKills;
    /**
     * Number of player ships killed in this system
     */
    public void setShipKills(int val) {
        shipKills = val;
    }
    /**
     * Number of player ships killed in this system
     */
    @JsonProperty("ship_kills")
    public int getShipKills() {
        return shipKills;
    }
    private int systemId;
    /**
     * system_id integer
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * system_id integer
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
}
