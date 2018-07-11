package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class IndustryFacilities implements ApiParameterObject {
    private long facilityId;
    public void setFacilityId(long val) {
        facilityId = val;
    }
    @JsonProperty("facility_id")
    public long getFacilityId() {
        return facilityId;
    }
    private int ownerId;
    public void setOwnerId(int val) {
        ownerId = val;
    }
    @JsonProperty("owner_id")
    public int getOwnerId() {
        return ownerId;
    }
    private int regionId;
    public void setRegionId(int val) {
        regionId = val;
    }
    @JsonProperty("region_id")
    public int getRegionId() {
        return regionId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Float tax;
    public void setTax(Float val) {
        tax = val;
    }
    @JsonProperty("tax")
    public Float getTax() {
        return tax;
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
