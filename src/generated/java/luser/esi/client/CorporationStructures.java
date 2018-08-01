package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class CorporationStructures {
    private int corporationId;
    /**
     * ID of the corporation that owns the structure
     */
    public void setCorporationId(int val) {
        corporationId = val;
    }
    /**
     * ID of the corporation that owns the structure
     */
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private Instant fuelExpires;
    /**
     * Date on which the structure will run out of fuel
     */
    public void setFuelExpires(Instant val) {
        fuelExpires = val;
    }
    /**
     * Date on which the structure will run out of fuel
     */
    @JsonProperty("fuel_expires")
    public Instant getFuelExpires() {
        return fuelExpires;
    }
    private Instant nextReinforceApply;
    /**
     * The date and time when the structure's newly requested reinforcement times (e.g. next_reinforce_hour and next_reinforce_day) will take effect.
     */
    public void setNextReinforceApply(Instant val) {
        nextReinforceApply = val;
    }
    /**
     * The date and time when the structure's newly requested reinforcement times (e.g. next_reinforce_hour and next_reinforce_day) will take effect.
     */
    @JsonProperty("next_reinforce_apply")
    public Instant getNextReinforceApply() {
        return nextReinforceApply;
    }
    private Integer nextReinforceHour;
    /**
     * The requested change to reinforce_hour that will take effect at the time shown by next_reinforce_apply.
     */
    public void setNextReinforceHour(Integer val) {
        nextReinforceHour = val;
    }
    /**
     * The requested change to reinforce_hour that will take effect at the time shown by next_reinforce_apply.
     */
    @JsonProperty("next_reinforce_hour")
    public Integer getNextReinforceHour() {
        return nextReinforceHour;
    }
    private Integer nextReinforceWeekday;
    /**
     * The requested change to reinforce_weekday that will take effect at the time shown by next_reinforce_apply.
     */
    public void setNextReinforceWeekday(Integer val) {
        nextReinforceWeekday = val;
    }
    /**
     * The requested change to reinforce_weekday that will take effect at the time shown by next_reinforce_apply.
     */
    @JsonProperty("next_reinforce_weekday")
    public Integer getNextReinforceWeekday() {
        return nextReinforceWeekday;
    }
    private int profileId;
    /**
     * The id of the ACL profile for this citadel
     */
    public void setProfileId(int val) {
        profileId = val;
    }
    /**
     * The id of the ACL profile for this citadel
     */
    @JsonProperty("profile_id")
    public int getProfileId() {
        return profileId;
    }
    private int reinforceHour;
    /**
     * The hour of day that determines the four hour window when the structure will randomly exit its reinforcement periods and become vulnerable to attack against its armor and/or hull. The structure will become vulnerable at a random time that is +/- 2 hours centered on the value of this property.
     */
    public void setReinforceHour(int val) {
        reinforceHour = val;
    }
    /**
     * The hour of day that determines the four hour window when the structure will randomly exit its reinforcement periods and become vulnerable to attack against its armor and/or hull. The structure will become vulnerable at a random time that is +/- 2 hours centered on the value of this property.
     */
    @JsonProperty("reinforce_hour")
    public int getReinforceHour() {
        return reinforceHour;
    }
    private int reinforceWeekday;
    /**
     * The day of the week when the structure exits its final reinforcement period and becomes vulnerable to attack against its hull. Monday is 0 and Sunday is 6.
     */
    public void setReinforceWeekday(int val) {
        reinforceWeekday = val;
    }
    /**
     * The day of the week when the structure exits its final reinforcement period and becomes vulnerable to attack against its hull. Monday is 0 and Sunday is 6.
     */
    @JsonProperty("reinforce_weekday")
    public int getReinforceWeekday() {
        return reinforceWeekday;
    }
    private List<StructureSerivec> services;
    /**
     * Contains a list of service upgrades, and their state
     */
    public void setServices(List<StructureSerivec> val) {
        services = val;
    }
    /**
     * Contains a list of service upgrades, and their state
     */
    @JsonProperty("services")
    public List<StructureSerivec> getServices() {
        return services;
    }
    private StateEnum state;
    /**
     * state string
     */
    public void setState(StateEnum val) {
        state = val;
    }
    /**
     * state string
     */
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }
    private Instant stateTimerEnd;
    /**
     * Date at which the structure will move to it's next state
     */
    public void setStateTimerEnd(Instant val) {
        stateTimerEnd = val;
    }
    /**
     * Date at which the structure will move to it's next state
     */
    @JsonProperty("state_timer_end")
    public Instant getStateTimerEnd() {
        return stateTimerEnd;
    }
    private Instant stateTimerStart;
    /**
     * Date at which the structure entered it's current state
     */
    public void setStateTimerStart(Instant val) {
        stateTimerStart = val;
    }
    /**
     * Date at which the structure entered it's current state
     */
    @JsonProperty("state_timer_start")
    public Instant getStateTimerStart() {
        return stateTimerStart;
    }
    private long structureId;
    /**
     * The Item ID of the structure
     */
    public void setStructureId(long val) {
        structureId = val;
    }
    /**
     * The Item ID of the structure
     */
    @JsonProperty("structure_id")
    public long getStructureId() {
        return structureId;
    }
    private int systemId;
    /**
     * The solar system the structure is in
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * The solar system the structure is in
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    /**
     * The type id of the structure
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * The type id of the structure
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private Instant unanchorsAt;
    /**
     * Date at which the structure will unanchor
     */
    public void setUnanchorsAt(Instant val) {
        unanchorsAt = val;
    }
    /**
     * Date at which the structure will unanchor
     */
    @JsonProperty("unanchors_at")
    public Instant getUnanchorsAt() {
        return unanchorsAt;
    }
    public static enum StateEnum {
        ANCHOR_VULNERABLE("anchor_vulnerable"),
        ANCHORING("anchoring"),
        ARMOR_REINFORCE("armor_reinforce"),
        ARMOR_VULNERABLE("armor_vulnerable"),
        FITTING_INVULNERABLE("fitting_invulnerable"),
        HULL_REINFORCE("hull_reinforce"),
        HULL_VULNERABLE("hull_vulnerable"),
        ONLINE_DEPRECATED("online_deprecated"),
        ONLINING_VULNERABLE("onlining_vulnerable"),
        SHIELD_VULNERABLE("shield_vulnerable"),
        UNANCHORED("unanchored"),
        UNKNOWN("unknown");
        private final String stringValue;
        private StateEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static StateEnum fromString(String str) {
            for (StateEnum self : StateEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
