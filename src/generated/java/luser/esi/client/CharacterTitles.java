package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterTitles implements ApiParameterObject {
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
