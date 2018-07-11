package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ActiveIncursions implements ApiParameterObject {
    private int constellationId;
    public void setConstellationId(int val) {
        constellationId = val;
    }
    @JsonProperty("constellation_id")
    public int getConstellationId() {
        return constellationId;
    }
    private int factionId;
    public void setFactionId(int val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public int getFactionId() {
        return factionId;
    }
    private boolean hasBoss;
    public void setHasBoss(boolean val) {
        hasBoss = val;
    }
    @JsonProperty("has_boss")
    public boolean getHasBoss() {
        return hasBoss;
    }
    private int[] infestedSolarSystems;
    public void setInfestedSolarSystems(int[] val) {
        infestedSolarSystems = val;
    }
    @JsonProperty("infested_solar_systems")
    public int[] getInfestedSolarSystems() {
        return infestedSolarSystems;
    }
    private float influence;
    public void setInfluence(float val) {
        influence = val;
    }
    @JsonProperty("influence")
    public float getInfluence() {
        return influence;
    }
    private int stagingSolarSystemId;
    public void setStagingSolarSystemId(int val) {
        stagingSolarSystemId = val;
    }
    @JsonProperty("staging_solar_system_id")
    public int getStagingSolarSystemId() {
        return stagingSolarSystemId;
    }
    private StateEnum state;
    public void setState(StateEnum val) {
        state = val;
    }
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }
    private String type;
    public void setType(String val) {
        type = val;
    }
    @JsonProperty("type")
    public String getType() {
        return type;
    }
    public static enum StateEnum {
        WITHDRAWING("withdrawing"),
        MOBILIZING("mobilizing"),
        ESTABLISHED("established");
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
