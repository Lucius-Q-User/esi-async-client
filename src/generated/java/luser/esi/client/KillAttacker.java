package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class KillAttacker implements ApiParameterObject {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer characterId;
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public Integer getCharacterId() {
        return characterId;
    }
    private Integer corporationId;
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
    private int damageDone;
    public void setDamageDone(int val) {
        damageDone = val;
    }
    @JsonProperty("damage_done")
    public int getDamageDone() {
        return damageDone;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private boolean finalBlow;
    public void setFinalBlow(boolean val) {
        finalBlow = val;
    }
    @JsonProperty("final_blow")
    public boolean getFinalBlow() {
        return finalBlow;
    }
    private float securityStatus;
    public void setSecurityStatus(float val) {
        securityStatus = val;
    }
    @JsonProperty("security_status")
    public float getSecurityStatus() {
        return securityStatus;
    }
    private Integer shipTypeId;
    public void setShipTypeId(Integer val) {
        shipTypeId = val;
    }
    @JsonProperty("ship_type_id")
    public Integer getShipTypeId() {
        return shipTypeId;
    }
    private Integer weaponTypeId;
    public void setWeaponTypeId(Integer val) {
        weaponTypeId = val;
    }
    @JsonProperty("weapon_type_id")
    public Integer getWeaponTypeId() {
        return weaponTypeId;
    }
}
