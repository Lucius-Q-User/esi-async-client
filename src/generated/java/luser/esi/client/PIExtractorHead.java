package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PIExtractorHead implements ApiParameterObject {
    private int headId;
    /**
     * head_id integer
     */
    public void setHeadId(int val) {
        headId = val;
    }
    /**
     * head_id integer
     */
    @JsonProperty("head_id")
    public int getHeadId() {
        return headId;
    }
    private float latitude;
    /**
     * latitude number
     */
    public void setLatitude(float val) {
        latitude = val;
    }
    /**
     * latitude number
     */
    @JsonProperty("latitude")
    public float getLatitude() {
        return latitude;
    }
    private float longitude;
    /**
     * longitude number
     */
    public void setLongitude(float val) {
        longitude = val;
    }
    /**
     * longitude number
     */
    @JsonProperty("longitude")
    public float getLongitude() {
        return longitude;
    }
}
