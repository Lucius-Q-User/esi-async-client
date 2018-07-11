package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class GlobalFwStats implements ApiParameterObject {
    private int factionId;
    public void setFactionId(int val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public int getFactionId() {
        return factionId;
    }
    private FwStats kills;
    public void setKills(FwStats val) {
        kills = val;
    }
    @JsonProperty("kills")
    public FwStats getKills() {
        return kills;
    }
    private int pilots;
    public void setPilots(int val) {
        pilots = val;
    }
    @JsonProperty("pilots")
    public int getPilots() {
        return pilots;
    }
    private int systemsControlled;
    public void setSystemsControlled(int val) {
        systemsControlled = val;
    }
    @JsonProperty("systems_controlled")
    public int getSystemsControlled() {
        return systemsControlled;
    }
    private FwStats victoryPoints;
    public void setVictoryPoints(FwStats val) {
        victoryPoints = val;
    }
    @JsonProperty("victory_points")
    public FwStats getVictoryPoints() {
        return victoryPoints;
    }
}
