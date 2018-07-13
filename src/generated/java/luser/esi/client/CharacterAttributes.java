package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterAttributes implements ApiParameterObject {
    private Instant accruedRemapCooldownDate;
    public void setAccruedRemapCooldownDate(Instant val) {
        accruedRemapCooldownDate = val;
    }
    @JsonProperty("accrued_remap_cooldown_date")
    public Instant getAccruedRemapCooldownDate() {
        return accruedRemapCooldownDate;
    }
    private Integer bonusRemaps;
    public void setBonusRemaps(Integer val) {
        bonusRemaps = val;
    }
    @JsonProperty("bonus_remaps")
    public Integer getBonusRemaps() {
        return bonusRemaps;
    }
    private int charisma;
    public void setCharisma(int val) {
        charisma = val;
    }
    @JsonProperty("charisma")
    public int getCharisma() {
        return charisma;
    }
    private int intelligence;
    public void setIntelligence(int val) {
        intelligence = val;
    }
    @JsonProperty("intelligence")
    public int getIntelligence() {
        return intelligence;
    }
    private Instant lastRemapDate;
    public void setLastRemapDate(Instant val) {
        lastRemapDate = val;
    }
    @JsonProperty("last_remap_date")
    public Instant getLastRemapDate() {
        return lastRemapDate;
    }
    private int memory;
    public void setMemory(int val) {
        memory = val;
    }
    @JsonProperty("memory")
    public int getMemory() {
        return memory;
    }
    private int perception;
    public void setPerception(int val) {
        perception = val;
    }
    @JsonProperty("perception")
    public int getPerception() {
        return perception;
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
