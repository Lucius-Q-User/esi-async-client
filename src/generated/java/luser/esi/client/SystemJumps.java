package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemJumps implements ApiParameterObject {
    private int shipJumps;
    /**
     * ship_jumps integer
     */
    public void setShipJumps(int val) {
        shipJumps = val;
    }
    /**
     * ship_jumps integer
     */
    @JsonProperty("ship_jumps")
    public int getShipJumps() {
        return shipJumps;
    }
    private int systemId;
    /**
     * system_id integer
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * system_id integer
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
}
