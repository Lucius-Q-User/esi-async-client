package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsMining implements ApiParameterObject {
    private Long droneMine;
    /**
     * drone_mine integer
     */
    public void setDroneMine(Long val) {
        droneMine = val;
    }
    /**
     * drone_mine integer
     */
    @JsonProperty("drone_mine")
    public Long getDroneMine() {
        return droneMine;
    }
    private Long oreArkonor;
    /**
     * ore_arkonor integer
     */
    public void setOreArkonor(Long val) {
        oreArkonor = val;
    }
    /**
     * ore_arkonor integer
     */
    @JsonProperty("ore_arkonor")
    public Long getOreArkonor() {
        return oreArkonor;
    }
    private Long oreBistot;
    /**
     * ore_bistot integer
     */
    public void setOreBistot(Long val) {
        oreBistot = val;
    }
    /**
     * ore_bistot integer
     */
    @JsonProperty("ore_bistot")
    public Long getOreBistot() {
        return oreBistot;
    }
    private Long oreCrokite;
    /**
     * ore_crokite integer
     */
    public void setOreCrokite(Long val) {
        oreCrokite = val;
    }
    /**
     * ore_crokite integer
     */
    @JsonProperty("ore_crokite")
    public Long getOreCrokite() {
        return oreCrokite;
    }
    private Long oreDarkOchre;
    /**
     * ore_dark_ochre integer
     */
    public void setOreDarkOchre(Long val) {
        oreDarkOchre = val;
    }
    /**
     * ore_dark_ochre integer
     */
    @JsonProperty("ore_dark_ochre")
    public Long getOreDarkOchre() {
        return oreDarkOchre;
    }
    private Long oreGneiss;
    /**
     * ore_gneiss integer
     */
    public void setOreGneiss(Long val) {
        oreGneiss = val;
    }
    /**
     * ore_gneiss integer
     */
    @JsonProperty("ore_gneiss")
    public Long getOreGneiss() {
        return oreGneiss;
    }
    private Long oreHarvestableCloud;
    /**
     * ore_harvestable_cloud integer
     */
    public void setOreHarvestableCloud(Long val) {
        oreHarvestableCloud = val;
    }
    /**
     * ore_harvestable_cloud integer
     */
    @JsonProperty("ore_harvestable_cloud")
    public Long getOreHarvestableCloud() {
        return oreHarvestableCloud;
    }
    private Long oreHedbergite;
    /**
     * ore_hedbergite integer
     */
    public void setOreHedbergite(Long val) {
        oreHedbergite = val;
    }
    /**
     * ore_hedbergite integer
     */
    @JsonProperty("ore_hedbergite")
    public Long getOreHedbergite() {
        return oreHedbergite;
    }
    private Long oreHemorphite;
    /**
     * ore_hemorphite integer
     */
    public void setOreHemorphite(Long val) {
        oreHemorphite = val;
    }
    /**
     * ore_hemorphite integer
     */
    @JsonProperty("ore_hemorphite")
    public Long getOreHemorphite() {
        return oreHemorphite;
    }
    private Long oreIce;
    /**
     * ore_ice integer
     */
    public void setOreIce(Long val) {
        oreIce = val;
    }
    /**
     * ore_ice integer
     */
    @JsonProperty("ore_ice")
    public Long getOreIce() {
        return oreIce;
    }
    private Long oreJaspet;
    /**
     * ore_jaspet integer
     */
    public void setOreJaspet(Long val) {
        oreJaspet = val;
    }
    /**
     * ore_jaspet integer
     */
    @JsonProperty("ore_jaspet")
    public Long getOreJaspet() {
        return oreJaspet;
    }
    private Long oreKernite;
    /**
     * ore_kernite integer
     */
    public void setOreKernite(Long val) {
        oreKernite = val;
    }
    /**
     * ore_kernite integer
     */
    @JsonProperty("ore_kernite")
    public Long getOreKernite() {
        return oreKernite;
    }
    private Long oreMercoxit;
    /**
     * ore_mercoxit integer
     */
    public void setOreMercoxit(Long val) {
        oreMercoxit = val;
    }
    /**
     * ore_mercoxit integer
     */
    @JsonProperty("ore_mercoxit")
    public Long getOreMercoxit() {
        return oreMercoxit;
    }
    private Long oreOmber;
    /**
     * ore_omber integer
     */
    public void setOreOmber(Long val) {
        oreOmber = val;
    }
    /**
     * ore_omber integer
     */
    @JsonProperty("ore_omber")
    public Long getOreOmber() {
        return oreOmber;
    }
    private Long orePlagioclase;
    /**
     * ore_plagioclase integer
     */
    public void setOrePlagioclase(Long val) {
        orePlagioclase = val;
    }
    /**
     * ore_plagioclase integer
     */
    @JsonProperty("ore_plagioclase")
    public Long getOrePlagioclase() {
        return orePlagioclase;
    }
    private Long orePyroxeres;
    /**
     * ore_pyroxeres integer
     */
    public void setOrePyroxeres(Long val) {
        orePyroxeres = val;
    }
    /**
     * ore_pyroxeres integer
     */
    @JsonProperty("ore_pyroxeres")
    public Long getOrePyroxeres() {
        return orePyroxeres;
    }
    private Long oreScordite;
    /**
     * ore_scordite integer
     */
    public void setOreScordite(Long val) {
        oreScordite = val;
    }
    /**
     * ore_scordite integer
     */
    @JsonProperty("ore_scordite")
    public Long getOreScordite() {
        return oreScordite;
    }
    private Long oreSpodumain;
    /**
     * ore_spodumain integer
     */
    public void setOreSpodumain(Long val) {
        oreSpodumain = val;
    }
    /**
     * ore_spodumain integer
     */
    @JsonProperty("ore_spodumain")
    public Long getOreSpodumain() {
        return oreSpodumain;
    }
    private Long oreVeldspar;
    /**
     * ore_veldspar integer
     */
    public void setOreVeldspar(Long val) {
        oreVeldspar = val;
    }
    /**
     * ore_veldspar integer
     */
    @JsonProperty("ore_veldspar")
    public Long getOreVeldspar() {
        return oreVeldspar;
    }
}
