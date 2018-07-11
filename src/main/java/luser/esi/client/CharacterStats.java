package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStats implements ApiParameterObject {
    private CharacterStatsGeneral character;
    public void setCharacter(CharacterStatsGeneral val) {
        character = val;
    }
    @JsonProperty("character")
    public CharacterStatsGeneral getCharacter() {
        return character;
    }
    private CharacterStatsCombat combat;
    public void setCombat(CharacterStatsCombat val) {
        combat = val;
    }
    @JsonProperty("combat")
    public CharacterStatsCombat getCombat() {
        return combat;
    }
    private CharacterStatsIndustry industry;
    public void setIndustry(CharacterStatsIndustry val) {
        industry = val;
    }
    @JsonProperty("industry")
    public CharacterStatsIndustry getIndustry() {
        return industry;
    }
    private CharacterStatsInventory inventory;
    public void setInventory(CharacterStatsInventory val) {
        inventory = val;
    }
    @JsonProperty("inventory")
    public CharacterStatsInventory getInventory() {
        return inventory;
    }
    private CharacterStatsIsk isk;
    public void setIsk(CharacterStatsIsk val) {
        isk = val;
    }
    @JsonProperty("isk")
    public CharacterStatsIsk getIsk() {
        return isk;
    }
    private CharacterStatsMarket market;
    public void setMarket(CharacterStatsMarket val) {
        market = val;
    }
    @JsonProperty("market")
    public CharacterStatsMarket getMarket() {
        return market;
    }
    private CharacterStatsMining mining;
    public void setMining(CharacterStatsMining val) {
        mining = val;
    }
    @JsonProperty("mining")
    public CharacterStatsMining getMining() {
        return mining;
    }
    private CharacterStatsModules module;
    public void setModule(CharacterStatsModules val) {
        module = val;
    }
    @JsonProperty("module")
    public CharacterStatsModules getModule() {
        return module;
    }
    private CharacterStatsOrbital orbital;
    public void setOrbital(CharacterStatsOrbital val) {
        orbital = val;
    }
    @JsonProperty("orbital")
    public CharacterStatsOrbital getOrbital() {
        return orbital;
    }
    private CharacterStatsPve pve;
    public void setPve(CharacterStatsPve val) {
        pve = val;
    }
    @JsonProperty("pve")
    public CharacterStatsPve getPve() {
        return pve;
    }
    private CharacterStatsSocial social;
    public void setSocial(CharacterStatsSocial val) {
        social = val;
    }
    @JsonProperty("social")
    public CharacterStatsSocial getSocial() {
        return social;
    }
    private CharacterStatsTravel travel;
    public void setTravel(CharacterStatsTravel val) {
        travel = val;
    }
    @JsonProperty("travel")
    public CharacterStatsTravel getTravel() {
        return travel;
    }
    private int year;
    public void setYear(int val) {
        year = val;
    }
    @JsonProperty("year")
    public int getYear() {
        return year;
    }
}
