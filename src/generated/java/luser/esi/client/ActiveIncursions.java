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
    /**
     * The constellation id in which this incursion takes place
     */
    public void setConstellationId(int val) {
        constellationId = val;
    }
    /**
     * The constellation id in which this incursion takes place
     */
    @JsonProperty("constellation_id")
    public int getConstellationId() {
        return constellationId;
    }
    private int factionId;
    /**
     * The attacking faction's id
     */
    public void setFactionId(int val) {
        factionId = val;
    }
    /**
     * The attacking faction's id
     */
    @JsonProperty("faction_id")
    public int getFactionId() {
        return factionId;
    }
    private boolean hasBoss;
    /**
     * Whether the final encounter has boss or not
     */
    public void setHasBoss(boolean val) {
        hasBoss = val;
    }
    /**
     * Whether the final encounter has boss or not
     */
    @JsonProperty("has_boss")
    public boolean getHasBoss() {
        return hasBoss;
    }
    private int[] infestedSolarSystems;
    /**
     * A list of infested solar system ids that are a part of this incursion
     */
    public void setInfestedSolarSystems(int[] val) {
        infestedSolarSystems = val;
    }
    /**
     * A list of infested solar system ids that are a part of this incursion
     */
    @JsonProperty("infested_solar_systems")
    public int[] getInfestedSolarSystems() {
        return infestedSolarSystems;
    }
    private float influence;
    /**
     * Influence of this incursion as a float from 0 to 1
     */
    public void setInfluence(float val) {
        influence = val;
    }
    /**
     * Influence of this incursion as a float from 0 to 1
     */
    @JsonProperty("influence")
    public float getInfluence() {
        return influence;
    }
    private int stagingSolarSystemId;
    /**
     * Staging solar system for this incursion
     */
    public void setStagingSolarSystemId(int val) {
        stagingSolarSystemId = val;
    }
    /**
     * Staging solar system for this incursion
     */
    @JsonProperty("staging_solar_system_id")
    public int getStagingSolarSystemId() {
        return stagingSolarSystemId;
    }
    private StateEnum state;
    /**
     * The state of this incursion
     */
    public void setState(StateEnum val) {
        state = val;
    }
    /**
     * The state of this incursion
     */
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }
    private String type;
    /**
     * The type of this incursion
     */
    public void setType(String val) {
        type = val;
    }
    /**
     * The type of this incursion
     */
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
