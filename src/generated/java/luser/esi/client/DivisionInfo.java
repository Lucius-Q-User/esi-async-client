package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DivisionInfo {
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
