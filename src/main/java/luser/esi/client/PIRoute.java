package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PIRoute {
    private int contentTypeId;
    public void setContentTypeId(int val) {
        contentTypeId = val;
    }
    public int getContentTypeId() {
        return contentTypeId;
    }
    private long destinationPinId;
    public void setDestinationPinId(long val) {
        destinationPinId = val;
    }
    public long getDestinationPinId() {
        return destinationPinId;
    }
    private float quantity;
    public void setQuantity(float val) {
        quantity = val;
    }
    public float getQuantity() {
        return quantity;
    }
    private long routeId;
    public void setRouteId(long val) {
        routeId = val;
    }
    public long getRouteId() {
        return routeId;
    }
    private long sourcePinId;
    public void setSourcePinId(long val) {
        sourcePinId = val;
    }
    public long getSourcePinId() {
        return sourcePinId;
    }
    private long[] waypoints;
    public void setWaypoints(long[] val) {
        waypoints = val;
    }
    public long[] getWaypoints() {
        return waypoints;
    }
    static PIRoute fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PIRoute self = new PIRoute();
        Map<String, Json> js = json.asJsonMap();
        self.contentTypeId = ApiClientBase.optGetInteger(js.get("content_type_id"));
        self.destinationPinId = ApiClientBase.optGetLong(js.get("destination_pin_id"));
        self.quantity = ApiClientBase.optGetFloat(js.get("quantity"));
        self.routeId = ApiClientBase.optGetLong(js.get("route_id"));
        self.sourcePinId = ApiClientBase.optGetLong(js.get("source_pin_id"));
        {
            List<Json> jl = js.get("waypoints").asJsonList();
            long[] rt = new long[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asLong();
            }
            self.waypoints = rt;
        }
        return self;
    }
}
