package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class LoyaltyStoreOffer implements ApiParameterObject {
    private Integer akCost;
    public void setAkCost(Integer val) {
        akCost = val;
    }
    @JsonProperty("ak_cost")
    public Integer getAkCost() {
        return akCost;
    }
    private long iskCost;
    public void setIskCost(long val) {
        iskCost = val;
    }
    @JsonProperty("isk_cost")
    public long getIskCost() {
        return iskCost;
    }
    private int lpCost;
    public void setLpCost(int val) {
        lpCost = val;
    }
    @JsonProperty("lp_cost")
    public int getLpCost() {
        return lpCost;
    }
    private int offerId;
    public void setOfferId(int val) {
        offerId = val;
    }
    @JsonProperty("offer_id")
    public int getOfferId() {
        return offerId;
    }
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private List<LpTradeRequiredItem> requiredItems;
    public void setRequiredItems(List<LpTradeRequiredItem> val) {
        requiredItems = val;
    }
    @JsonProperty("required_items")
    public List<LpTradeRequiredItem> getRequiredItems() {
        return requiredItems;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
