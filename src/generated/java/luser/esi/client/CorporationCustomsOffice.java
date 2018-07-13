package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationCustomsOffice implements ApiParameterObject {
    private Float allianceTaxRate;
    public void setAllianceTaxRate(Float val) {
        allianceTaxRate = val;
    }
    @JsonProperty("alliance_tax_rate")
    public Float getAllianceTaxRate() {
        return allianceTaxRate;
    }
    private boolean allowAccessWithStandings;
    public void setAllowAccessWithStandings(boolean val) {
        allowAccessWithStandings = val;
    }
    @JsonProperty("allow_access_with_standings")
    public boolean getAllowAccessWithStandings() {
        return allowAccessWithStandings;
    }
    private boolean allowAllianceAccess;
    public void setAllowAllianceAccess(boolean val) {
        allowAllianceAccess = val;
    }
    @JsonProperty("allow_alliance_access")
    public boolean getAllowAllianceAccess() {
        return allowAllianceAccess;
    }
    private Float badStandingTaxRate;
    public void setBadStandingTaxRate(Float val) {
        badStandingTaxRate = val;
    }
    @JsonProperty("bad_standing_tax_rate")
    public Float getBadStandingTaxRate() {
        return badStandingTaxRate;
    }
    private Float corporationTaxRate;
    public void setCorporationTaxRate(Float val) {
        corporationTaxRate = val;
    }
    @JsonProperty("corporation_tax_rate")
    public Float getCorporationTaxRate() {
        return corporationTaxRate;
    }
    private Float excellentStandingTaxRate;
    public void setExcellentStandingTaxRate(Float val) {
        excellentStandingTaxRate = val;
    }
    @JsonProperty("excellent_standing_tax_rate")
    public Float getExcellentStandingTaxRate() {
        return excellentStandingTaxRate;
    }
    private Float goodStandingTaxRate;
    public void setGoodStandingTaxRate(Float val) {
        goodStandingTaxRate = val;
    }
    @JsonProperty("good_standing_tax_rate")
    public Float getGoodStandingTaxRate() {
        return goodStandingTaxRate;
    }
    private Float neutralStandingTaxRate;
    public void setNeutralStandingTaxRate(Float val) {
        neutralStandingTaxRate = val;
    }
    @JsonProperty("neutral_standing_tax_rate")
    public Float getNeutralStandingTaxRate() {
        return neutralStandingTaxRate;
    }
    private long officeId;
    public void setOfficeId(long val) {
        officeId = val;
    }
    @JsonProperty("office_id")
    public long getOfficeId() {
        return officeId;
    }
    private int reinforceExitEnd;
    public void setReinforceExitEnd(int val) {
        reinforceExitEnd = val;
    }
    @JsonProperty("reinforce_exit_end")
    public int getReinforceExitEnd() {
        return reinforceExitEnd;
    }
    private int reinforceExitStart;
    public void setReinforceExitStart(int val) {
        reinforceExitStart = val;
    }
    @JsonProperty("reinforce_exit_start")
    public int getReinforceExitStart() {
        return reinforceExitStart;
    }
    private StandingLevelEnum standingLevel;
    public void setStandingLevel(StandingLevelEnum val) {
        standingLevel = val;
    }
    @JsonProperty("standing_level")
    public StandingLevelEnum getStandingLevel() {
        return standingLevel;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private Float terribleStandingTaxRate;
    public void setTerribleStandingTaxRate(Float val) {
        terribleStandingTaxRate = val;
    }
    @JsonProperty("terrible_standing_tax_rate")
    public Float getTerribleStandingTaxRate() {
        return terribleStandingTaxRate;
    }
    public static enum StandingLevelEnum {
        BAD("bad"),
        EXCELLENT("excellent"),
        GOOD("good"),
        NEUTRAL("neutral"),
        TERRIBLE("terrible");
        private final String stringValue;
        private StandingLevelEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
