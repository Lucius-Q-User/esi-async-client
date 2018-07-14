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
public class LoyaltyPointsInfo implements ApiParameterObject {
    private int corporationId;
    /**
     * corporation_id integer
     */
    public void setCorporationId(int val) {
        corporationId = val;
    }
    /**
     * corporation_id integer
     */
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private int loyaltyPoints;
    /**
     * loyalty_points integer
     */
    public void setLoyaltyPoints(int val) {
        loyaltyPoints = val;
    }
    /**
     * loyalty_points integer
     */
    @JsonProperty("loyalty_points")
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
}
