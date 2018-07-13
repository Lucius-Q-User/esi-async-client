package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwActiveWars implements ApiParameterObject {
    private int againstId;
    public void setAgainstId(int val) {
        againstId = val;
    }
    @JsonProperty("against_id")
    public int getAgainstId() {
        return againstId;
    }
    private int factionId;
    public void setFactionId(int val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public int getFactionId() {
        return factionId;
    }
}
