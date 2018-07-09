package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class DivisionInfo {
    private Integer division;
    public void setDivision(Integer val) {
        division = val;
    }
    public Integer getDivision() {
        return division;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    static DivisionInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        DivisionInfo self = new DivisionInfo();
        Map<String, Json> js = json.asJsonMap();
        self.division = ApiClientBase.optGetInteger(js.get("division"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
}
