package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SovMap {
    private Integer allianceId;
    /**
     * alliance_id integer
     */
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    /**
     * alliance_id integer
     */
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer corporationId;
    /**
     * corporation_id integer
     */
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    /**
     * corporation_id integer
     */
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
    private Integer factionId;
    /**
     * faction_id integer
     */
    public void setFactionId(Integer val) {
        factionId = val;
    }
    /**
     * faction_id integer
     */
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
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
