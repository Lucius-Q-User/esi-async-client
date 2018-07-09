package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwCharacterLeaderboards {
    private FwCharacterLeaderboard kills;
    public void setKills(FwCharacterLeaderboard val) {
        kills = val;
    }
    public FwCharacterLeaderboard getKills() {
        return kills;
    }
    private FwCharacterLeaderboard victoryPoints;
    public void setVictoryPoints(FwCharacterLeaderboard val) {
        victoryPoints = val;
    }
    public FwCharacterLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
    static FwCharacterLeaderboards fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwCharacterLeaderboards self = new FwCharacterLeaderboards();
        Map<String, Json> js = json.asJsonMap();
        self.kills = FwCharacterLeaderboard.fromJson(js.get("kills"));
        self.victoryPoints = FwCharacterLeaderboard.fromJson(js.get("victory_points"));
        return self;
    }
}
