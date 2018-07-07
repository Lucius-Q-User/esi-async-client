package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FleetUnitName extends JsonConvertible {
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("name", Json.make(name));
        return object;
    }
}
