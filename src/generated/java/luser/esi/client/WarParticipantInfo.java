package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WarParticipantInfo implements ApiParameterObject {
    private Integer allianceId;
    /**
     * Alliance ID if and only if the aggressor is an alliance
     */
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    /**
     * Alliance ID if and only if the aggressor is an alliance
     */
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer corporationId;
    /**
     * Corporation ID if and only if the aggressor is a corporation
     */
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    /**
     * Corporation ID if and only if the aggressor is a corporation
     */
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
    private float iskDestroyed;
    /**
     * ISK value of ships the aggressor has destroyed
     */
    public void setIskDestroyed(float val) {
        iskDestroyed = val;
    }
    /**
     * ISK value of ships the aggressor has destroyed
     */
    @JsonProperty("isk_destroyed")
    public float getIskDestroyed() {
        return iskDestroyed;
    }
    private int shipsKilled;
    /**
     * The number of ships the aggressor has killed
     */
    public void setShipsKilled(int val) {
        shipsKilled = val;
    }
    /**
     * The number of ships the aggressor has killed
     */
    @JsonProperty("ships_killed")
    public int getShipsKilled() {
        return shipsKilled;
    }
}
