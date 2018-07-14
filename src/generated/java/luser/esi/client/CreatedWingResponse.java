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
public class CreatedWingResponse implements ApiParameterObject {
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
