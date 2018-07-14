package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndustryFacilities implements ApiParameterObject {
    private long facilityId;
    /**
     * ID of the facility
     */
    public void setFacilityId(long val) {
        facilityId = val;
    }
    /**
     * ID of the facility
     */
    @JsonProperty("facility_id")
    public long getFacilityId() {
        return facilityId;
    }
    private int ownerId;
    /**
     * Owner of the facility
     */
    public void setOwnerId(int val) {
        ownerId = val;
    }
    /**
     * Owner of the facility
     */
    @JsonProperty("owner_id")
    public int getOwnerId() {
        return ownerId;
    }
    private int regionId;
    /**
     * Region ID where the facility is
     */
    public void setRegionId(int val) {
        regionId = val;
    }
    /**
     * Region ID where the facility is
     */
    @JsonProperty("region_id")
    public int getRegionId() {
        return regionId;
    }
    private int solarSystemId;
    /**
     * Solar system ID where the facility is
     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * Solar system ID where the facility is
     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Float tax;
    /**
     * Tax imposed by the facility
     */
    public void setTax(Float val) {
        tax = val;
    }
    /**
     * Tax imposed by the facility
     */
    @JsonProperty("tax")
    public Float getTax() {
        return tax;
    }
    private int typeId;
    /**
     * Type ID of the facility
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * Type ID of the facility
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
