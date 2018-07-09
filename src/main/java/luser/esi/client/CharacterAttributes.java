package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterAttributes {
    private Instant accruedRemapCooldownDate;
    public void setAccruedRemapCooldownDate(Instant val) {
        accruedRemapCooldownDate = val;
    }
    public Instant getAccruedRemapCooldownDate() {
        return accruedRemapCooldownDate;
    }
    private Integer bonusRemaps;
    public void setBonusRemaps(Integer val) {
        bonusRemaps = val;
    }
    public Integer getBonusRemaps() {
        return bonusRemaps;
    }
    private int charisma;
    public void setCharisma(int val) {
        charisma = val;
    }
    public int getCharisma() {
        return charisma;
    }
    private int intelligence;
    public void setIntelligence(int val) {
        intelligence = val;
    }
    public int getIntelligence() {
        return intelligence;
    }
    private Instant lastRemapDate;
    public void setLastRemapDate(Instant val) {
        lastRemapDate = val;
    }
    public Instant getLastRemapDate() {
        return lastRemapDate;
    }
    private int memory;
    public void setMemory(int val) {
        memory = val;
    }
    public int getMemory() {
        return memory;
    }
    private int perception;
    public void setPerception(int val) {
        perception = val;
    }
    public int getPerception() {
        return perception;
    }
    private int willpower;
    public void setWillpower(int val) {
        willpower = val;
    }
    public int getWillpower() {
        return willpower;
    }
    static CharacterAttributes fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterAttributes self = new CharacterAttributes();
        Map<String, Json> js = json.asJsonMap();
        self.accruedRemapCooldownDate = ApiClientBase.optGetInstant(js.get("accrued_remap_cooldown_date"));
        self.bonusRemaps = ApiClientBase.optGetInteger(js.get("bonus_remaps"));
        self.charisma = ApiClientBase.optGetInteger(js.get("charisma"));
        self.intelligence = ApiClientBase.optGetInteger(js.get("intelligence"));
        self.lastRemapDate = ApiClientBase.optGetInstant(js.get("last_remap_date"));
        self.memory = ApiClientBase.optGetInteger(js.get("memory"));
        self.perception = ApiClientBase.optGetInteger(js.get("perception"));
        self.willpower = ApiClientBase.optGetInteger(js.get("willpower"));
        return self;
    }
}
