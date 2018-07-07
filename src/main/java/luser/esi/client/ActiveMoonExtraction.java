package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ActiveMoonExtraction {
    private String chunkArrivalTime;
    public void setChunkArrivalTime(String val) {
        chunkArrivalTime = val;
    }
    public String getChunkArrivalTime() {
        return chunkArrivalTime;
    }
    private String extractionStartTime;
    public void setExtractionStartTime(String val) {
        extractionStartTime = val;
    }
    public String getExtractionStartTime() {
        return extractionStartTime;
    }
    private int moonId;
    public void setMoonId(int val) {
        moonId = val;
    }
    public int getMoonId() {
        return moonId;
    }
    private String naturalDecayTime;
    public void setNaturalDecayTime(String val) {
        naturalDecayTime = val;
    }
    public String getNaturalDecayTime() {
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
        self.chunkArrivalTime = ApiClientBase.optGetString(js.get("chunk_arrival_time"));
        self.extractionStartTime = ApiClientBase.optGetString(js.get("extraction_start_time"));
        self.moonId = ApiClientBase.optGetInteger(js.get("moon_id"));
        self.naturalDecayTime = ApiClientBase.optGetString(js.get("natural_decay_time"));
        self.structureId = ApiClientBase.optGetLong(js.get("structure_id"));
        return self;
    }
}
