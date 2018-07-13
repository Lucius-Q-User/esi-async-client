package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwCharacterLeaderboards implements ApiParameterObject {
    private FwCharacterLeaderboard kills;
    /**
     * Top 100 rankings of pilots by number of kills from yesterday, last week and in total.
     */
    public void setKills(FwCharacterLeaderboard val) {
        kills = val;
    }
    /**
     * Top 100 rankings of pilots by number of kills from yesterday, last week and in total.
     */
    @JsonProperty("kills")
    public FwCharacterLeaderboard getKills() {
        return kills;
    }
    private FwCharacterLeaderboard victoryPoints;
    /**
     * Top 100 rankings of pilots by victory points from yesterday, last week and in total
     */
    public void setVictoryPoints(FwCharacterLeaderboard val) {
        victoryPoints = val;
    }
    /**
     * Top 100 rankings of pilots by victory points from yesterday, last week and in total
     */
    @JsonProperty("victory_points")
    public FwCharacterLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
}
