package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwFactionLeaderboards {
    private FwFactionLeaderboard kills;
    public void setKills(FwFactionLeaderboard val) {
        kills = val;
    }
    public FwFactionLeaderboard getKills() {
        return kills;
    }
    private FwFactionLeaderboard victoryPoints;
    public void setVictoryPoints(FwFactionLeaderboard val) {
        victoryPoints = val;
    }
    public FwFactionLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
    static FwFactionLeaderboards fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwFactionLeaderboards self = new FwFactionLeaderboards();
        Map<String, Json> js = json.asJsonMap();
        self.kills = FwFactionLeaderboard.fromJson(js.get("kills"));
        self.victoryPoints = FwFactionLeaderboard.fromJson(js.get("victory_points"));
        return self;
    }
}
