package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SquadsInWing {
    private long id;
    public void setId(long val) {
        id = val;
    }
    public long getId() {
        return id;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    static SquadsInWing fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SquadsInWing self = new SquadsInWing();
        Map<String, Json> js = json.asJsonMap();
        self.id = ApiClientBase.optGetLong(js.get("id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
}
