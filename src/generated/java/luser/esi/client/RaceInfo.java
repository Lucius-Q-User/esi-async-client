package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class RaceInfo implements ApiParameterObject {
    private int allianceId;
    /**
     * The alliance generally associated with this race
     */
    public void setAllianceId(int val) {
        allianceId = val;
    }
    /**
     * The alliance generally associated with this race
     */
    @JsonProperty("alliance_id")
    public int getAllianceId() {
        return allianceId;
    }
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int raceId;
    /**
     * race_id integer
     */
    public void setRaceId(int val) {
        raceId = val;
    }
    /**
     * race_id integer
     */
    @JsonProperty("race_id")
    public int getRaceId() {
        return raceId;
    }
}
