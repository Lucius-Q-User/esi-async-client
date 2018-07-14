package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CreatedSquadResponse implements ApiParameterObject {
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
