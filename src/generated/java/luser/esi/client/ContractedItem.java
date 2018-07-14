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
public class ContractedItem implements ApiParameterObject {
    private boolean isIncluded;
    /**
     * true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract.
     */
    public void setIsIncluded(boolean val) {
        isIncluded = val;
    }
    /**
     * true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract.
     */
    @JsonProperty("is_included")
    public boolean getIsIncluded() {
        return isIncluded;
    }
    private boolean isSingleton;
    /**
     * is_singleton boolean
     */
    public void setIsSingleton(boolean val) {
        isSingleton = val;
    }
    /**
     * is_singleton boolean
     */
    @JsonProperty("is_singleton")
    public boolean getIsSingleton() {
        return isSingleton;
    }
    private int quantity;
    /**
     * Number of items in the stack
     */
    public void setQuantity(int val) {
        quantity = val;
    }
    /**
     * Number of items in the stack
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private Integer rawQuantity;
    /**
     * -1 indicates that the item is a singleton (non-stackable). If the item happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy
     */
    public void setRawQuantity(Integer val) {
        rawQuantity = val;
    }
    /**
     * -1 indicates that the item is a singleton (non-stackable). If the item happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy
     */
    @JsonProperty("raw_quantity")
    public Integer getRawQuantity() {
        return rawQuantity;
    }
    private long recordId;
    /**
     * Unique ID for the item
     */
    public void setRecordId(long val) {
        recordId = val;
    }
    /**
     * Unique ID for the item
     */
    @JsonProperty("record_id")
    public long getRecordId() {
        return recordId;
    }
    private int typeId;
    /**
     * Type ID for item
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * Type ID for item
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
