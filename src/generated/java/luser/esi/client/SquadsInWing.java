package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SquadsInWing {
    private long id;
    /**
     * id integer
     */
    public void setId(long val) {
        id = val;
    }
    /**
     * id integer
     */
    @JsonProperty("id")
    public long getId() {
        return id;
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
