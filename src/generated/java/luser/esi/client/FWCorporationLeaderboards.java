package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FWCorporationLeaderboards implements ApiParameterObject {
    private FwCorporationLeaderboard kills;
    /**
     * Top 10 rankings of corporations by number of kills from yesterday, last week and in total.
     */
    public void setKills(FwCorporationLeaderboard val) {
        kills = val;
    }
    /**
     * Top 10 rankings of corporations by number of kills from yesterday, last week and in total.
     */
    @JsonProperty("kills")
    public FwCorporationLeaderboard getKills() {
        return kills;
    }
    private FwCorporationLeaderboard victoryPoints;
    /**
     * Top 10 rankings of corporations by victory points from yesterday, last week and in total
     */
    public void setVictoryPoints(FwCorporationLeaderboard val) {
        victoryPoints = val;
    }
    /**
     * Top 10 rankings of corporations by victory points from yesterday, last week and in total
     */
    @JsonProperty("victory_points")
    public FwCorporationLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
}
