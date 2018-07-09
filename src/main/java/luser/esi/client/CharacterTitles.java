package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterTitles {
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private Integer titleId;
    public void setTitleId(Integer val) {
        titleId = val;
    }
    public Integer getTitleId() {
        return titleId;
    }
    static CharacterTitles fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterTitles self = new CharacterTitles();
        Map<String, Json> js = json.asJsonMap();
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.titleId = ApiClientBase.optGetInteger(js.get("title_id"));
        return self;
    }
}
