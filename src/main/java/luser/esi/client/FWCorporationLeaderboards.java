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
    public void setKills(FwCorporationLeaderboard val) {
        kills = val;
    }
    @JsonProperty("kills")
    public FwCorporationLeaderboard getKills() {
        return kills;
    }
    private FwCorporationLeaderboard victoryPoints;
    public void setVictoryPoints(FwCorporationLeaderboard val) {
        victoryPoints = val;
    }
    @JsonProperty("victory_points")
    public FwCorporationLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
}
