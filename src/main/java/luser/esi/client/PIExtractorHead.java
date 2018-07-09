package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PIExtractorHead {
    private int headId;
    public void setHeadId(int val) {
        headId = val;
    }
    public int getHeadId() {
        return headId;
    }
    private float latitude;
    public void setLatitude(float val) {
        latitude = val;
    }
    public float getLatitude() {
        return latitude;
    }
    private float longitude;
    public void setLongitude(float val) {
        longitude = val;
    }
    public float getLongitude() {
        return longitude;
    }
    static PIExtractorHead fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PIExtractorHead self = new PIExtractorHead();
        Map<String, Json> js = json.asJsonMap();
        self.headId = ApiClientBase.optGetInteger(js.get("head_id"));
        self.latitude = ApiClientBase.optGetFloat(js.get("latitude"));
        self.longitude = ApiClientBase.optGetFloat(js.get("longitude"));
        return self;
    }
}
