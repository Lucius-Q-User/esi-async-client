package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class KillAttacker {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer characterId;
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    public Integer getCharacterId() {
        return characterId;
    }
    private Integer corporationId;
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    public Integer getCorporationId() {
        return corporationId;
    }
    private int damageDone;
    public void setDamageDone(int val) {
        damageDone = val;
    }
    public int getDamageDone() {
        return damageDone;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    private boolean finalBlow;
    public void setFinalBlow(boolean val) {
        finalBlow = val;
    }
    public boolean getFinalBlow() {
        return finalBlow;
    }
    private float securityStatus;
    public void setSecurityStatus(float val) {
        securityStatus = val;
    }
    public float getSecurityStatus() {
        return securityStatus;
    }
    private Integer shipTypeId;
    public void setShipTypeId(Integer val) {
        shipTypeId = val;
    }
    public Integer getShipTypeId() {
        return shipTypeId;
    }
    private Integer weaponTypeId;
    public void setWeaponTypeId(Integer val) {
        weaponTypeId = val;
    }
    public Integer getWeaponTypeId() {
        return weaponTypeId;
    }
    static KillAttacker fromJson(Json json) {
        if (json == null) {
            return null;
        }
        KillAttacker self = new KillAttacker();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.damageDone = ApiClientBase.optGetInteger(js.get("damage_done"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.finalBlow = ApiClientBase.optGetBoolean(js.get("final_blow"));
        self.securityStatus = ApiClientBase.optGetFloat(js.get("security_status"));
        self.shipTypeId = ApiClientBase.optGetInteger(js.get("ship_type_id"));
        self.weaponTypeId = ApiClientBase.optGetInteger(js.get("weapon_type_id"));
        return self;
    }
}
