package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class StargateDestination {
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
    static StargateDestination fromJson(Json json) {
        if (json == null) {
            return null;
        }
        StargateDestination self = new StargateDestination();
        Map<String, Json> js = json.asJsonMap();
        self.stargateId = ApiClientBase.optGetInteger(js.get("stargate_id"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        return self;
    }
}
