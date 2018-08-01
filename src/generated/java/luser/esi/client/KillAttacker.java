package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KillAttacker {
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
    private Integer characterId;
    /**
     * character_id integer
     */
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    /**
     * character_id integer
     */
    @JsonProperty("character_id")
    public Integer getCharacterId() {
        return characterId;
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
    private int damageDone;
    /**
     * damage_done integer
     */
    public void setDamageDone(int val) {
        damageDone = val;
    }
    /**
     * damage_done integer
     */
    @JsonProperty("damage_done")
    public int getDamageDone() {
        return damageDone;
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
    private boolean finalBlow;
    /**
     * Was the attacker the one to achieve the final blow

     */
    public void setFinalBlow(boolean val) {
        finalBlow = val;
    }
    /**
     * Was the attacker the one to achieve the final blow

     */
    @JsonProperty("final_blow")
    public boolean getFinalBlow() {
        return finalBlow;
    }
    private float securityStatus;
    /**
     * Security status for the attacker

     */
    public void setSecurityStatus(float val) {
        securityStatus = val;
    }
    /**
     * Security status for the attacker

     */
    @JsonProperty("security_status")
    public float getSecurityStatus() {
        return securityStatus;
    }
    private Integer shipTypeId;
    /**
     * What ship was the attacker flying

     */
    public void setShipTypeId(Integer val) {
        shipTypeId = val;
    }
    /**
     * What ship was the attacker flying

     */
    @JsonProperty("ship_type_id")
    public Integer getShipTypeId() {
        return shipTypeId;
    }
    private Integer weaponTypeId;
    /**
     * What weapon was used by the attacker for the kill

     */
    public void setWeaponTypeId(Integer val) {
        weaponTypeId = val;
    }
    /**
     * What weapon was used by the attacker for the kill

     */
    @JsonProperty("weapon_type_id")
    public Integer getWeaponTypeId() {
        return weaponTypeId;
    }
}
