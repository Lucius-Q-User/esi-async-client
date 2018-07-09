package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ActiveIncursions {
    private int constellationId;
    public void setConstellationId(int val) {
        constellationId = val;
    }
    public int getConstellationId() {
        return constellationId;
    }
    private int factionId;
    public void setFactionId(int val) {
        factionId = val;
    }
    public int getFactionId() {
        return factionId;
    }
    private boolean hasBoss;
    public void setHasBoss(boolean val) {
        hasBoss = val;
    }
    public boolean getHasBoss() {
        return hasBoss;
    }
    private int[] infestedSolarSystems;
    public void setInfestedSolarSystems(int[] val) {
        infestedSolarSystems = val;
    }
    public int[] getInfestedSolarSystems() {
        return infestedSolarSystems;
    }
    private float influence;
    public void setInfluence(float val) {
        influence = val;
    }
    public float getInfluence() {
        return influence;
    }
    private int stagingSolarSystemId;
    public void setStagingSolarSystemId(int val) {
        stagingSolarSystemId = val;
    }
    public int getStagingSolarSystemId() {
        return stagingSolarSystemId;
    }
    private StateEnum state;
    public void setState(StateEnum val) {
        state = val;
    }
    public StateEnum getState() {
        return state;
    }
    private String type;
    public void setType(String val) {
        type = val;
    }
    public String getType() {
        return type;
    }
    static ActiveIncursions fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ActiveIncursions self = new ActiveIncursions();
        Map<String, Json> js = json.asJsonMap();
        self.constellationId = ApiClientBase.optGetInteger(js.get("constellation_id"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.hasBoss = ApiClientBase.optGetBoolean(js.get("has_boss"));
        {
            List<Json> jl = js.get("infested_solar_systems").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.infestedSolarSystems = rt;
        }
        self.influence = ApiClientBase.optGetFloat(js.get("influence"));
        self.stagingSolarSystemId = ApiClientBase.optGetInteger(js.get("staging_solar_system_id"));
        self.state = StateEnum.fromString(ApiClientBase.optGetString(js.get("state")));
        self.type = ApiClientBase.optGetString(js.get("type"));
        return self;
    }
    public static enum StateEnum {
        WITHDRAWING("withdrawing"),
        MOBILIZING("mobilizing"),
        ESTABLISHED("established");
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
