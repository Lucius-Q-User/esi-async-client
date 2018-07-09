package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SystemJumps {
    private int shipJumps;
    public void setShipJumps(int val) {
        shipJumps = val;
    }
    public int getShipJumps() {
        return shipJumps;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    static SystemJumps fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SystemJumps self = new SystemJumps();
        Map<String, Json> js = json.asJsonMap();
        self.shipJumps = ApiClientBase.optGetInteger(js.get("ship_jumps"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        return self;
    }
}
