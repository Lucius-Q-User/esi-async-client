package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class PILink implements ApiParameterObject {
    private long destinationPinId;
    public void setDestinationPinId(long val) {
        destinationPinId = val;
    }
    @JsonProperty("destination_pin_id")
    public long getDestinationPinId() {
        return destinationPinId;
    }
    private int linkLevel;
    public void setLinkLevel(int val) {
        linkLevel = val;
    }
    @JsonProperty("link_level")
    public int getLinkLevel() {
        return linkLevel;
    }
    private long sourcePinId;
    public void setSourcePinId(long val) {
        sourcePinId = val;
    }
    @JsonProperty("source_pin_id")
    public long getSourcePinId() {
        return sourcePinId;
    }
}
