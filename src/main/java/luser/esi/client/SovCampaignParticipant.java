package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SovCampaignParticipant {
    private int allianceId;
    public void setAllianceId(int val) {
        allianceId = val;
    }
    public int getAllianceId() {
        return allianceId;
    }
    private float score;
    public void setScore(float val) {
        score = val;
    }
    public float getScore() {
        return score;
    }
    static SovCampaignParticipant fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SovCampaignParticipant self = new SovCampaignParticipant();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.score = ApiClientBase.optGetFloat(js.get("score"));
        return self;
    }
}
