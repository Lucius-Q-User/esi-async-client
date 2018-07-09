package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsMining {
    private Long droneMine;
    public void setDroneMine(Long val) {
        droneMine = val;
    }
    public Long getDroneMine() {
        return droneMine;
    }
    private Long oreArkonor;
    public void setOreArkonor(Long val) {
        oreArkonor = val;
    }
    public Long getOreArkonor() {
        return oreArkonor;
    }
    private Long oreBistot;
    public void setOreBistot(Long val) {
        oreBistot = val;
    }
    public Long getOreBistot() {
        return oreBistot;
    }
    private Long oreCrokite;
    public void setOreCrokite(Long val) {
        oreCrokite = val;
    }
    public Long getOreCrokite() {
        return oreCrokite;
    }
    private Long oreDarkOchre;
    public void setOreDarkOchre(Long val) {
        oreDarkOchre = val;
    }
    public Long getOreDarkOchre() {
        return oreDarkOchre;
    }
    private Long oreGneiss;
    public void setOreGneiss(Long val) {
        oreGneiss = val;
    }
    public Long getOreGneiss() {
        return oreGneiss;
    }
    private Long oreHarvestableCloud;
    public void setOreHarvestableCloud(Long val) {
        oreHarvestableCloud = val;
    }
    public Long getOreHarvestableCloud() {
        return oreHarvestableCloud;
    }
    private Long oreHedbergite;
    public void setOreHedbergite(Long val) {
        oreHedbergite = val;
    }
    public Long getOreHedbergite() {
        return oreHedbergite;
    }
    private Long oreHemorphite;
    public void setOreHemorphite(Long val) {
        oreHemorphite = val;
    }
    public Long getOreHemorphite() {
        return oreHemorphite;
    }
    private Long oreIce;
    public void setOreIce(Long val) {
        oreIce = val;
    }
    public Long getOreIce() {
        return oreIce;
    }
    private Long oreJaspet;
    public void setOreJaspet(Long val) {
        oreJaspet = val;
    }
    public Long getOreJaspet() {
        return oreJaspet;
    }
    private Long oreKernite;
    public void setOreKernite(Long val) {
        oreKernite = val;
    }
    public Long getOreKernite() {
        return oreKernite;
    }
    private Long oreMercoxit;
    public void setOreMercoxit(Long val) {
        oreMercoxit = val;
    }
    public Long getOreMercoxit() {
        return oreMercoxit;
    }
    private Long oreOmber;
    public void setOreOmber(Long val) {
        oreOmber = val;
    }
    public Long getOreOmber() {
        return oreOmber;
    }
    private Long orePlagioclase;
    public void setOrePlagioclase(Long val) {
        orePlagioclase = val;
    }
    public Long getOrePlagioclase() {
        return orePlagioclase;
    }
    private Long orePyroxeres;
    public void setOrePyroxeres(Long val) {
        orePyroxeres = val;
    }
    public Long getOrePyroxeres() {
        return orePyroxeres;
    }
    private Long oreScordite;
    public void setOreScordite(Long val) {
        oreScordite = val;
    }
    public Long getOreScordite() {
        return oreScordite;
    }
    private Long oreSpodumain;
    public void setOreSpodumain(Long val) {
        oreSpodumain = val;
    }
    public Long getOreSpodumain() {
        return oreSpodumain;
    }
    private Long oreVeldspar;
    public void setOreVeldspar(Long val) {
        oreVeldspar = val;
    }
    public Long getOreVeldspar() {
        return oreVeldspar;
    }
    static CharacterStatsMining fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsMining self = new CharacterStatsMining();
        Map<String, Json> js = json.asJsonMap();
        self.droneMine = ApiClientBase.optGetLong(js.get("drone_mine"));
        self.oreArkonor = ApiClientBase.optGetLong(js.get("ore_arkonor"));
        self.oreBistot = ApiClientBase.optGetLong(js.get("ore_bistot"));
        self.oreCrokite = ApiClientBase.optGetLong(js.get("ore_crokite"));
        self.oreDarkOchre = ApiClientBase.optGetLong(js.get("ore_dark_ochre"));
        self.oreGneiss = ApiClientBase.optGetLong(js.get("ore_gneiss"));
        self.oreHarvestableCloud = ApiClientBase.optGetLong(js.get("ore_harvestable_cloud"));
        self.oreHedbergite = ApiClientBase.optGetLong(js.get("ore_hedbergite"));
        self.oreHemorphite = ApiClientBase.optGetLong(js.get("ore_hemorphite"));
        self.oreIce = ApiClientBase.optGetLong(js.get("ore_ice"));
        self.oreJaspet = ApiClientBase.optGetLong(js.get("ore_jaspet"));
        self.oreKernite = ApiClientBase.optGetLong(js.get("ore_kernite"));
        self.oreMercoxit = ApiClientBase.optGetLong(js.get("ore_mercoxit"));
        self.oreOmber = ApiClientBase.optGetLong(js.get("ore_omber"));
        self.orePlagioclase = ApiClientBase.optGetLong(js.get("ore_plagioclase"));
        self.orePyroxeres = ApiClientBase.optGetLong(js.get("ore_pyroxeres"));
        self.oreScordite = ApiClientBase.optGetLong(js.get("ore_scordite"));
        self.oreSpodumain = ApiClientBase.optGetLong(js.get("ore_spodumain"));
        self.oreVeldspar = ApiClientBase.optGetLong(js.get("ore_veldspar"));
        return self;
    }
}
