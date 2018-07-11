package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationFacility implements ApiParameterObject {
    private long facilityId;
    public void setFacilityId(long val) {
        facilityId = val;
    }
    @JsonProperty("facility_id")
    public long getFacilityId() {
        return facilityId;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
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
