package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FittingCreatedResponse {
    private int fittingId;
    /**
     * fitting_id integer
     */
    public void setFittingId(int val) {
        fittingId = val;
    }
    /**
     * fitting_id integer
     */
    @JsonProperty("fitting_id")
    public int getFittingId() {
        return fittingId;
    }
}
