package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ResolvedName {
    private Integer id;
    public void setId(Integer val) {
        id = val;
    }
    public Integer getId() {
        return id;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    static ResolvedName fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ResolvedName self = new ResolvedName();
        Map<String, Json> js = json.asJsonMap();
        self.id = ApiClientBase.optGetInteger(js.get("id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
}
