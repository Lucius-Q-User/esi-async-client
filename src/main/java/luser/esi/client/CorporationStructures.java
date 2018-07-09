package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationStructures {
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    public int getCorporationId() {
        return corporationId;
    }
    private Instant fuelExpires;
    public void setFuelExpires(Instant val) {
        fuelExpires = val;
    }
    public Instant getFuelExpires() {
        return fuelExpires;
    }
    private Instant nextReinforceApply;
    public void setNextReinforceApply(Instant val) {
        nextReinforceApply = val;
    }
    public Instant getNextReinforceApply() {
        return nextReinforceApply;
    }
    private Integer nextReinforceHour;
    public void setNextReinforceHour(Integer val) {
        nextReinforceHour = val;
    }
    public Integer getNextReinforceHour() {
        return nextReinforceHour;
    }
    private Integer nextReinforceWeekday;
    public void setNextReinforceWeekday(Integer val) {
        nextReinforceWeekday = val;
    }
    public Integer getNextReinforceWeekday() {
        return nextReinforceWeekday;
    }
    private int profileId;
    public void setProfileId(int val) {
        profileId = val;
    }
    public int getProfileId() {
        return profileId;
    }
    private int reinforceHour;
    public void setReinforceHour(int val) {
        reinforceHour = val;
    }
    public int getReinforceHour() {
        return reinforceHour;
    }
    private int reinforceWeekday;
    public void setReinforceWeekday(int val) {
        reinforceWeekday = val;
    }
    public int getReinforceWeekday() {
        return reinforceWeekday;
    }
    private List<StructureSerivec> services;
    public void setServices(List<StructureSerivec> val) {
        services = val;
    }
    public List<StructureSerivec> getServices() {
        return services;
    }
    private StateEnum state;
    public void setState(StateEnum val) {
        state = val;
    }
    public StateEnum getState() {
        return state;
    }
    private Instant stateTimerEnd;
    public void setStateTimerEnd(Instant val) {
        stateTimerEnd = val;
    }
    public Instant getStateTimerEnd() {
        return stateTimerEnd;
    }
    private Instant stateTimerStart;
    public void setStateTimerStart(Instant val) {
        stateTimerStart = val;
    }
    public Instant getStateTimerStart() {
        return stateTimerStart;
    }
    private long structureId;
    public void setStructureId(long val) {
        structureId = val;
    }
    public long getStructureId() {
        return structureId;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    private Instant unanchorsAt;
    public void setUnanchorsAt(Instant val) {
        unanchorsAt = val;
    }
    public Instant getUnanchorsAt() {
        return unanchorsAt;
    }
    static CorporationStructures fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationStructures self = new CorporationStructures();
        Map<String, Json> js = json.asJsonMap();
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.fuelExpires = ApiClientBase.optGetInstant(js.get("fuel_expires"));
        self.nextReinforceApply = ApiClientBase.optGetInstant(js.get("next_reinforce_apply"));
        self.nextReinforceHour = ApiClientBase.optGetInteger(js.get("next_reinforce_hour"));
        self.nextReinforceWeekday = ApiClientBase.optGetInteger(js.get("next_reinforce_weekday"));
        self.profileId = ApiClientBase.optGetInteger(js.get("profile_id"));
        self.reinforceHour = ApiClientBase.optGetInteger(js.get("reinforce_hour"));
        self.reinforceWeekday = ApiClientBase.optGetInteger(js.get("reinforce_weekday"));
        {
            List<Json> jl = js.get("services").asJsonList();
            List<StructureSerivec> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(StructureSerivec.fromJson(jl.get(i)));
            }
            self.services = rt;
        }
        self.state = StateEnum.fromString(ApiClientBase.optGetString(js.get("state")));
        self.stateTimerEnd = ApiClientBase.optGetInstant(js.get("state_timer_end"));
        self.stateTimerStart = ApiClientBase.optGetInstant(js.get("state_timer_start"));
        self.structureId = ApiClientBase.optGetLong(js.get("structure_id"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        self.unanchorsAt = ApiClientBase.optGetInstant(js.get("unanchors_at"));
        return self;
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
        public final String stringValue;
        private StateEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
