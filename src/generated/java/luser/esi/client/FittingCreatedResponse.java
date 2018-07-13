package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FittingCreatedResponse implements ApiParameterObject {
    private int fittingId;
    public void setFittingId(int val) {
        fittingId = val;
    }
    @JsonProperty("fitting_id")
    public int getFittingId() {
        return fittingId;
    }
}
