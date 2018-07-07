package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ResolvedItemId {
    private List<ResolvedName> agents;
    public void setAgents(List<ResolvedName> val) {
        agents = val;
    }
    public List<ResolvedName> getAgents() {
        return agents;
    }
    private List<ResolvedName> alliances;
    public void setAlliances(List<ResolvedName> val) {
        alliances = val;
    }
    public List<ResolvedName> getAlliances() {
        return alliances;
    }
    private List<ResolvedName> characters;
    public void setCharacters(List<ResolvedName> val) {
        characters = val;
    }
    public List<ResolvedName> getCharacters() {
        return characters;
    }
    private List<ResolvedName> constellations;
    public void setConstellations(List<ResolvedName> val) {
        constellations = val;
    }
    public List<ResolvedName> getConstellations() {
        return constellations;
    }
    private List<ResolvedName> corporations;
    public void setCorporations(List<ResolvedName> val) {
        corporations = val;
    }
    public List<ResolvedName> getCorporations() {
        return corporations;
    }
    private List<ResolvedName> factions;
    public void setFactions(List<ResolvedName> val) {
        factions = val;
    }
    public List<ResolvedName> getFactions() {
        return factions;
    }
    private List<ResolvedName> inventoryTypes;
    public void setInventoryTypes(List<ResolvedName> val) {
        inventoryTypes = val;
    }
    public List<ResolvedName> getInventoryTypes() {
        return inventoryTypes;
    }
    private List<ResolvedName> regions;
    public void setRegions(List<ResolvedName> val) {
        regions = val;
    }
    public List<ResolvedName> getRegions() {
        return regions;
    }
    private List<ResolvedName> stations;
    public void setStations(List<ResolvedName> val) {
        stations = val;
    }
    public List<ResolvedName> getStations() {
        return stations;
    }
    private List<ResolvedName> systems;
    public void setSystems(List<ResolvedName> val) {
        systems = val;
    }
    public List<ResolvedName> getSystems() {
        return systems;
    }
    static ResolvedItemId fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ResolvedItemId self = new ResolvedItemId();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("agents").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.agents = rt;
        }

        {
            List<Json> jl = js.get("alliances").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.alliances = rt;
        }

        {
            List<Json> jl = js.get("characters").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.characters = rt;
        }

        {
            List<Json> jl = js.get("constellations").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.constellations = rt;
        }

        {
            List<Json> jl = js.get("corporations").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.corporations = rt;
        }

        {
            List<Json> jl = js.get("factions").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.factions = rt;
        }

        {
            List<Json> jl = js.get("inventory_types").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.inventoryTypes = rt;
        }

        {
            List<Json> jl = js.get("regions").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.regions = rt;
        }

        {
            List<Json> jl = js.get("stations").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.stations = rt;
        }

        {
            List<Json> jl = js.get("systems").asJsonList();
            List<ResolvedName> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ResolvedName.fromJson(jl.get(i)));
            }
            self.systems = rt;
        }

        return self;
    }
}
