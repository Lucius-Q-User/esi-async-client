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
    public void setDroneMine(Long val) {
        droneMine = val;
    }
    @JsonProperty("drone_mine")
    public Long getDroneMine() {
        return droneMine;
    }
    private Long oreArkonor;
    public void setOreArkonor(Long val) {
        oreArkonor = val;
    }
    @JsonProperty("ore_arkonor")
    public Long getOreArkonor() {
        return oreArkonor;
    }
    private Long oreBistot;
    public void setOreBistot(Long val) {
        oreBistot = val;
    }
    @JsonProperty("ore_bistot")
    public Long getOreBistot() {
        return oreBistot;
    }
    private Long oreCrokite;
    public void setOreCrokite(Long val) {
        oreCrokite = val;
    }
    @JsonProperty("ore_crokite")
    public Long getOreCrokite() {
        return oreCrokite;
    }
    private Long oreDarkOchre;
    public void setOreDarkOchre(Long val) {
        oreDarkOchre = val;
    }
    @JsonProperty("ore_dark_ochre")
    public Long getOreDarkOchre() {
        return oreDarkOchre;
    }
    private Long oreGneiss;
    public void setOreGneiss(Long val) {
        oreGneiss = val;
    }
    @JsonProperty("ore_gneiss")
    public Long getOreGneiss() {
        return oreGneiss;
    }
    private Long oreHarvestableCloud;
    public void setOreHarvestableCloud(Long val) {
        oreHarvestableCloud = val;
    }
    @JsonProperty("ore_harvestable_cloud")
    public Long getOreHarvestableCloud() {
        return oreHarvestableCloud;
    }
    private Long oreHedbergite;
    public void setOreHedbergite(Long val) {
        oreHedbergite = val;
    }
    @JsonProperty("ore_hedbergite")
    public Long getOreHedbergite() {
        return oreHedbergite;
    }
    private Long oreHemorphite;
    public void setOreHemorphite(Long val) {
        oreHemorphite = val;
    }
    @JsonProperty("ore_hemorphite")
    public Long getOreHemorphite() {
        return oreHemorphite;
    }
    private Long oreIce;
    public void setOreIce(Long val) {
        oreIce = val;
    }
    @JsonProperty("ore_ice")
    public Long getOreIce() {
        return oreIce;
    }
    private Long oreJaspet;
    public void setOreJaspet(Long val) {
        oreJaspet = val;
    }
    @JsonProperty("ore_jaspet")
    public Long getOreJaspet() {
        return oreJaspet;
    }
    private Long oreKernite;
    public void setOreKernite(Long val) {
        oreKernite = val;
    }
    @JsonProperty("ore_kernite")
    public Long getOreKernite() {
        return oreKernite;
    }
    private Long oreMercoxit;
    public void setOreMercoxit(Long val) {
        oreMercoxit = val;
    }
    @JsonProperty("ore_mercoxit")
    public Long getOreMercoxit() {
        return oreMercoxit;
    }
    private Long oreOmber;
    public void setOreOmber(Long val) {
        oreOmber = val;
    }
    @JsonProperty("ore_omber")
    public Long getOreOmber() {
        return oreOmber;
    }
    private Long orePlagioclase;
    public void setOrePlagioclase(Long val) {
        orePlagioclase = val;
    }
    @JsonProperty("ore_plagioclase")
    public Long getOrePlagioclase() {
        return orePlagioclase;
    }
    private Long orePyroxeres;
    public void setOrePyroxeres(Long val) {
        orePyroxeres = val;
    }
    @JsonProperty("ore_pyroxeres")
    public Long getOrePyroxeres() {
        return orePyroxeres;
    }
    private Long oreScordite;
    public void setOreScordite(Long val) {
        oreScordite = val;
    }
    @JsonProperty("ore_scordite")
    public Long getOreScordite() {
        return oreScordite;
    }
    private Long oreSpodumain;
    public void setOreSpodumain(Long val) {
        oreSpodumain = val;
    }
    @JsonProperty("ore_spodumain")
    public Long getOreSpodumain() {
        return oreSpodumain;
    }
    private Long oreVeldspar;
    public void setOreVeldspar(Long val) {
        oreVeldspar = val;
    }
    @JsonProperty("ore_veldspar")
    public Long getOreVeldspar() {
        return oreVeldspar;
    }
}
