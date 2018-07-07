package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class KillVictim {
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
    private int damageTaken;
    public void setDamageTaken(int val) {
        damageTaken = val;
    }
    public int getDamageTaken() {
        return damageTaken;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    private List<KillItems> items;
    public void setItems(List<KillItems> val) {
        items = val;
    }
    public List<KillItems> getItems() {
        return items;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    public Coordinate getPosition() {
        return position;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    public int getShipTypeId() {
        return shipTypeId;
    }
    static KillVictim fromJson(Json json) {
        if (json == null) {
            return null;
        }
        KillVictim self = new KillVictim();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.damageTaken = ApiClientBase.optGetInteger(js.get("damage_taken"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        {
            List<Json> jl = js.get("items").asJsonList();
            List<KillItems> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, KillItems.fromJson(jl.get(i)));
            }
            self.items = rt;
        }

        self.position = Coordinate.fromJson(js.get("position"));
        self.shipTypeId = ApiClientBase.optGetInteger(js.get("ship_type_id"));
        return self;
    }
}
