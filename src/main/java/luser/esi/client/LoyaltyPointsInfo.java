package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class LoyaltyPointsInfo implements ApiParameterObject {
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private int loyaltyPoints;
    public void setLoyaltyPoints(int val) {
        loyaltyPoints = val;
    }
    @JsonProperty("loyalty_points")
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
}
