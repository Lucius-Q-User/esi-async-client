package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStats {
    private CharacterStatsGeneral character;
    public void setCharacter(CharacterStatsGeneral val) {
        character = val;
    }
    public CharacterStatsGeneral getCharacter() {
        return character;
    }
    private CharacterStatsCombat combat;
    public void setCombat(CharacterStatsCombat val) {
        combat = val;
    }
    public CharacterStatsCombat getCombat() {
        return combat;
    }
    private CharacterStatsIndustry industry;
    public void setIndustry(CharacterStatsIndustry val) {
        industry = val;
    }
    public CharacterStatsIndustry getIndustry() {
        return industry;
    }
    private CharacterStatsInventory inventory;
    public void setInventory(CharacterStatsInventory val) {
        inventory = val;
    }
    public CharacterStatsInventory getInventory() {
        return inventory;
    }
    private CharacterStatsIsk isk;
    public void setIsk(CharacterStatsIsk val) {
        isk = val;
    }
    public CharacterStatsIsk getIsk() {
        return isk;
    }
    private CharacterStatsMarket market;
    public void setMarket(CharacterStatsMarket val) {
        market = val;
    }
    public CharacterStatsMarket getMarket() {
        return market;
    }
    private CharacterStatsMining mining;
    public void setMining(CharacterStatsMining val) {
        mining = val;
    }
    public CharacterStatsMining getMining() {
        return mining;
    }
    private CharacterStatsModules module;
    public void setModule(CharacterStatsModules val) {
        module = val;
    }
    public CharacterStatsModules getModule() {
        return module;
    }
    private CharacterStatsOrbital orbital;
    public void setOrbital(CharacterStatsOrbital val) {
        orbital = val;
    }
    public CharacterStatsOrbital getOrbital() {
        return orbital;
    }
    private CharacterStatsPve pve;
    public void setPve(CharacterStatsPve val) {
        pve = val;
    }
    public CharacterStatsPve getPve() {
        return pve;
    }
    private CharacterStatsSocial social;
    public void setSocial(CharacterStatsSocial val) {
        social = val;
    }
    public CharacterStatsSocial getSocial() {
        return social;
    }
    private CharacterStatsTravel travel;
    public void setTravel(CharacterStatsTravel val) {
        travel = val;
    }
    public CharacterStatsTravel getTravel() {
        return travel;
    }
    private int year;
    public void setYear(int val) {
        year = val;
    }
    public int getYear() {
        return year;
    }
    static CharacterStats fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStats self = new CharacterStats();
        Map<String, Json> js = json.asJsonMap();
        self.character = CharacterStatsGeneral.fromJson(js.get("character"));
        self.combat = CharacterStatsCombat.fromJson(js.get("combat"));
        self.industry = CharacterStatsIndustry.fromJson(js.get("industry"));
        self.inventory = CharacterStatsInventory.fromJson(js.get("inventory"));
        self.isk = CharacterStatsIsk.fromJson(js.get("isk"));
        self.market = CharacterStatsMarket.fromJson(js.get("market"));
        self.mining = CharacterStatsMining.fromJson(js.get("mining"));
        self.module = CharacterStatsModules.fromJson(js.get("module"));
        self.orbital = CharacterStatsOrbital.fromJson(js.get("orbital"));
        self.pve = CharacterStatsPve.fromJson(js.get("pve"));
        self.social = CharacterStatsSocial.fromJson(js.get("social"));
        self.travel = CharacterStatsTravel.fromJson(js.get("travel"));
        self.year = ApiClientBase.optGetInteger(js.get("year"));
        return self;
    }
}
