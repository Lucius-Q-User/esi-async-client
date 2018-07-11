package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SovCampaignParticipant implements ApiParameterObject {
    private int allianceId;
    public void setAllianceId(int val) {
        allianceId = val;
    }
    @JsonProperty("alliance_id")
    public int getAllianceId() {
        return allianceId;
    }
    private float score;
    public void setScore(float val) {
        score = val;
    }
    @JsonProperty("score")
    public float getScore() {
        return score;
    }
}
