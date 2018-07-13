package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SystemJumps implements ApiParameterObject {
    private int shipJumps;
    public void setShipJumps(int val) {
        shipJumps = val;
    }
    @JsonProperty("ship_jumps")
    public int getShipJumps() {
        return shipJumps;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
}
