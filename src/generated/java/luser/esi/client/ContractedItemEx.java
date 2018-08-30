package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractedItemEx {
    private Boolean isBlueprintCopy;
    /**
     * is_blueprint_copy boolean
     */
    public void setIsBlueprintCopy(Boolean val) {
        isBlueprintCopy = val;
    }
    /**
     * is_blueprint_copy boolean
     */
    @JsonProperty("is_blueprint_copy")
    public Boolean getIsBlueprintCopy() {
        return isBlueprintCopy;
    }
    private boolean isIncluded;
    /**
     * true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract
     */
    public void setIsIncluded(boolean val) {
        isIncluded = val;
    }
    /**
     * true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract
     */
    @JsonProperty("is_included")
    public boolean getIsIncluded() {
        return isIncluded;
    }
    private Long itemId;
    /**
     * Unique ID for the item being sold. Not present if item is being requested by contract rather than sold with contract
     */
    public void setItemId(Long val) {
        itemId = val;
    }
    /**
     * Unique ID for the item being sold. Not present if item is being requested by contract rather than sold with contract
     */
    @JsonProperty("item_id")
    public Long getItemId() {
        return itemId;
    }
    private Integer materialEfficiency;
    /**
     * Material Efficiency Level of the blueprint
     */
    public void setMaterialEfficiency(Integer val) {
        materialEfficiency = val;
    }
    /**
     * Material Efficiency Level of the blueprint
     */
    @JsonProperty("material_efficiency")
    public Integer getMaterialEfficiency() {
        return materialEfficiency;
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
    private long recordId;
    /**
     * Unique ID for the item, used by the contract system
     */
    public void setRecordId(long val) {
        recordId = val;
    }
    /**
     * Unique ID for the item, used by the contract system
     */
    @JsonProperty("record_id")
    public long getRecordId() {
        return recordId;
    }
    private Integer runs;
    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an original
     */
    public void setRuns(Integer val) {
        runs = val;
    }
    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an original
     */
    @JsonProperty("runs")
    public Integer getRuns() {
        return runs;
    }
    private Integer timeEfficiency;
    /**
     * Time Efficiency Level of the blueprint
     */
    public void setTimeEfficiency(Integer val) {
        timeEfficiency = val;
    }
    /**
     * Time Efficiency Level of the blueprint
     */
    @JsonProperty("time_efficiency")
    public Integer getTimeEfficiency() {
        return timeEfficiency;
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
