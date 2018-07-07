package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class IndustryFacilities {
    private long facilityId;
    public void setFacilityId(long val) {
        facilityId = val;
    }
    public long getFacilityId() {
        return facilityId;
    }
    private int ownerId;
    public void setOwnerId(int val) {
        ownerId = val;
    }
    public int getOwnerId() {
        return ownerId;
    }
    private int regionId;
    public void setRegionId(int val) {
        regionId = val;
    }
    public int getRegionId() {
        return regionId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Float tax;
    public void setTax(Float val) {
        tax = val;
    }
    public Float getTax() {
        return tax;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static IndustryFacilities fromJson(Json json) {
        if (json == null) {
            return null;
        }
        IndustryFacilities self = new IndustryFacilities();
        Map<String, Json> js = json.asJsonMap();
        self.facilityId = ApiClientBase.optGetLong(js.get("facility_id"));
        self.ownerId = ApiClientBase.optGetInteger(js.get("owner_id"));
        self.regionId = ApiClientBase.optGetInteger(js.get("region_id"));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.tax = ApiClientBase.optGetFloat(js.get("tax"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
