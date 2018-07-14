package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IsurancePrices implements ApiParameterObject {
    private float cost;
    /**
     * cost number
     */
    public void setCost(float val) {
        cost = val;
    }
    /**
     * cost number
     */
    @JsonProperty("cost")
    public float getCost() {
        return cost;
    }
    private String name;
    /**
     * Localized insurance level
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * Localized insurance level
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private float payout;
    /**
     * payout number
     */
    public void setPayout(float val) {
        payout = val;
    }
    /**
     * payout number
     */
    @JsonProperty("payout")
    public float getPayout() {
        return payout;
    }
}
