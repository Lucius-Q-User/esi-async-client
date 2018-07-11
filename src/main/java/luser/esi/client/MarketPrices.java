package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MarketPrices implements ApiParameterObject {
    private Double adjustedPrice;
    public void setAdjustedPrice(Double val) {
        adjustedPrice = val;
    }
    @JsonProperty("adjusted_price")
    public Double getAdjustedPrice() {
        return adjustedPrice;
    }
    private Double averagePrice;
    public void setAveragePrice(Double val) {
        averagePrice = val;
    }
    @JsonProperty("average_price")
    public Double getAveragePrice() {
        return averagePrice;
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
