package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationFacility {
    private long facilityId;
    /**
     * facility_id integer
     */
    public void setFacilityId(long val) {
        facilityId = val;
    }
    /**
     * facility_id integer
     */
    @JsonProperty("facility_id")
    public long getFacilityId() {
        return facilityId;
    }
    private int systemId;
    /**
     * system_id integer
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * system_id integer
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
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
