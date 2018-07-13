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
    /**
     * in seconds
     */
    public void setCycleTime(Integer val) {
        cycleTime = val;
    }
    /**
     * in seconds
     */
    @JsonProperty("cycle_time")
    public Integer getCycleTime() {
        return cycleTime;
    }
    private Float headRadius;
    /**
     * head_radius number
     */
    public void setHeadRadius(Float val) {
        headRadius = val;
    }
    /**
     * head_radius number
     */
    @JsonProperty("head_radius")
    public Float getHeadRadius() {
        return headRadius;
    }
    private List<PIExtractorHead> heads;
    /**
     * heads array
     */
    public void setHeads(List<PIExtractorHead> val) {
        heads = val;
    }
    /**
     * heads array
     */
    @JsonProperty("heads")
    public List<PIExtractorHead> getHeads() {
        return heads;
    }
    private Integer productTypeId;
    /**
     * product_type_id integer
     */
    public void setProductTypeId(Integer val) {
        productTypeId = val;
    }
    /**
     * product_type_id integer
     */
    @JsonProperty("product_type_id")
    public Integer getProductTypeId() {
        return productTypeId;
    }
    private Integer qtyPerCycle;
    /**
     * qty_per_cycle integer
     */
    public void setQtyPerCycle(Integer val) {
        qtyPerCycle = val;
    }
    /**
     * qty_per_cycle integer
     */
    @JsonProperty("qty_per_cycle")
    public Integer getQtyPerCycle() {
        return qtyPerCycle;
    }
}
