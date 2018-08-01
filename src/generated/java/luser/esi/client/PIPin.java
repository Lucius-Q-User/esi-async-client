package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PIPin {
    private List<PIContext> contents;
    /**
     * contents array
     */
    public void setContents(List<PIContext> val) {
        contents = val;
    }
    /**
     * contents array
     */
    @JsonProperty("contents")
    public List<PIContext> getContents() {
        return contents;
    }
    private Instant expiryTime;
    /**
     * expiry_time string
     */
    public void setExpiryTime(Instant val) {
        expiryTime = val;
    }
    /**
     * expiry_time string
     */
    @JsonProperty("expiry_time")
    public Instant getExpiryTime() {
        return expiryTime;
    }
    private PIExtractor extractorDetails;
    /**
     * extractor_details object
     */
    public void setExtractorDetails(PIExtractor val) {
        extractorDetails = val;
    }
    /**
     * extractor_details object
     */
    @JsonProperty("extractor_details")
    public PIExtractor getExtractorDetails() {
        return extractorDetails;
    }
    private PIFactory factoryDetails;
    /**
     * factory_details object
     */
    public void setFactoryDetails(PIFactory val) {
        factoryDetails = val;
    }
    /**
     * factory_details object
     */
    @JsonProperty("factory_details")
    public PIFactory getFactoryDetails() {
        return factoryDetails;
    }
    private Instant installTime;
    /**
     * install_time string
     */
    public void setInstallTime(Instant val) {
        installTime = val;
    }
    /**
     * install_time string
     */
    @JsonProperty("install_time")
    public Instant getInstallTime() {
        return installTime;
    }
    private Instant lastCycleStart;
    /**
     * last_cycle_start string
     */
    public void setLastCycleStart(Instant val) {
        lastCycleStart = val;
    }
    /**
     * last_cycle_start string
     */
    @JsonProperty("last_cycle_start")
    public Instant getLastCycleStart() {
        return lastCycleStart;
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
    private long pinId;
    /**
     * pin_id integer
     */
    public void setPinId(long val) {
        pinId = val;
    }
    /**
     * pin_id integer
     */
    @JsonProperty("pin_id")
    public long getPinId() {
        return pinId;
    }
    private Integer schematicId;
    /**
     * schematic_id integer
     */
    public void setSchematicId(Integer val) {
        schematicId = val;
    }
    /**
     * schematic_id integer
     */
    @JsonProperty("schematic_id")
    public Integer getSchematicId() {
        return schematicId;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
