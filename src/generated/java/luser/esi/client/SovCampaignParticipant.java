package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SovCampaignParticipant {
    private int allianceId;
    /**
     * alliance_id integer
     */
    public void setAllianceId(int val) {
        allianceId = val;
    }
    /**
     * alliance_id integer
     */
    @JsonProperty("alliance_id")
    public int getAllianceId() {
        return allianceId;
    }
    private float score;
    /**
     * score number
     */
    public void setScore(float val) {
        score = val;
    }
    /**
     * score number
     */
    @JsonProperty("score")
    public float getScore() {
        return score;
    }
}
