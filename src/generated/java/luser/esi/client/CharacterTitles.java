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
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Integer titleId;
    public void setTitleId(Integer val) {
        titleId = val;
    }
    @JsonProperty("title_id")
    public Integer getTitleId() {
        return titleId;
    }
}