package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwFactionLeaderboards implements ApiParameterObject {
    private FwFactionLeaderboard kills;
    public void setKills(FwFactionLeaderboard val) {
        kills = val;
    }
    @JsonProperty("kills")
    public FwFactionLeaderboard getKills() {
        return kills;
    }
    private FwFactionLeaderboard victoryPoints;
    public void setVictoryPoints(FwFactionLeaderboard val) {
        victoryPoints = val;
    }
    @JsonProperty("victory_points")
    public FwFactionLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
}
