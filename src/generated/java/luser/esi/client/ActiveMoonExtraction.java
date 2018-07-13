package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ActiveMoonExtraction implements ApiParameterObject {
    private Instant chunkArrivalTime;
    public void setChunkArrivalTime(Instant val) {
        chunkArrivalTime = val;
    }
    @JsonProperty("chunk_arrival_time")
    public Instant getChunkArrivalTime() {
        return chunkArrivalTime;
    }
    private Instant extractionStartTime;
    public void setExtractionStartTime(Instant val) {
        extractionStartTime = val;
    }
    @JsonProperty("extraction_start_time")
    public Instant getExtractionStartTime() {
        return extractionStartTime;
    }
    private int moonId;
    public void setMoonId(int val) {
        moonId = val;
    }
    @JsonProperty("moon_id")
    public int getMoonId() {
        return moonId;
    }
    private Instant naturalDecayTime;
    public void setNaturalDecayTime(Instant val) {
        naturalDecayTime = val;
    }
    @JsonProperty("natural_decay_time")
    public Instant getNaturalDecayTime() {
        return naturalDecayTime;
    }
    private long structureId;
    public void setStructureId(long val) {
        structureId = val;
    }
    @JsonProperty("structure_id")
    public long getStructureId() {
        return structureId;
    }
}
