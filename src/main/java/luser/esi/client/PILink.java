package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PILink {
    private long destinationPinId;
    public void setDestinationPinId(long val) {
        destinationPinId = val;
    }
    public long getDestinationPinId() {
        return destinationPinId;
    }
    private int linkLevel;
    public void setLinkLevel(int val) {
        linkLevel = val;
    }
    public int getLinkLevel() {
        return linkLevel;
    }
    private long sourcePinId;
    public void setSourcePinId(long val) {
        sourcePinId = val;
    }
    public long getSourcePinId() {
        return sourcePinId;
    }
    static PILink fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PILink self = new PILink();
        Map<String, Json> js = json.asJsonMap();
        self.destinationPinId = ApiClientBase.optGetLong(js.get("destination_pin_id"));
        self.linkLevel = ApiClientBase.optGetInteger(js.get("link_level"));
        self.sourcePinId = ApiClientBase.optGetLong(js.get("source_pin_id"));
        return self;
    }
}
