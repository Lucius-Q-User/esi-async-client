package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class PIRoute implements ApiParameterObject {
    private int contentTypeId;
    public void setContentTypeId(int val) {
        contentTypeId = val;
    }
    @JsonProperty("content_type_id")
    public int getContentTypeId() {
        return contentTypeId;
    }
    private long destinationPinId;
    public void setDestinationPinId(long val) {
        destinationPinId = val;
    }
    @JsonProperty("destination_pin_id")
    public long getDestinationPinId() {
        return destinationPinId;
    }
    private float quantity;
    public void setQuantity(float val) {
        quantity = val;
    }
    @JsonProperty("quantity")
    public float getQuantity() {
        return quantity;
    }
    private long routeId;
    public void setRouteId(long val) {
        routeId = val;
    }
    @JsonProperty("route_id")
    public long getRouteId() {
        return routeId;
    }
    private long sourcePinId;
    public void setSourcePinId(long val) {
        sourcePinId = val;
    }
    @JsonProperty("source_pin_id")
    public long getSourcePinId() {
        return sourcePinId;
    }
    private long[] waypoints;
    public void setWaypoints(long[] val) {
        waypoints = val;
    }
    @JsonProperty("waypoints")
    public long[] getWaypoints() {
        return waypoints;
    }
}
