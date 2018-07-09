package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PIPin {
    private List<PIContext> contents;
    public void setContents(List<PIContext> val) {
        contents = val;
    }
    public List<PIContext> getContents() {
        return contents;
    }
    private Instant expiryTime;
    public void setExpiryTime(Instant val) {
        expiryTime = val;
    }
    public Instant getExpiryTime() {
        return expiryTime;
    }
    private PIExtractor extractorDetails;
    public void setExtractorDetails(PIExtractor val) {
        extractorDetails = val;
    }
    public PIExtractor getExtractorDetails() {
        return extractorDetails;
    }
    private PIFactory factoryDetails;
    public void setFactoryDetails(PIFactory val) {
        factoryDetails = val;
    }
    public PIFactory getFactoryDetails() {
        return factoryDetails;
    }
    private Instant installTime;
    public void setInstallTime(Instant val) {
        installTime = val;
    }
    public Instant getInstallTime() {
        return installTime;
    }
    private Instant lastCycleStart;
    public void setLastCycleStart(Instant val) {
        lastCycleStart = val;
    }
    public Instant getLastCycleStart() {
        return lastCycleStart;
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
    private long pinId;
    public void setPinId(long val) {
        pinId = val;
    }
    public long getPinId() {
        return pinId;
    }
    private Integer schematicId;
    public void setSchematicId(Integer val) {
        schematicId = val;
    }
    public Integer getSchematicId() {
        return schematicId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static PIPin fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PIPin self = new PIPin();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("contents").asJsonList();
            List<PIContext> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(PIContext.fromJson(jl.get(i)));
            }
            self.contents = rt;
        }
        self.expiryTime = ApiClientBase.optGetInstant(js.get("expiry_time"));
        self.extractorDetails = PIExtractor.fromJson(js.get("extractor_details"));
        self.factoryDetails = PIFactory.fromJson(js.get("factory_details"));
        self.installTime = ApiClientBase.optGetInstant(js.get("install_time"));
        self.lastCycleStart = ApiClientBase.optGetInstant(js.get("last_cycle_start"));
        self.latitude = ApiClientBase.optGetFloat(js.get("latitude"));
        self.longitude = ApiClientBase.optGetFloat(js.get("longitude"));
        self.pinId = ApiClientBase.optGetLong(js.get("pin_id"));
        self.schematicId = ApiClientBase.optGetInteger(js.get("schematic_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
