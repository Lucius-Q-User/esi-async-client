package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatedSquadResponse {
    private long squadId;
    /**
     * The squad_id of the newly created squad
     */
    public void setSquadId(long val) {
        squadId = val;
    }
    /**
     * The squad_id of the newly created squad
     */
    @JsonProperty("squad_id")
    public long getSquadId() {
        return squadId;
    }
}
