package luser.esi.client;

import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PIRoute {
    private int contentTypeId;
    /**
     * content_type_id integer
     */
    public void setContentTypeId(int val) {
        contentTypeId = val;
    }
    /**
     * content_type_id integer
     */
    @JsonProperty("content_type_id")
    public int getContentTypeId() {
        return contentTypeId;
    }
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
    private float quantity;
    /**
     * quantity number
     */
    public void setQuantity(float val) {
        quantity = val;
    }
    /**
     * quantity number
     */
    @JsonProperty("quantity")
    public float getQuantity() {
        return quantity;
    }
    private long routeId;
    /**
     * route_id integer
     */
    public void setRouteId(long val) {
        routeId = val;
    }
    /**
     * route_id integer
     */
    @JsonProperty("route_id")
    public long getRouteId() {
        return routeId;
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
    private LongArrayList waypoints;
    /**
     * list of pin ID waypoints
     */
    public void setWaypoints(LongArrayList val) {
        waypoints = val;
    }
    /**
     * list of pin ID waypoints
     */
    @JsonProperty("waypoints")
    public LongArrayList getWaypoints() {
        return waypoints;
    }
}
