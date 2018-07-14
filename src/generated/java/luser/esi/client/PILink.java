package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PILink implements ApiParameterObject {
    private long destinationPinId;
    /**
     * destination_pin_id integer
     */
    public void setDestinationPinId(long val) {
        destinationPinId = val;
    }
    /**
     * destination_pin_id integer
     */
    @JsonProperty("destination_pin_id")
    public long getDestinationPinId() {
        return destinationPinId;
    }
    private int linkLevel;
    /**
     * link_level integer
     */
    public void setLinkLevel(int val) {
        linkLevel = val;
    }
    /**
     * link_level integer
     */
    @JsonProperty("link_level")
    public int getLinkLevel() {
        return linkLevel;
    }
    private long sourcePinId;
    /**
     * source_pin_id integer
     */
    public void setSourcePinId(long val) {
        sourcePinId = val;
    }
    /**
     * source_pin_id integer
     */
    @JsonProperty("source_pin_id")
    public long getSourcePinId() {
        return sourcePinId;
    }
}
