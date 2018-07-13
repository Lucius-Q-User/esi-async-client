package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class DivisionInfo implements ApiParameterObject {
    private Integer division;
    /**
     * division integer
     */
    public void setDivision(Integer val) {
        division = val;
    }
    /**
     * division integer
     */
    @JsonProperty("division")
    public Integer getDivision() {
        return division;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
}
