package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatedWingResponse {
    private long wingId;
    /**
     * The wing_id of the newly created wing
     */
    public void setWingId(long val) {
        wingId = val;
    }
    /**
     * The wing_id of the newly created wing
     */
    @JsonProperty("wing_id")
    public long getWingId() {
        return wingId;
    }
}
