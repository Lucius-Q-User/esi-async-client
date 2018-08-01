package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveMoonExtraction {
    private Instant chunkArrivalTime;
    /**
     * The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill.

     */
    public void setChunkArrivalTime(Instant val) {
        chunkArrivalTime = val;
    }
    /**
     * The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill.

     */
    @JsonProperty("chunk_arrival_time")
    public Instant getChunkArrivalTime() {
        return chunkArrivalTime;
    }
    private Instant extractionStartTime;
    /**
     * The time at which the current extraction was initiated.

     */
    public void setExtractionStartTime(Instant val) {
        extractionStartTime = val;
    }
    /**
     * The time at which the current extraction was initiated.

     */
    @JsonProperty("extraction_start_time")
    public Instant getExtractionStartTime() {
        return extractionStartTime;
    }
    private int moonId;
    /**
     * moon_id integer
     */
    public void setMoonId(int val) {
        moonId = val;
    }
    /**
     * moon_id integer
     */
    @JsonProperty("moon_id")
    public int getMoonId() {
        return moonId;
    }
    private Instant naturalDecayTime;
    /**
     * The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill.

     */
    public void setNaturalDecayTime(Instant val) {
        naturalDecayTime = val;
    }
    /**
     * The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill.

     */
    @JsonProperty("natural_decay_time")
    public Instant getNaturalDecayTime() {
        return naturalDecayTime;
    }
    private long structureId;
    /**
     * structure_id integer
     */
    public void setStructureId(long val) {
        structureId = val;
    }
    /**
     * structure_id integer
     */
    @JsonProperty("structure_id")
    public long getStructureId() {
        return structureId;
    }
}
