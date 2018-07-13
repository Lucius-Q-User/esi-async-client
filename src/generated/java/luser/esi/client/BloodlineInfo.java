package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class BloodlineInfo implements ApiParameterObject {
    private int bloodlineId;
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    @JsonProperty("bloodline_id")
    public int getBloodlineId() {
        return bloodlineId;
    }
    private int charisma;
    public void setCharisma(int val) {
        charisma = val;
    }
    @JsonProperty("charisma")
    public int getCharisma() {
        return charisma;
    }
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int intelligence;
    public void setIntelligence(int val) {
        intelligence = val;
    }
    @JsonProperty("intelligence")
    public int getIntelligence() {
        return intelligence;
    }
    private int memory;
    public void setMemory(int val) {
        memory = val;
    }
    @JsonProperty("memory")
    public int getMemory() {
        return memory;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int perception;
    public void setPerception(int val) {
        perception = val;
    }
    @JsonProperty("perception")
    public int getPerception() {
        return perception;
    }
    private int raceId;
    public void setRaceId(int val) {
        raceId = val;
    }
    @JsonProperty("race_id")
    public int getRaceId() {
        return raceId;
    }
    private int shipTypeId;
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    @JsonProperty("ship_type_id")
    public int getShipTypeId() {
        return shipTypeId;
    }
    private int willpower;
    public void setWillpower(int val) {
        willpower = val;
    }
    @JsonProperty("willpower")
    public int getWillpower() {
        return willpower;
    }
}
