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
public class FwCorporationLeaderboardEntry implements ApiParameterObject {
    private Integer amount;
    /**
     * Amount of kills
     */
    public void setAmount(Integer val) {
        amount = val;
    }
    /**
     * Amount of kills
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }
    private Integer corporationId;
    /**
     * corporation_id integer
     */
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    /**
     * corporation_id integer
     */
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
}
