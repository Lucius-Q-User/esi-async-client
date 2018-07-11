package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ResolvedItemId implements ApiParameterObject {
    private List<ResolvedName> agents;
    public void setAgents(List<ResolvedName> val) {
        agents = val;
    }
    @JsonProperty("agents")
    public List<ResolvedName> getAgents() {
        return agents;
    }
    private List<ResolvedName> alliances;
    public void setAlliances(List<ResolvedName> val) {
        alliances = val;
    }
    @JsonProperty("alliances")
    public List<ResolvedName> getAlliances() {
        return alliances;
    }
    private List<ResolvedName> characters;
    public void setCharacters(List<ResolvedName> val) {
        characters = val;
    }
    @JsonProperty("characters")
    public List<ResolvedName> getCharacters() {
        return characters;
    }
    private List<ResolvedName> constellations;
    public void setConstellations(List<ResolvedName> val) {
        constellations = val;
    }
    @JsonProperty("constellations")
    public List<ResolvedName> getConstellations() {
        return constellations;
    }
    private List<ResolvedName> corporations;
    public void setCorporations(List<ResolvedName> val) {
        corporations = val;
    }
    @JsonProperty("corporations")
    public List<ResolvedName> getCorporations() {
        return corporations;
    }
    private List<ResolvedName> factions;
    public void setFactions(List<ResolvedName> val) {
        factions = val;
    }
    @JsonProperty("factions")
    public List<ResolvedName> getFactions() {
        return factions;
    }
    private List<ResolvedName> inventoryTypes;
    public void setInventoryTypes(List<ResolvedName> val) {
        inventoryTypes = val;
    }
    @JsonProperty("inventory_types")
    public List<ResolvedName> getInventoryTypes() {
        return inventoryTypes;
    }
    private List<ResolvedName> regions;
    public void setRegions(List<ResolvedName> val) {
        regions = val;
    }
    @JsonProperty("regions")
    public List<ResolvedName> getRegions() {
        return regions;
    }
    private List<ResolvedName> stations;
    public void setStations(List<ResolvedName> val) {
        stations = val;
    }
    @JsonProperty("stations")
    public List<ResolvedName> getStations() {
        return stations;
    }
    private List<ResolvedName> systems;
    public void setSystems(List<ResolvedName> val) {
        systems = val;
    }
    @JsonProperty("systems")
    public List<ResolvedName> getSystems() {
        return systems;
    }
}
