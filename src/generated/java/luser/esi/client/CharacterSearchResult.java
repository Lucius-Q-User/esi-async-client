package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterSearchResult implements ApiParameterObject {
    private IntArrayList agent;
    /**
     * agent array
     */
    public void setAgent(IntArrayList val) {
        agent = val;
    }
    /**
     * agent array
     */
    @JsonProperty("agent")
    public IntArrayList getAgent() {
        return agent;
    }
    private IntArrayList alliance;
    /**
     * alliance array
     */
    public void setAlliance(IntArrayList val) {
        alliance = val;
    }
    /**
     * alliance array
     */
    @JsonProperty("alliance")
    public IntArrayList getAlliance() {
        return alliance;
    }
    private IntArrayList character;
    /**
     * character array
     */
    public void setCharacter(IntArrayList val) {
        character = val;
    }
    /**
     * character array
     */
    @JsonProperty("character")
    public IntArrayList getCharacter() {
        return character;
    }
    private IntArrayList constellation;
    /**
     * constellation array
     */
    public void setConstellation(IntArrayList val) {
        constellation = val;
    }
    /**
     * constellation array
     */
    @JsonProperty("constellation")
    public IntArrayList getConstellation() {
        return constellation;
    }
    private IntArrayList corporation;
    /**
     * corporation array
     */
    public void setCorporation(IntArrayList val) {
        corporation = val;
    }
    /**
     * corporation array
     */
    @JsonProperty("corporation")
    public IntArrayList getCorporation() {
        return corporation;
    }
    private IntArrayList faction;
    /**
     * faction array
     */
    public void setFaction(IntArrayList val) {
        faction = val;
    }
    /**
     * faction array
     */
    @JsonProperty("faction")
    public IntArrayList getFaction() {
        return faction;
    }
    private IntArrayList inventoryType;
    /**
     * inventory_type array
     */
    public void setInventoryType(IntArrayList val) {
        inventoryType = val;
    }
    /**
     * inventory_type array
     */
    @JsonProperty("inventory_type")
    public IntArrayList getInventoryType() {
        return inventoryType;
    }
    private IntArrayList region;
    /**
     * region array
     */
    public void setRegion(IntArrayList val) {
        region = val;
    }
    /**
     * region array
     */
    @JsonProperty("region")
    public IntArrayList getRegion() {
        return region;
    }
    private IntArrayList solarSystem;
    /**
     * solar_system array
     */
    public void setSolarSystem(IntArrayList val) {
        solarSystem = val;
    }
    /**
     * solar_system array
     */
    @JsonProperty("solar_system")
    public IntArrayList getSolarSystem() {
        return solarSystem;
    }
    private IntArrayList station;
    /**
     * station array
     */
    public void setStation(IntArrayList val) {
        station = val;
    }
    /**
     * station array
     */
    @JsonProperty("station")
    public IntArrayList getStation() {
        return station;
    }
    private LongArrayList structure;
    /**
     * structure array
     */
    public void setStructure(LongArrayList val) {
        structure = val;
    }
    /**
     * structure array
     */
    @JsonProperty("structure")
    public LongArrayList getStructure() {
        return structure;
    }
}
