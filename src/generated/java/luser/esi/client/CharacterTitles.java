package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterTitles {
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
    private Integer titleId;
    /**
     * title_id integer
     */
    public void setTitleId(Integer val) {
        titleId = val;
    }
    /**
     * title_id integer
     */
    @JsonProperty("title_id")
    public Integer getTitleId() {
        return titleId;
    }
}
