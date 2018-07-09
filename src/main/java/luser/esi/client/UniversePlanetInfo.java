package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class UniversePlanetInfo {
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private int planetId;
    public void setPlanetId(int val) {
        planetId = val;
    }
    public int getPlanetId() {
        return planetId;
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
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static UniversePlanetInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        UniversePlanetInfo self = new UniversePlanetInfo();
        Map<String, Json> js = json.asJsonMap();
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.planetId = ApiClientBase.optGetInteger(js.get("planet_id"));
        self.position = Coordinate.fromJson(js.get("position"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
