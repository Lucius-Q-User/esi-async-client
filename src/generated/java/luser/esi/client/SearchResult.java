package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SearchResult implements ApiParameterObject {
    private int[] agent;
    /**
     * agent array
     */
    public void setAgent(int[] val) {
        agent = val;
    }
    /**
     * agent array
     */
    @JsonProperty("agent")
    public int[] getAgent() {
        return agent;
    }
    private int[] alliance;
    /**
     * alliance array
     */
    public void setAlliance(int[] val) {
        alliance = val;
    }
    /**
     * alliance array
     */
    @JsonProperty("alliance")
    public int[] getAlliance() {
        return alliance;
    }
    private int[] character;
    /**
     * character array
     */
    public void setCharacter(int[] val) {
        character = val;
    }
    /**
     * character array
     */
    @JsonProperty("character")
    public int[] getCharacter() {
        return character;
    }
    private int[] constellation;
    /**
     * constellation array
     */
    public void setConstellation(int[] val) {
        constellation = val;
    }
    /**
     * constellation array
     */
    @JsonProperty("constellation")
    public int[] getConstellation() {
        return constellation;
    }
    private int[] corporation;
    /**
     * corporation array
     */
    public void setCorporation(int[] val) {
        corporation = val;
    }
    /**
     * corporation array
     */
    @JsonProperty("corporation")
    public int[] getCorporation() {
        return corporation;
    }
    private int[] faction;
    /**
     * faction array
     */
    public void setFaction(int[] val) {
        faction = val;
    }
    /**
     * faction array
     */
    @JsonProperty("faction")
    public int[] getFaction() {
        return faction;
    }
    private int[] inventoryType;
    /**
     * inventory_type array
     */
    public void setInventoryType(int[] val) {
        inventoryType = val;
    }
    /**
     * inventory_type array
     */
    @JsonProperty("inventory_type")
    public int[] getInventoryType() {
        return inventoryType;
    }
    private int[] region;
    /**
     * region array
     */
    public void setRegion(int[] val) {
        region = val;
    }
    /**
     * region array
     */
    @JsonProperty("region")
    public int[] getRegion() {
        return region;
    }
    private int[] solarSystem;
    /**
     * solar_system array
     */
    public void setSolarSystem(int[] val) {
        solarSystem = val;
    }
    /**
     * solar_system array
     */
    @JsonProperty("solar_system")
    public int[] getSolarSystem() {
        return solarSystem;
    }
    private int[] station;
    /**
     * station array
     */
    public void setStation(int[] val) {
        station = val;
    }
    /**
     * station array
     */
    @JsonProperty("station")
    public int[] getStation() {
        return station;
    }
}
