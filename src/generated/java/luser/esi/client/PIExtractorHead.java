package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class PIExtractorHead implements ApiParameterObject {
    private int headId;
    public void setHeadId(int val) {
        headId = val;
    }
    @JsonProperty("head_id")
    public int getHeadId() {
        return headId;
    }
    private float latitude;
    public void setLatitude(float val) {
        latitude = val;
    }
    @JsonProperty("latitude")
    public float getLatitude() {
        return latitude;
    }
    private float longitude;
    public void setLongitude(float val) {
        longitude = val;
    }
    @JsonProperty("longitude")
    public float getLongitude() {
        return longitude;
    }
}
