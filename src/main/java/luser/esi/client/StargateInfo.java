package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class StargateInfo {
    private StargateDestination destination;
    public void setDestination(StargateDestination val) {
        destination = val;
    }
    public StargateDestination getDestination() {
        return destination;
    }
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
    private int stargateId;
    public void setStargateId(int val) {
        stargateId = val;
    }
    public int getStargateId() {
        return stargateId;
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
    static StargateInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        StargateInfo self = new StargateInfo();
        Map<String, Json> js = json.asJsonMap();
        self.destination = StargateDestination.fromJson(js.get("destination"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.position = Coordinate.fromJson(js.get("position"));
        self.stargateId = ApiClientBase.optGetInteger(js.get("stargate_id"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
