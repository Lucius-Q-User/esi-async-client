package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class CorporationCustomsOffice {
    private Float allianceTaxRate;
    /**
     * Only present if alliance access is allowed
     */
    public void setAllianceTaxRate(Float val) {
        allianceTaxRate = val;
    }
    /**
     * Only present if alliance access is allowed
     */
    @JsonProperty("alliance_tax_rate")
    public Float getAllianceTaxRate() {
        return allianceTaxRate;
    }
    private boolean allowAccessWithStandings;
    /**
     * standing_level and any standing related tax rate only present when this is true
     */
    public void setAllowAccessWithStandings(boolean val) {
        allowAccessWithStandings = val;
    }
    /**
     * standing_level and any standing related tax rate only present when this is true
     */
    @JsonProperty("allow_access_with_standings")
    public boolean getAllowAccessWithStandings() {
        return allowAccessWithStandings;
    }
    private boolean allowAllianceAccess;
    /**
     * allow_alliance_access boolean
     */
    public void setAllowAllianceAccess(boolean val) {
        allowAllianceAccess = val;
    }
    /**
     * allow_alliance_access boolean
     */
    @JsonProperty("allow_alliance_access")
    public boolean getAllowAllianceAccess() {
        return allowAllianceAccess;
    }
    private Float badStandingTaxRate;
    /**
     * bad_standing_tax_rate number
     */
    public void setBadStandingTaxRate(Float val) {
        badStandingTaxRate = val;
    }
    /**
     * bad_standing_tax_rate number
     */
    @JsonProperty("bad_standing_tax_rate")
    public Float getBadStandingTaxRate() {
        return badStandingTaxRate;
    }
    private Float corporationTaxRate;
    /**
     * corporation_tax_rate number
     */
    public void setCorporationTaxRate(Float val) {
        corporationTaxRate = val;
    }
    /**
     * corporation_tax_rate number
     */
    @JsonProperty("corporation_tax_rate")
    public Float getCorporationTaxRate() {
        return corporationTaxRate;
    }
    private Float excellentStandingTaxRate;
    /**
     * Tax rate for entities with excellent level of standing, only present if this level is allowed, same for all other standing related tax rates
     */
    public void setExcellentStandingTaxRate(Float val) {
        excellentStandingTaxRate = val;
    }
    /**
     * Tax rate for entities with excellent level of standing, only present if this level is allowed, same for all other standing related tax rates
     */
    @JsonProperty("excellent_standing_tax_rate")
    public Float getExcellentStandingTaxRate() {
        return excellentStandingTaxRate;
    }
    private Float goodStandingTaxRate;
    /**
     * good_standing_tax_rate number
     */
    public void setGoodStandingTaxRate(Float val) {
        goodStandingTaxRate = val;
    }
    /**
     * good_standing_tax_rate number
     */
    @JsonProperty("good_standing_tax_rate")
    public Float getGoodStandingTaxRate() {
        return goodStandingTaxRate;
    }
    private Float neutralStandingTaxRate;
    /**
     * neutral_standing_tax_rate number
     */
    public void setNeutralStandingTaxRate(Float val) {
        neutralStandingTaxRate = val;
    }
    /**
     * neutral_standing_tax_rate number
     */
    @JsonProperty("neutral_standing_tax_rate")
    public Float getNeutralStandingTaxRate() {
        return neutralStandingTaxRate;
    }
    private long officeId;
    /**
     * unique ID of this customs office
     */
    public void setOfficeId(long val) {
        officeId = val;
    }
    /**
     * unique ID of this customs office
     */
    @JsonProperty("office_id")
    public long getOfficeId() {
        return officeId;
    }
    private int reinforceExitEnd;
    /**
     * reinforce_exit_end integer
     */
    public void setReinforceExitEnd(int val) {
        reinforceExitEnd = val;
    }
    /**
     * reinforce_exit_end integer
     */
    @JsonProperty("reinforce_exit_end")
    public int getReinforceExitEnd() {
        return reinforceExitEnd;
    }
    private int reinforceExitStart;
    /**
     * Together with reinforce_exit_end, marks a 2-hour period where this customs office could exit reinforcement mode during the day after initial attack
     */
    public void setReinforceExitStart(int val) {
        reinforceExitStart = val;
    }
    /**
     * Together with reinforce_exit_end, marks a 2-hour period where this customs office could exit reinforcement mode during the day after initial attack
     */
    @JsonProperty("reinforce_exit_start")
    public int getReinforceExitStart() {
        return reinforceExitStart;
    }
    private StandingLevelEnum standingLevel;
    /**
     * Access is allowed only for entities with this level of standing or better
     */
    public void setStandingLevel(StandingLevelEnum val) {
        standingLevel = val;
    }
    /**
     * Access is allowed only for entities with this level of standing or better
     */
    @JsonProperty("standing_level")
    public StandingLevelEnum getStandingLevel() {
        return standingLevel;
    }
    private int systemId;
    /**
     * ID of the solar system this customs office is located in
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * ID of the solar system this customs office is located in
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private Float terribleStandingTaxRate;
    /**
     * terrible_standing_tax_rate number
     */
    public void setTerribleStandingTaxRate(Float val) {
        terribleStandingTaxRate = val;
    }
    /**
     * terrible_standing_tax_rate number
     */
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
