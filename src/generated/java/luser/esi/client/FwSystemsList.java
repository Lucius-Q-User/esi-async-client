package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwSystemsList implements ApiParameterObject {
    private ContestedEnum contested;
    public void setContested(ContestedEnum val) {
        contested = val;
    }
    @JsonProperty("contested")
    public ContestedEnum getContested() {
        return contested;
    }
    private int occupierFactionId;
    public void setOccupierFactionId(int val) {
        occupierFactionId = val;
    }
    @JsonProperty("occupier_faction_id")
    public int getOccupierFactionId() {
        return occupierFactionId;
    }
    private int ownerFactionId;
    public void setOwnerFactionId(int val) {
        ownerFactionId = val;
    }
    @JsonProperty("owner_faction_id")
    public int getOwnerFactionId() {
        return ownerFactionId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private int victoryPoints;
    public void setVictoryPoints(int val) {
        victoryPoints = val;
    }
    @JsonProperty("victory_points")
    public int getVictoryPoints() {
        return victoryPoints;
    }
    private int victoryPointsThreshold;
    public void setVictoryPointsThreshold(int val) {
        victoryPointsThreshold = val;
    }
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
