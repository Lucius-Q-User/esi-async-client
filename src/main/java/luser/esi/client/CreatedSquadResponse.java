package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CreatedSquadResponse implements ApiParameterObject {
    private long squadId;
    public void setSquadId(long val) {
        squadId = val;
    }
    @JsonProperty("squad_id")
    public long getSquadId() {
        return squadId;
    }
}
