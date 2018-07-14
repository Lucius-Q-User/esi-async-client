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
public class LoyaltyStoreOffer implements ApiParameterObject {
    private Integer akCost;
    /**
     * Analysis kredit cost
     */
    public void setAkCost(Integer val) {
        akCost = val;
    }
    /**
     * Analysis kredit cost
     */
    @JsonProperty("ak_cost")
    public Integer getAkCost() {
        return akCost;
    }
    private long iskCost;
    /**
     * isk_cost integer
     */
    public void setIskCost(long val) {
        iskCost = val;
    }
    /**
     * isk_cost integer
     */
    @JsonProperty("isk_cost")
    public long getIskCost() {
        return iskCost;
    }
    private int lpCost;
    /**
     * lp_cost integer
     */
    public void setLpCost(int val) {
        lpCost = val;
    }
    /**
     * lp_cost integer
     */
    @JsonProperty("lp_cost")
    public int getLpCost() {
        return lpCost;
    }
    private int offerId;
    /**
     * offer_id integer
     */
    public void setOfferId(int val) {
        offerId = val;
    }
    /**
     * offer_id integer
     */
    @JsonProperty("offer_id")
    public int getOfferId() {
        return offerId;
    }
    private int quantity;
    /**
     * quantity integer
     */
    public void setQuantity(int val) {
        quantity = val;
    }
    /**
     * quantity integer
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private List<LpTradeRequiredItem> requiredItems;
    /**
     * required_items array
     */
    public void setRequiredItems(List<LpTradeRequiredItem> val) {
        requiredItems = val;
    }
    /**
     * required_items array
     */
    @JsonProperty("required_items")
    public List<LpTradeRequiredItem> getRequiredItems() {
        return requiredItems;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
