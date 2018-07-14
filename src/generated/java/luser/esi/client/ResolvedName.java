package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResolvedName implements ApiParameterObject {
    private Integer id;
    /**
     * id integer
     */
    public void setId(Integer val) {
        id = val;
    }
    /**
     * id integer
     */
    @JsonProperty("id")
    public Integer getId() {
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
