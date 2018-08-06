package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationBlueprint {
    private long itemId;
    /**
     * Unique ID for this item.
     */
    public void setItemId(long val) {
        itemId = val;
    }
    /**
     * Unique ID for this item.
     */
    @JsonProperty("item_id")
    public long getItemId() {
        return itemId;
    }
    private LocationFlagEnum locationFlag;
    /**
     * Type of the location_id
     */
    public void setLocationFlag(LocationFlagEnum val) {
        locationFlag = val;
    }
    /**
     * Type of the location_id
     */
    @JsonProperty("location_flag")
    public LocationFlagEnum getLocationFlag() {
        return locationFlag;
    }
    private long locationId;
    /**
     * References a solar system, station or item_id if this blueprint is located within a container.
     */
    public void setLocationId(long val) {
        locationId = val;
    }
    /**
     * References a solar system, station or item_id if this blueprint is located within a container.
     */
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private int materialEfficiency;
    /**
     * Material Efficiency Level of the blueprint.
     */
    public void setMaterialEfficiency(int val) {
        materialEfficiency = val;
    }
    /**
     * Material Efficiency Level of the blueprint.
     */
    @JsonProperty("material_efficiency")
    public int getMaterialEfficiency() {
        return materialEfficiency;
    }
    private int quantity;
    /**
     * A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).
     */
    public void setQuantity(int val) {
        quantity = val;
    }
    /**
     * A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private int runs;
    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an original.
     */
    public void setRuns(int val) {
        runs = val;
    }
    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an original.
     */
    @JsonProperty("runs")
    public int getRuns() {
        return runs;
    }
    private int timeEfficiency;
    /**
     * Time Efficiency Level of the blueprint.
     */
    public void setTimeEfficiency(int val) {
        timeEfficiency = val;
    }
    /**
     * Time Efficiency Level of the blueprint.
     */
    @JsonProperty("time_efficiency")
    public int getTimeEfficiency() {
        return timeEfficiency;
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
