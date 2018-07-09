package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SearchResult {
    private int[] agent;
    public void setAgent(int[] val) {
        agent = val;
    }
    public int[] getAgent() {
        return agent;
    }
    private int[] alliance;
    public void setAlliance(int[] val) {
        alliance = val;
    }
    public int[] getAlliance() {
        return alliance;
    }
    private int[] character;
    public void setCharacter(int[] val) {
        character = val;
    }
    public int[] getCharacter() {
        return character;
    }
    private int[] constellation;
    public void setConstellation(int[] val) {
        constellation = val;
    }
    public int[] getConstellation() {
        return constellation;
    }
    private int[] corporation;
    public void setCorporation(int[] val) {
        corporation = val;
    }
    public int[] getCorporation() {
        return corporation;
    }
    private int[] faction;
    public void setFaction(int[] val) {
        faction = val;
    }
    public int[] getFaction() {
        return faction;
    }
    private int[] inventoryType;
    public void setInventoryType(int[] val) {
        inventoryType = val;
    }
    public int[] getInventoryType() {
        return inventoryType;
    }
    private int[] region;
    public void setRegion(int[] val) {
        region = val;
    }
    public int[] getRegion() {
        return region;
    }
    private int[] solarSystem;
    public void setSolarSystem(int[] val) {
        solarSystem = val;
    }
    public int[] getSolarSystem() {
        return solarSystem;
    }
    private int[] station;
    public void setStation(int[] val) {
        station = val;
    }
    public int[] getStation() {
        return station;
    }
    static SearchResult fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SearchResult self = new SearchResult();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("agent").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.agent = rt;
        }
        {
            List<Json> jl = js.get("alliance").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.alliance = rt;
        }
        {
            List<Json> jl = js.get("character").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.character = rt;
        }
        {
            List<Json> jl = js.get("constellation").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.constellation = rt;
        }
        {
            List<Json> jl = js.get("corporation").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.corporation = rt;
        }
        {
            List<Json> jl = js.get("faction").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.faction = rt;
        }
        {
            List<Json> jl = js.get("inventory_type").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.inventoryType = rt;
        }
        {
            List<Json> jl = js.get("region").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.region = rt;
        }
        {
            List<Json> jl = js.get("solar_system").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.solarSystem = rt;
        }
        {
            List<Json> jl = js.get("station").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.station = rt;
        }
        return self;
    }
}
