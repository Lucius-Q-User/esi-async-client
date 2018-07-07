package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class BloodlineInfo {
    private int bloodlineId;
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    public int getBloodlineId() {
        return bloodlineId;
    }
    private int charisma;
    public void setCharisma(int val) {
        charisma = val;
    }
    public int getCharisma() {
        return charisma;
    }
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    public int getCorporationId() {
        return corporationId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private int intelligence;
    public void setIntelligence(int val) {
        intelligence = val;
    }
    public int getIntelligence() {
        return intelligence;
    }
    private int memory;
    public void setMemory(int val) {
        memory = val;
    }
    public int getMemory() {
        return memory;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private int perception;
    public void setPerception(int val) {
        perception = val;
    }
    public int getPerception() {
        return perception;
    }
    private int raceId;
    public void setRaceId(int val) {
        raceId = val;
    }
    public int getRaceId() {
        return raceId;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    public int getShipTypeId() {
        return shipTypeId;
    }
    private int willpower;
    public void setWillpower(int val) {
        willpower = val;
    }
    public int getWillpower() {
        return willpower;
    }
    static BloodlineInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        BloodlineInfo self = new BloodlineInfo();
        Map<String, Json> js = json.asJsonMap();
        self.bloodlineId = ApiClientBase.optGetInteger(js.get("bloodline_id"));
        self.charisma = ApiClientBase.optGetInteger(js.get("charisma"));
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.intelligence = ApiClientBase.optGetInteger(js.get("intelligence"));
        self.memory = ApiClientBase.optGetInteger(js.get("memory"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.perception = ApiClientBase.optGetInteger(js.get("perception"));
        self.raceId = ApiClientBase.optGetInteger(js.get("race_id"));
        self.shipTypeId = ApiClientBase.optGetInteger(js.get("ship_type_id"));
        self.willpower = ApiClientBase.optGetInteger(js.get("willpower"));
        return self;
    }
}
