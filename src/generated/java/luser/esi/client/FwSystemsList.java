package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class FwSystemsList {
    private ContestedEnum contested;
    /**
     * contested string
     */
    public void setContested(ContestedEnum val) {
        contested = val;
    }
    /**
     * contested string
     */
    @JsonProperty("contested")
    public ContestedEnum getContested() {
        return contested;
    }
    private int occupierFactionId;
    /**
     * occupier_faction_id integer
     */
    public void setOccupierFactionId(int val) {
        occupierFactionId = val;
    }
    /**
     * occupier_faction_id integer
     */
    @JsonProperty("occupier_faction_id")
    public int getOccupierFactionId() {
        return occupierFactionId;
    }
    private int ownerFactionId;
    /**
     * owner_faction_id integer
     */
    public void setOwnerFactionId(int val) {
        ownerFactionId = val;
    }
    /**
     * owner_faction_id integer
     */
    @JsonProperty("owner_faction_id")
    public int getOwnerFactionId() {
        return ownerFactionId;
    }
    private int solarSystemId;
    /**
     * solar_system_id integer
     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * solar_system_id integer
     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private int victoryPoints;
    /**
     * victory_points integer
     */
    public void setVictoryPoints(int val) {
        victoryPoints = val;
    }
    /**
     * victory_points integer
     */
    @JsonProperty("victory_points")
    public int getVictoryPoints() {
        return victoryPoints;
    }
    private int victoryPointsThreshold;
    /**
     * victory_points_threshold integer
     */
    public void setVictoryPointsThreshold(int val) {
        victoryPointsThreshold = val;
    }
    /**
     * victory_points_threshold integer
     */
    @JsonProperty("victory_points_threshold")
    public int getVictoryPointsThreshold() {
        return victoryPointsThreshold;
    }
    public static enum ContestedEnum {
        CAPTURED("captured"),
        CONTESTED("contested"),
        UNCONTESTED("uncontested"),
        VULNERABLE("vulnerable");
        private final String stringValue;
        private ContestedEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static ContestedEnum fromString(String str) {
            for (ContestedEnum self : ContestedEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
