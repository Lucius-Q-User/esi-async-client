package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsIsk {
    private Long in;
    public void setIn(Long val) {
        in = val;
    }
    public Long getIn() {
        return in;
    }
    private Long out;
    public void setOut(Long val) {
        out = val;
    }
    public Long getOut() {
        return out;
    }
    static CharacterStatsIsk fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsIsk self = new CharacterStatsIsk();
        Map<String, Json> js = json.asJsonMap();
        self.in = ApiClientBase.optGetLong(js.get("in"));
        self.out = ApiClientBase.optGetLong(js.get("out"));
        return self;
    }
}
