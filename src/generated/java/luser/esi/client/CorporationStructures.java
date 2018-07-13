package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationStructures implements ApiParameterObject {
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private Instant fuelExpires;
    public void setFuelExpires(Instant val) {
        fuelExpires = val;
    }
    @JsonProperty("fuel_expires")
    public Instant getFuelExpires() {
        return fuelExpires;
    }
    private Instant nextReinforceApply;
    public void setNextReinforceApply(Instant val) {
        nextReinforceApply = val;
    }
    @JsonProperty("next_reinforce_apply")
    public Instant getNextReinforceApply() {
        return nextReinforceApply;
    }
    private Integer nextReinforceHour;
    public void setNextReinforceHour(Integer val) {
        nextReinforceHour = val;
    }
    @JsonProperty("next_reinforce_hour")
    public Integer getNextReinforceHour() {
        return nextReinforceHour;
    }
    private Integer nextReinforceWeekday;
    public void setNextReinforceWeekday(Integer val) {
        nextReinforceWeekday = val;
    }
    @JsonProperty("next_reinforce_weekday")
    public Integer getNextReinforceWeekday() {
        return nextReinforceWeekday;
    }
    private int profileId;
    public void setProfileId(int val) {
        profileId = val;
    }
    @JsonProperty("profile_id")
    public int getProfileId() {
        return profileId;
    }
    private int reinforceHour;
    public void setReinforceHour(int val) {
        reinforceHour = val;
    }
    @JsonProperty("reinforce_hour")
    public int getReinforceHour() {
        return reinforceHour;
    }
    private int reinforceWeekday;
    public void setReinforceWeekday(int val) {
        reinforceWeekday = val;
    }
    @JsonProperty("reinforce_weekday")
    public int getReinforceWeekday() {
        return reinforceWeekday;
    }
    private List<StructureSerivec> services;
    public void setServices(List<StructureSerivec> val) {
        services = val;
    }
    @JsonProperty("services")
    public List<StructureSerivec> getServices() {
        return services;
    }
    private StateEnum state;
    public void setState(StateEnum val) {
        state = val;
    }
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }
    private Instant stateTimerEnd;
    public void setStateTimerEnd(Instant val) {
        stateTimerEnd = val;
    }
    @JsonProperty("state_timer_end")
    public Instant getStateTimerEnd() {
        return stateTimerEnd;
    }
    private Instant stateTimerStart;
    public void setStateTimerStart(Instant val) {
        stateTimerStart = val;
    }
    @JsonProperty("state_timer_start")
    public Instant getStateTimerStart() {
        return stateTimerStart;
    }
    private long structureId;
    public void setStructureId(long val) {
        structureId = val;
    }
    @JsonProperty("structure_id")
    public long getStructureId() {
        return structureId;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private Instant unanchorsAt;
    public void setUnanchorsAt(Instant val) {
        unanchorsAt = val;
    }
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
