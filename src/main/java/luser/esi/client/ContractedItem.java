package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ContractedItem implements ApiParameterObject {
    private boolean isIncluded;
    public void setIsIncluded(boolean val) {
        isIncluded = val;
    }
    @JsonProperty("is_included")
    public boolean getIsIncluded() {
        return isIncluded;
    }
    private boolean isSingleton;
    public void setIsSingleton(boolean val) {
        isSingleton = val;
    }
    @JsonProperty("is_singleton")
    public boolean getIsSingleton() {
        return isSingleton;
    }
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private Integer rawQuantity;
    public void setRawQuantity(Integer val) {
        rawQuantity = val;
    }
    @JsonProperty("raw_quantity")
    public Integer getRawQuantity() {
        return rawQuantity;
    }
    private long recordId;
    public void setRecordId(long val) {
        recordId = val;
    }
    @JsonProperty("record_id")
    public long getRecordId() {
        return recordId;
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
