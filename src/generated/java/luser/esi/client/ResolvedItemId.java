package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ResolvedItemId implements ApiParameterObject {
    private List<ResolvedName> agents;
    /**
     * agents array
     */
    public void setAgents(List<ResolvedName> val) {
        agents = val;
    }
    /**
     * agents array
     */
    @JsonProperty("agents")
    public List<ResolvedName> getAgents() {
        return agents;
    }
    private List<ResolvedName> alliances;
    /**
     * alliances array
     */
    public void setAlliances(List<ResolvedName> val) {
        alliances = val;
    }
    /**
     * alliances array
     */
    @JsonProperty("alliances")
    public List<ResolvedName> getAlliances() {
        return alliances;
    }
    private List<ResolvedName> characters;
    /**
     * characters array
     */
    public void setCharacters(List<ResolvedName> val) {
        characters = val;
    }
    /**
     * characters array
     */
    @JsonProperty("characters")
    public List<ResolvedName> getCharacters() {
        return characters;
    }
    private List<ResolvedName> constellations;
    /**
     * constellations array
     */
    public void setConstellations(List<ResolvedName> val) {
        constellations = val;
    }
    /**
     * constellations array
     */
    @JsonProperty("constellations")
    public List<ResolvedName> getConstellations() {
        return constellations;
    }
    private List<ResolvedName> corporations;
    /**
     * corporations array
     */
    public void setCorporations(List<ResolvedName> val) {
        corporations = val;
    }
    /**
     * corporations array
     */
    @JsonProperty("corporations")
    public List<ResolvedName> getCorporations() {
        return corporations;
    }
    private List<ResolvedName> factions;
    /**
     * factions array
     */
    public void setFactions(List<ResolvedName> val) {
        factions = val;
    }
    /**
     * factions array
     */
    @JsonProperty("factions")
    public List<ResolvedName> getFactions() {
        return factions;
    }
    private List<ResolvedName> inventoryTypes;
    /**
     * inventory_types array
     */
    public void setInventoryTypes(List<ResolvedName> val) {
        inventoryTypes = val;
    }
    /**
     * inventory_types array
     */
    @JsonProperty("inventory_types")
    public List<ResolvedName> getInventoryTypes() {
        return inventoryTypes;
    }
    private List<ResolvedName> regions;
    /**
     * regions array
     */
    public void setRegions(List<ResolvedName> val) {
        regions = val;
    }
    /**
     * regions array
     */
    @JsonProperty("regions")
    public List<ResolvedName> getRegions() {
        return regions;
    }
    private List<ResolvedName> stations;
    /**
     * stations array
     */
    public void setStations(List<ResolvedName> val) {
        stations = val;
    }
    /**
     * stations array
     */
    @JsonProperty("stations")
    public List<ResolvedName> getStations() {
        return stations;
    }
    private List<ResolvedName> systems;
    /**
     * systems array
     */
    public void setSystems(List<ResolvedName> val) {
        systems = val;
    }
    /**
     * systems array
     */
    @JsonProperty("systems")
    public List<ResolvedName> getSystems() {
        return systems;
    }
}
