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
    public void setKills(FwCharacterLeaderboard val) {
        kills = val;
    }
    @JsonProperty("kills")
    public FwCharacterLeaderboard getKills() {
        return kills;
    }
    private FwCharacterLeaderboard victoryPoints;
    public void setVictoryPoints(FwCharacterLeaderboard val) {
        victoryPoints = val;
    }
    @JsonProperty("victory_points")
    public FwCharacterLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
}
