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
    /**
     * bloodline_id integer
     */
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    /**
     * bloodline_id integer
     */
    @JsonProperty("bloodline_id")
    public int getBloodlineId() {
        return bloodlineId;
    }
    private int charisma;
    /**
     * charisma integer
     */
    public void setCharisma(int val) {
        charisma = val;
    }
    /**
     * charisma integer
     */
    @JsonProperty("charisma")
    public int getCharisma() {
        return charisma;
    }
    private int corporationId;
    /**
     * corporation_id integer
     */
    public void setCorporationId(int val) {
        corporationId = val;
    }
    /**
     * corporation_id integer
     */
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int intelligence;
    /**
     * intelligence integer
     */
    public void setIntelligence(int val) {
        intelligence = val;
    }
    /**
     * intelligence integer
     */
    @JsonProperty("intelligence")
    public int getIntelligence() {
        return intelligence;
    }
    private int memory;
    /**
     * memory integer
     */
    public void setMemory(int val) {
        memory = val;
    }
    /**
     * memory integer
     */
    @JsonProperty("memory")
    public int getMemory() {
        return memory;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int perception;
    /**
     * perception integer
     */
    public void setPerception(int val) {
        perception = val;
    }
    /**
     * perception integer
     */
    @JsonProperty("perception")
    public int getPerception() {
        return perception;
    }
    private int raceId;
    /**
     * race_id integer
     */
    public void setRaceId(int val) {
        raceId = val;
    }
    /**
     * race_id integer
     */
    @JsonProperty("race_id")
    public int getRaceId() {
        return raceId;
    }
    private int shipTypeId;
    /**
     * ship_type_id integer
     */
    public void setShipTypeId(int val) {
        shipTypeId = val;
    }
    /**
     * ship_type_id integer
     */
    @JsonProperty("ship_type_id")
    public int getShipTypeId() {
        return shipTypeId;
    }
    private int willpower;
    /**
     * willpower integer
     */
    public void setWillpower(int val) {
        willpower = val;
    }
    /**
     * willpower integer
     */
    @JsonProperty("willpower")
    public int getWillpower() {
        return willpower;
    }
}
