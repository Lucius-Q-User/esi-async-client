package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ActiveMoonExtraction {
    private Instant chunkArrivalTime;
    public void setChunkArrivalTime(Instant val) {
        chunkArrivalTime = val;
    }
    public Instant getChunkArrivalTime() {
        return chunkArrivalTime;
    }
    private Instant extractionStartTime;
    public void setExtractionStartTime(Instant val) {
        extractionStartTime = val;
    }
    public Instant getExtractionStartTime() {
        return extractionStartTime;
    }
    private int moonId;
    public void setMoonId(int val) {
        moonId = val;
    }
    public int getMoonId() {
        return moonId;
    }
    private Instant naturalDecayTime;
    public void setNaturalDecayTime(Instant val) {
        naturalDecayTime = val;
    }
    public Instant getNaturalDecayTime() {
        return naturalDecayTime;
    }
    private long structureId;
    public void setStructureId(long val) {
        structureId = val;
    }
    public long getStructureId() {
        return structureId;
    }
    static ActiveMoonExtraction fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ActiveMoonExtraction self = new ActiveMoonExtraction();
        Map<String, Json> js = json.asJsonMap();
        self.chunkArrivalTime = ApiClientBase.optGetInstant(js.get("chunk_arrival_time"));
        self.extractionStartTime = ApiClientBase.optGetInstant(js.get("extraction_start_time"));
        self.moonId = ApiClientBase.optGetInteger(js.get("moon_id"));
        self.naturalDecayTime = ApiClientBase.optGetInstant(js.get("natural_decay_time"));
        self.structureId = ApiClientBase.optGetLong(js.get("structure_id"));
        return self;
    }
}
