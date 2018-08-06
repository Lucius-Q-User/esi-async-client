package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationAssetsEntry {
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
    private long itemId;
    /**
     * item_id integer
     */
    public void setItemId(long val) {
        itemId = val;
    }
    /**
     * item_id integer
     */
    @JsonProperty("item_id")
    public long getItemId() {
        return itemId;
    }
    private LocationFlagEnum locationFlag;
    /**
     * location_flag string
     */
    public void setLocationFlag(LocationFlagEnum val) {
        locationFlag = val;
    }
    /**
     * location_flag string
     */
    @JsonProperty("location_flag")
    public LocationFlagEnum getLocationFlag() {
        return locationFlag;
    }
    private long locationId;
    /**
     * location_id integer
     */
    public void setLocationId(long val) {
        locationId = val;
    }
    /**
     * location_id integer
     */
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private AssetLocationTypeEnum locationType;
    /**
     * location_type string
     */
    public void setLocationType(AssetLocationTypeEnum val) {
        locationType = val;
    }
    /**
     * location_type string
     */
    @JsonProperty("location_type")
    public AssetLocationTypeEnum getLocationType() {
        return locationType;
    }
    private int quantity;
    /**
     * quantity integer
     */
    public void setQuantity(int val) {
        quantity = val;
    }
    /**
     * quantity integer
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
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
