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
    /**
     * character object
     */
    public void setCharacter(CharacterStatsGeneral val) {
        character = val;
    }
    /**
     * character object
     */
    @JsonProperty("character")
    public CharacterStatsGeneral getCharacter() {
        return character;
    }
    private CharacterStatsCombat combat;
    /**
     * combat object
     */
    public void setCombat(CharacterStatsCombat val) {
        combat = val;
    }
    /**
     * combat object
     */
    @JsonProperty("combat")
    public CharacterStatsCombat getCombat() {
        return combat;
    }
    private CharacterStatsIndustry industry;
    /**
     * industry object
     */
    public void setIndustry(CharacterStatsIndustry val) {
        industry = val;
    }
    /**
     * industry object
     */
    @JsonProperty("industry")
    public CharacterStatsIndustry getIndustry() {
        return industry;
    }
    private CharacterStatsInventory inventory;
    /**
     * inventory object
     */
    public void setInventory(CharacterStatsInventory val) {
        inventory = val;
    }
    /**
     * inventory object
     */
    @JsonProperty("inventory")
    public CharacterStatsInventory getInventory() {
        return inventory;
    }
    private CharacterStatsIsk isk;
    /**
     * isk object
     */
    public void setIsk(CharacterStatsIsk val) {
        isk = val;
    }
    /**
     * isk object
     */
    @JsonProperty("isk")
    public CharacterStatsIsk getIsk() {
        return isk;
    }
    private CharacterStatsMarket market;
    /**
     * market object
     */
    public void setMarket(CharacterStatsMarket val) {
        market = val;
    }
    /**
     * market object
     */
    @JsonProperty("market")
    public CharacterStatsMarket getMarket() {
        return market;
    }
    private CharacterStatsMining mining;
    /**
     * mining object
     */
    public void setMining(CharacterStatsMining val) {
        mining = val;
    }
    /**
     * mining object
     */
    @JsonProperty("mining")
    public CharacterStatsMining getMining() {
        return mining;
    }
    private CharacterStatsModules module;
    /**
     * module object
     */
    public void setModule(CharacterStatsModules val) {
        module = val;
    }
    /**
     * module object
     */
    @JsonProperty("module")
    public CharacterStatsModules getModule() {
        return module;
    }
    private CharacterStatsOrbital orbital;
    /**
     * orbital object
     */
    public void setOrbital(CharacterStatsOrbital val) {
        orbital = val;
    }
    /**
     * orbital object
     */
    @JsonProperty("orbital")
    public CharacterStatsOrbital getOrbital() {
        return orbital;
    }
    private CharacterStatsPve pve;
    /**
     * pve object
     */
    public void setPve(CharacterStatsPve val) {
        pve = val;
    }
    /**
     * pve object
     */
    @JsonProperty("pve")
    public CharacterStatsPve getPve() {
        return pve;
    }
    private CharacterStatsSocial social;
    /**
     * social object
     */
    public void setSocial(CharacterStatsSocial val) {
        social = val;
    }
    /**
     * social object
     */
    @JsonProperty("social")
    public CharacterStatsSocial getSocial() {
        return social;
    }
    private CharacterStatsTravel travel;
    /**
     * travel object
     */
    public void setTravel(CharacterStatsTravel val) {
        travel = val;
    }
    /**
     * travel object
     */
    @JsonProperty("travel")
    public CharacterStatsTravel getTravel() {
        return travel;
    }
    private int year;
    /**
     * Gregorian year for this set of aggregates
     */
    public void setYear(int val) {
        year = val;
    }
    /**
     * Gregorian year for this set of aggregates
     */
    @JsonProperty("year")
    public int getYear() {
        return year;
    }
}
