package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StargateDestination {
    private int stargateId;
    /**
     * The stargate this stargate connects to
     */
    public void setStargateId(int val) {
        stargateId = val;
    }
    /**
     * The stargate this stargate connects to
     */
    @JsonProperty("stargate_id")
    public int getStargateId() {
        return stargateId;
    }
    private int systemId;
    /**
     * The solar system this stargate connects to
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * The solar system this stargate connects to
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
}
