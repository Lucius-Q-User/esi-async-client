package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FleetWings {
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
    private List<SquadsInWing> squads;
    public void setSquads(List<SquadsInWing> val) {
        squads = val;
    }
    public List<SquadsInWing> getSquads() {
        return squads;
    }
    static FleetWings fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FleetWings self = new FleetWings();
        Map<String, Json> js = json.asJsonMap();
        self.id = ApiClientBase.optGetLong(js.get("id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        {
            List<Json> jl = js.get("squads").asJsonList();
            List<SquadsInWing> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, SquadsInWing.fromJson(jl.get(i)));
            }
            self.squads = rt;
        }

        return self;
    }
}
