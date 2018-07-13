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
    /**
     * Top 4 rankings of factions by number of kills from yesterday, last week and in total.
     */
    public void setKills(FwFactionLeaderboard val) {
        kills = val;
    }
    /**
     * Top 4 rankings of factions by number of kills from yesterday, last week and in total.
     */
    @JsonProperty("kills")
    public FwFactionLeaderboard getKills() {
        return kills;
    }
    private FwFactionLeaderboard victoryPoints;
    /**
     * Top 4 rankings of factions by victory points from yesterday, last week and in total
     */
    public void setVictoryPoints(FwFactionLeaderboard val) {
        victoryPoints = val;
    }
    /**
     * Top 4 rankings of factions by victory points from yesterday, last week and in total
     */
    @JsonProperty("victory_points")
    public FwFactionLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
}
