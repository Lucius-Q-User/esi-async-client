package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class AsteroidBeltInfo {
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    public Coordinate getPosition() {
        return position;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    static AsteroidBeltInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        AsteroidBeltInfo self = new AsteroidBeltInfo();
        Map<String, Json> js = json.asJsonMap();
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.position = Coordinate.fromJson(js.get("position"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        return self;
    }
}
