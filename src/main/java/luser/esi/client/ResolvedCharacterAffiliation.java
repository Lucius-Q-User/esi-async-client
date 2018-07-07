package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ResolvedCharacterAffiliation {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    public Integer getAllianceId() {
        return allianceId;
    }
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    public int getCharacterId() {
        return characterId;
    }
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    public int getCorporationId() {
        return corporationId;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    static ResolvedCharacterAffiliation fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ResolvedCharacterAffiliation self = new ResolvedCharacterAffiliation();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        return self;
    }
}
