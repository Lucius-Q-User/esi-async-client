package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FWCorporationLeaderboards {
    private FwCorporationLeaderboard kills;
    public void setKills(FwCorporationLeaderboard val) {
        kills = val;
    }
    public FwCorporationLeaderboard getKills() {
        return kills;
    }
    private FwCorporationLeaderboard victoryPoints;
    public void setVictoryPoints(FwCorporationLeaderboard val) {
        victoryPoints = val;
    }
    public FwCorporationLeaderboard getVictoryPoints() {
        return victoryPoints;
    }
    static FWCorporationLeaderboards fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FWCorporationLeaderboards self = new FWCorporationLeaderboards();
        Map<String, Json> js = json.asJsonMap();
        self.kills = FwCorporationLeaderboard.fromJson(js.get("kills"));
        self.victoryPoints = FwCorporationLeaderboard.fromJson(js.get("victory_points"));
        return self;
    }
}
