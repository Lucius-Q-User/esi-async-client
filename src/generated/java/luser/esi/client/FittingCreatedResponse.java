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
public class FittingCreatedResponse implements ApiParameterObject {
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
