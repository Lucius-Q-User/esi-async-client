package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class IsurancePrices implements ApiParameterObject {
    private float cost;
    public void setCost(float val) {
        cost = val;
    }
    @JsonProperty("cost")
    public float getCost() {
        return cost;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private float payout;
    public void setPayout(float val) {
        payout = val;
    }
    @JsonProperty("payout")
    public float getPayout() {
        return payout;
    }
}
