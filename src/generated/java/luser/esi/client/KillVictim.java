package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class KillVictim implements ApiParameterObject {
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
    private int damageTaken;
    public void setDamageTaken(int val) {
        damageTaken = val;
    }
    @JsonProperty("damage_taken")
    public int getDamageTaken() {
        return damageTaken;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private List<KillItems> items;
    public void setItems(List<KillItems> val) {
        items = val;
    }
    @JsonProperty("items")
    public List<KillItems> getItems() {
        return items;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    @JsonProperty("ship_type_id")
    public int getShipTypeId() {
        return shipTypeId;
    }
}
