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
    private int damageTaken;
    /**
     * How much total damage was taken by the victim

     */
    public void setDamageTaken(int val) {
        damageTaken = val;
    }
    /**
     * How much total damage was taken by the victim

     */
    @JsonProperty("damage_taken")
    public int getDamageTaken() {
        return damageTaken;
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
    private List<KillItems> items;
    /**
     * items array
     */
    public void setItems(List<KillItems> val) {
        items = val;
    }
    /**
     * items array
     */
    @JsonProperty("items")
    public List<KillItems> getItems() {
        return items;
    }
    private Coordinate position;
    /**
     * Coordinates of the victim in Cartesian space relative to the Sun

     */
    public void setPosition(Coordinate val) {
        position = val;
    }
    /**
     * Coordinates of the victim in Cartesian space relative to the Sun

     */
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private int shipTypeId;
    /**
     * The ship that the victim was piloting and was destroyed

     */
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    /**
     * The ship that the victim was piloting and was destroyed

     */
    @JsonProperty("ship_type_id")
    public int getShipTypeId() {
        return shipTypeId;
    }
}
