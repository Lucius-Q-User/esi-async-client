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
public class MarketPrices implements ApiParameterObject {
    private Double adjustedPrice;
    /**
     * adjusted_price number
     */
    public void setAdjustedPrice(Double val) {
        adjustedPrice = val;
    }
    /**
     * adjusted_price number
     */
    @JsonProperty("adjusted_price")
    public Double getAdjustedPrice() {
        return adjustedPrice;
    }
    private Double averagePrice;
    /**
     * average_price number
     */
    public void setAveragePrice(Double val) {
        averagePrice = val;
    }
    /**
     * average_price number
     */
    @JsonProperty("average_price")
    public Double getAveragePrice() {
        return averagePrice;
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
