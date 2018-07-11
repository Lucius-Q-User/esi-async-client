package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class RaceInfo implements ApiParameterObject {
    private int allianceId;
    public void setAllianceId(int val) {
        allianceId = val;
    }
    @JsonProperty("alliance_id")
    public int getAllianceId() {
        return allianceId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int raceId;
    public void setRaceId(int val) {
        raceId = val;
    }
    @JsonProperty("race_id")
    public int getRaceId() {
        return raceId;
    }
}
