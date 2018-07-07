package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationFacility {
    private long facilityId;
    public void setFacilityId(long val) {
        facilityId = val;
    }
    public long getFacilityId() {
        return facilityId;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static CorporationFacility fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationFacility self = new CorporationFacility();
        Map<String, Json> js = json.asJsonMap();
        self.facilityId = ApiClientBase.optGetLong(js.get("facility_id"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
