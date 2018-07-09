package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class StructureInfo {
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
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Integer typeId;
    public void setTypeId(Integer val) {
        typeId = val;
    }
    public Integer getTypeId() {
        return typeId;
    }
    static StructureInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        StructureInfo self = new StructureInfo();
        Map<String, Json> js = json.asJsonMap();
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.position = Coordinate.fromJson(js.get("position"));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
