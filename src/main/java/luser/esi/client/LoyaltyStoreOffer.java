package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class LoyaltyStoreOffer {
    private Integer akCost;
    public void setAkCost(Integer val) {
        akCost = val;
    }
    public Integer getAkCost() {
        return akCost;
    }
    private long iskCost;
    public void setIskCost(long val) {
        iskCost = val;
    }
    public long getIskCost() {
        return iskCost;
    }
    private int lpCost;
    public void setLpCost(int val) {
        lpCost = val;
    }
    public int getLpCost() {
        return lpCost;
    }
    private int offerId;
    public void setOfferId(int val) {
        offerId = val;
    }
    public int getOfferId() {
        return offerId;
    }
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    public int getQuantity() {
        return quantity;
    }
    private List<LpTradeRequiredItem> requiredItems;
    public void setRequiredItems(List<LpTradeRequiredItem> val) {
        requiredItems = val;
    }
    public List<LpTradeRequiredItem> getRequiredItems() {
        return requiredItems;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static LoyaltyStoreOffer fromJson(Json json) {
        if (json == null) {
            return null;
        }
        LoyaltyStoreOffer self = new LoyaltyStoreOffer();
        Map<String, Json> js = json.asJsonMap();
        self.akCost = ApiClientBase.optGetInteger(js.get("ak_cost"));
        self.iskCost = ApiClientBase.optGetLong(js.get("isk_cost"));
        self.lpCost = ApiClientBase.optGetInteger(js.get("lp_cost"));
        self.offerId = ApiClientBase.optGetInteger(js.get("offer_id"));
        self.quantity = ApiClientBase.optGetInteger(js.get("quantity"));
        {
            List<Json> jl = js.get("required_items").asJsonList();
            List<LpTradeRequiredItem> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(LpTradeRequiredItem.fromJson(jl.get(i)));
            }
            self.requiredItems = rt;
        }
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
