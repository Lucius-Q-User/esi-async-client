package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PIExtractor {
    private Integer cycleTime;
    public void setCycleTime(Integer val) {
        cycleTime = val;
    }
    public Integer getCycleTime() {
        return cycleTime;
    }
    private Float headRadius;
    public void setHeadRadius(Float val) {
        headRadius = val;
    }
    public Float getHeadRadius() {
        return headRadius;
    }
    private List<PIExtractorHead> heads;
    public void setHeads(List<PIExtractorHead> val) {
        heads = val;
    }
    public List<PIExtractorHead> getHeads() {
        return heads;
    }
    private Integer productTypeId;
    public void setProductTypeId(Integer val) {
        productTypeId = val;
    }
    public Integer getProductTypeId() {
        return productTypeId;
    }
    private Integer qtyPerCycle;
    public void setQtyPerCycle(Integer val) {
        qtyPerCycle = val;
    }
    public Integer getQtyPerCycle() {
        return qtyPerCycle;
    }
    static PIExtractor fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PIExtractor self = new PIExtractor();
        Map<String, Json> js = json.asJsonMap();
        self.cycleTime = ApiClientBase.optGetInteger(js.get("cycle_time"));
        self.headRadius = ApiClientBase.optGetFloat(js.get("head_radius"));
        {
            List<Json> jl = js.get("heads").asJsonList();
            List<PIExtractorHead> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(PIExtractorHead.fromJson(jl.get(i)));
            }
            self.heads = rt;
        }
        self.productTypeId = ApiClientBase.optGetInteger(js.get("product_type_id"));
        self.qtyPerCycle = ApiClientBase.optGetInteger(js.get("qty_per_cycle"));
        return self;
    }
}
