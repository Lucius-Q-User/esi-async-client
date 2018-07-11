package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CreatedWingResponse implements ApiParameterObject {
    private long wingId;
    public void setWingId(long val) {
        wingId = val;
    }
    @JsonProperty("wing_id")
    public long getWingId() {
        return wingId;
    }
}
