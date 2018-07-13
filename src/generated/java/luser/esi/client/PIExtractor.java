package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class PIExtractor implements ApiParameterObject {
    private Integer cycleTime;
    public void setCycleTime(Integer val) {
        cycleTime = val;
    }
    @JsonProperty("cycle_time")
    public Integer getCycleTime() {
        return cycleTime;
    }
    private Float headRadius;
    public void setHeadRadius(Float val) {
        headRadius = val;
    }
    @JsonProperty("head_radius")
    public Float getHeadRadius() {
        return headRadius;
    }
    private List<PIExtractorHead> heads;
    public void setHeads(List<PIExtractorHead> val) {
        heads = val;
    }
    @JsonProperty("heads")
    public List<PIExtractorHead> getHeads() {
        return heads;
    }
    private Integer productTypeId;
    public void setProductTypeId(Integer val) {
        productTypeId = val;
    }
    @JsonProperty("product_type_id")
    public Integer getProductTypeId() {
        return productTypeId;
    }
    private Integer qtyPerCycle;
    public void setQtyPerCycle(Integer val) {
        qtyPerCycle = val;
    }
    @JsonProperty("qty_per_cycle")
    public Integer getQtyPerCycle() {
        return qtyPerCycle;
    }
}
