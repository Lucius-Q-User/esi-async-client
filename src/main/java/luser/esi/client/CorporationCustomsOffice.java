package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationCustomsOffice {
    private Float allianceTaxRate;
    public void setAllianceTaxRate(Float val) {
        allianceTaxRate = val;
    }
    public Float getAllianceTaxRate() {
        return allianceTaxRate;
    }
    private boolean allowAccessWithStandings;
    public void setAllowAccessWithStandings(boolean val) {
        allowAccessWithStandings = val;
    }
    public boolean getAllowAccessWithStandings() {
        return allowAccessWithStandings;
    }
    private boolean allowAllianceAccess;
    public void setAllowAllianceAccess(boolean val) {
        allowAllianceAccess = val;
    }
    public boolean getAllowAllianceAccess() {
        return allowAllianceAccess;
    }
    private Float badStandingTaxRate;
    public void setBadStandingTaxRate(Float val) {
        badStandingTaxRate = val;
    }
    public Float getBadStandingTaxRate() {
        return badStandingTaxRate;
    }
    private Float corporationTaxRate;
    public void setCorporationTaxRate(Float val) {
        corporationTaxRate = val;
    }
    public Float getCorporationTaxRate() {
        return corporationTaxRate;
    }
    private Float excellentStandingTaxRate;
    public void setExcellentStandingTaxRate(Float val) {
        excellentStandingTaxRate = val;
    }
    public Float getExcellentStandingTaxRate() {
        return excellentStandingTaxRate;
    }
    private Float goodStandingTaxRate;
    public void setGoodStandingTaxRate(Float val) {
        goodStandingTaxRate = val;
    }
    public Float getGoodStandingTaxRate() {
        return goodStandingTaxRate;
    }
    private Float neutralStandingTaxRate;
    public void setNeutralStandingTaxRate(Float val) {
        neutralStandingTaxRate = val;
    }
    public Float getNeutralStandingTaxRate() {
        return neutralStandingTaxRate;
    }
    private long officeId;
    public void setOfficeId(long val) {
        officeId = val;
    }
    public long getOfficeId() {
        return officeId;
    }
    private int reinforceExitEnd;
    public void setReinforceExitEnd(int val) {
        reinforceExitEnd = val;
    }
    public int getReinforceExitEnd() {
        return reinforceExitEnd;
    }
    private int reinforceExitStart;
    public void setReinforceExitStart(int val) {
        reinforceExitStart = val;
    }
    public int getReinforceExitStart() {
        return reinforceExitStart;
    }
    private StandingLevelEnum standingLevel;
    public void setStandingLevel(StandingLevelEnum val) {
        standingLevel = val;
    }
    public StandingLevelEnum getStandingLevel() {
        return standingLevel;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    private Float terribleStandingTaxRate;
    public void setTerribleStandingTaxRate(Float val) {
        terribleStandingTaxRate = val;
    }
    public Float getTerribleStandingTaxRate() {
        return terribleStandingTaxRate;
    }
    static CorporationCustomsOffice fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationCustomsOffice self = new CorporationCustomsOffice();
        Map<String, Json> js = json.asJsonMap();
        self.allianceTaxRate = ApiClientBase.optGetFloat(js.get("alliance_tax_rate"));
        self.allowAccessWithStandings = ApiClientBase.optGetBoolean(js.get("allow_access_with_standings"));
        self.allowAllianceAccess = ApiClientBase.optGetBoolean(js.get("allow_alliance_access"));
        self.badStandingTaxRate = ApiClientBase.optGetFloat(js.get("bad_standing_tax_rate"));
        self.corporationTaxRate = ApiClientBase.optGetFloat(js.get("corporation_tax_rate"));
        self.excellentStandingTaxRate = ApiClientBase.optGetFloat(js.get("excellent_standing_tax_rate"));
        self.goodStandingTaxRate = ApiClientBase.optGetFloat(js.get("good_standing_tax_rate"));
        self.neutralStandingTaxRate = ApiClientBase.optGetFloat(js.get("neutral_standing_tax_rate"));
        self.officeId = ApiClientBase.optGetLong(js.get("office_id"));
        self.reinforceExitEnd = ApiClientBase.optGetInteger(js.get("reinforce_exit_end"));
        self.reinforceExitStart = ApiClientBase.optGetInteger(js.get("reinforce_exit_start"));
        self.standingLevel = StandingLevelEnum.fromString(ApiClientBase.optGetString(js.get("standing_level")));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        self.terribleStandingTaxRate = ApiClientBase.optGetFloat(js.get("terrible_standing_tax_rate"));
        return self;
    }
    public static enum StandingLevelEnum {
        BAD("bad"),
        EXCELLENT("excellent"),
        GOOD("good"),
        NEUTRAL("neutral"),
        TERRIBLE("terrible");
        public final String stringValue;
        private StandingLevelEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static StandingLevelEnum fromString(String str) {
            for (StandingLevelEnum self : StandingLevelEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
