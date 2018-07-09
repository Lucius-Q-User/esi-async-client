package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MarketPrices {
    private Double adjustedPrice;
    public void setAdjustedPrice(Double val) {
        adjustedPrice = val;
    }
    public Double getAdjustedPrice() {
        return adjustedPrice;
    }
    private Double averagePrice;
    public void setAveragePrice(Double val) {
        averagePrice = val;
    }
    public Double getAveragePrice() {
        return averagePrice;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static MarketPrices fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MarketPrices self = new MarketPrices();
        Map<String, Json> js = json.asJsonMap();
        self.adjustedPrice = ApiClientBase.optGetDouble(js.get("adjusted_price"));
        self.averagePrice = ApiClientBase.optGetDouble(js.get("average_price"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
