package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

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
