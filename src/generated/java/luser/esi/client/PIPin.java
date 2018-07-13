package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class PIPin implements ApiParameterObject {
    private List<PIContext> contents;
    public void setContents(List<PIContext> val) {
        contents = val;
    }
    @JsonProperty("contents")
    public List<PIContext> getContents() {
        return contents;
    }
    private Instant expiryTime;
    public void setExpiryTime(Instant val) {
        expiryTime = val;
    }
    @JsonProperty("expiry_time")
    public Instant getExpiryTime() {
        return expiryTime;
    }
    private PIExtractor extractorDetails;
    public void setExtractorDetails(PIExtractor val) {
        extractorDetails = val;
    }
    @JsonProperty("extractor_details")
    public PIExtractor getExtractorDetails() {
        return extractorDetails;
    }
    private PIFactory factoryDetails;
    public void setFactoryDetails(PIFactory val) {
        factoryDetails = val;
    }
    @JsonProperty("factory_details")
    public PIFactory getFactoryDetails() {
        return factoryDetails;
    }
    private Instant installTime;
    public void setInstallTime(Instant val) {
        installTime = val;
    }
    @JsonProperty("install_time")
    public Instant getInstallTime() {
        return installTime;
    }
    private Instant lastCycleStart;
    public void setLastCycleStart(Instant val) {
        lastCycleStart = val;
    }
    @JsonProperty("last_cycle_start")
    public Instant getLastCycleStart() {
        return lastCycleStart;
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
    private long pinId;
    public void setPinId(long val) {
        pinId = val;
    }
    @JsonProperty("pin_id")
    public long getPinId() {
        return pinId;
    }
    private Integer schematicId;
    public void setSchematicId(Integer val) {
        schematicId = val;
    }
    @JsonProperty("schematic_id")
    public Integer getSchematicId() {
        return schematicId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
