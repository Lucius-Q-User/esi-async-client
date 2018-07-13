package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsIsk implements ApiParameterObject {
    private Long in;
    /**
     * in integer
     */
    public void setIn(Long val) {
        in = val;
    }
    /**
     * in integer
     */
    @JsonProperty("in")
    public Long getIn() {
        return in;
    }
    private Long out;
    /**
     * out integer
     */
    public void setOut(Long val) {
        out = val;
    }
    /**
     * out integer
     */
    @JsonProperty("out")
    public Long getOut() {
        return out;
    }
}
