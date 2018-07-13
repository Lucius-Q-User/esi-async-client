package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class StargateDestination implements ApiParameterObject {
    private int stargateId;
    public void setStargateId(int val) {
        stargateId = val;
    }
    @JsonProperty("stargate_id")
    public int getStargateId() {
        return stargateId;
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
