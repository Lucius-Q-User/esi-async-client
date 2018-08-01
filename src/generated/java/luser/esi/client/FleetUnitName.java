package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FleetUnitName {
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
