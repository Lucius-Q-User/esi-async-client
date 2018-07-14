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
public class CharacterAttributes implements ApiParameterObject {
    private Instant accruedRemapCooldownDate;
    /**
     * Neural remapping cooldown after a character uses remap accrued over time
     */
    public void setAccruedRemapCooldownDate(Instant val) {
        accruedRemapCooldownDate = val;
    }
    /**
     * Neural remapping cooldown after a character uses remap accrued over time
     */
    @JsonProperty("accrued_remap_cooldown_date")
    public Instant getAccruedRemapCooldownDate() {
        return accruedRemapCooldownDate;
    }
    private Integer bonusRemaps;
    /**
     * Number of available bonus character neural remaps
     */
    public void setBonusRemaps(Integer val) {
        bonusRemaps = val;
    }
    /**
     * Number of available bonus character neural remaps
     */
    @JsonProperty("bonus_remaps")
    public Integer getBonusRemaps() {
        return bonusRemaps;
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
    private Instant lastRemapDate;
    /**
     * Datetime of last neural remap, including usage of bonus remaps
     */
    public void setLastRemapDate(Instant val) {
        lastRemapDate = val;
    }
    /**
     * Datetime of last neural remap, including usage of bonus remaps
     */
    @JsonProperty("last_remap_date")
    public Instant getLastRemapDate() {
        return lastRemapDate;
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
