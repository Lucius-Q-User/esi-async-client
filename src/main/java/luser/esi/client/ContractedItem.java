package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ContractedItem {
    private boolean isIncluded;
    public void setIsIncluded(boolean val) {
        isIncluded = val;
    }
    public boolean getIsIncluded() {
        return isIncluded;
    }
    private boolean isSingleton;
    public void setIsSingleton(boolean val) {
        isSingleton = val;
    }
    public boolean getIsSingleton() {
        return isSingleton;
    }
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    public int getQuantity() {
        return quantity;
    }
    private Integer rawQuantity;
    public void setRawQuantity(Integer val) {
        rawQuantity = val;
    }
    public Integer getRawQuantity() {
        return rawQuantity;
    }
    private long recordId;
    public void setRecordId(long val) {
        recordId = val;
    }
    public long getRecordId() {
        return recordId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static ContractedItem fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ContractedItem self = new ContractedItem();
        Map<String, Json> js = json.asJsonMap();
        self.isIncluded = ApiClientBase.optGetBoolean(js.get("is_included"));
        self.isSingleton = ApiClientBase.optGetBoolean(js.get("is_singleton"));
        self.quantity = ApiClientBase.optGetInteger(js.get("quantity"));
        self.rawQuantity = ApiClientBase.optGetInteger(js.get("raw_quantity"));
        self.recordId = ApiClientBase.optGetLong(js.get("record_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
