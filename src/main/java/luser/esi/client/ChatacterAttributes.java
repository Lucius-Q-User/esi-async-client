package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ChatacterAttributes {
    private String accruedRemapCooldownDate;
    public void setAccruedRemapCooldownDate(String val) {
        accruedRemapCooldownDate = val;
    }
    public String getAccruedRemapCooldownDate() {
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
    private String lastRemapDate;
    public void setLastRemapDate(String val) {
        lastRemapDate = val;
    }
    public String getLastRemapDate() {
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
    static ChatacterAttributes fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ChatacterAttributes self = new ChatacterAttributes();
        Map<String, Json> js = json.asJsonMap();
        self.accruedRemapCooldownDate = ApiClientBase.optGetString(js.get("accrued_remap_cooldown_date"));
        self.bonusRemaps = ApiClientBase.optGetInteger(js.get("bonus_remaps"));
        self.charisma = ApiClientBase.optGetInteger(js.get("charisma"));
        self.intelligence = ApiClientBase.optGetInteger(js.get("intelligence"));
        self.lastRemapDate = ApiClientBase.optGetString(js.get("last_remap_date"));
        self.memory = ApiClientBase.optGetInteger(js.get("memory"));
        self.perception = ApiClientBase.optGetInteger(js.get("perception"));
        self.willpower = ApiClientBase.optGetInteger(js.get("willpower"));
        return self;
    }
}
