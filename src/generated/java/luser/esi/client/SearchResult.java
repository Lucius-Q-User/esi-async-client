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
    public void setAgent(int[] val) {
        agent = val;
    }
    @JsonProperty("agent")
    public int[] getAgent() {
        return agent;
    }
    private int[] alliance;
    public void setAlliance(int[] val) {
        alliance = val;
    }
    @JsonProperty("alliance")
    public int[] getAlliance() {
        return alliance;
    }
    private int[] character;
    public void setCharacter(int[] val) {
        character = val;
    }
    @JsonProperty("character")
    public int[] getCharacter() {
        return character;
    }
    private int[] constellation;
    public void setConstellation(int[] val) {
        constellation = val;
    }
    @JsonProperty("constellation")
    public int[] getConstellation() {
        return constellation;
    }
    private int[] corporation;
    public void setCorporation(int[] val) {
        corporation = val;
    }
    @JsonProperty("corporation")
    public int[] getCorporation() {
        return corporation;
    }
    private int[] faction;
    public void setFaction(int[] val) {
        faction = val;
    }
    @JsonProperty("faction")
    public int[] getFaction() {
        return faction;
    }
    private int[] inventoryType;
    public void setInventoryType(int[] val) {
        inventoryType = val;
    }
    @JsonProperty("inventory_type")
    public int[] getInventoryType() {
        return inventoryType;
    }
    private int[] region;
    public void setRegion(int[] val) {
        region = val;
    }
    @JsonProperty("region")
    public int[] getRegion() {
        return region;
    }
    private int[] solarSystem;
    public void setSolarSystem(int[] val) {
        solarSystem = val;
    }
    @JsonProperty("solar_system")
    public int[] getSolarSystem() {
        return solarSystem;
    }
    private int[] station;
    public void setStation(int[] val) {
        station = val;
    }
    @JsonProperty("station")
    public int[] getStation() {
        return station;
    }
}
