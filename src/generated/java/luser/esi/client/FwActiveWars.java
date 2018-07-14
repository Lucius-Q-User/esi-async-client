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
public class FwActiveWars implements ApiParameterObject {
    private int againstId;
    /**
     * The faction ID of the enemy faction.
     */
    public void setAgainstId(int val) {
        againstId = val;
    }
    /**
     * The faction ID of the enemy faction.
     */
    @JsonProperty("against_id")
    public int getAgainstId() {
        return againstId;
    }
    private int factionId;
    /**
     * faction_id integer
     */
    public void setFactionId(int val) {
        factionId = val;
    }
    /**
     * faction_id integer
     */
    @JsonProperty("faction_id")
    public int getFactionId() {
        return factionId;
    }
}
