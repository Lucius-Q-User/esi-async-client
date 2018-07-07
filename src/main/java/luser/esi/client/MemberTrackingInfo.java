package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MemberTrackingInfo {
    private Integer baseId;
    public void setBaseId(Integer val) {
        baseId = val;
    }
    public Integer getBaseId() {
        return baseId;
    }
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    public int getCharacterId() {
        return characterId;
    }
    private Long locationId;
    public void setLocationId(Long val) {
        locationId = val;
    }
    public Long getLocationId() {
        return locationId;
    }
    private String logoffDate;
    public void setLogoffDate(String val) {
        logoffDate = val;
    }
    public String getLogoffDate() {
        return logoffDate;
    }
    private String logonDate;
    public void setLogonDate(String val) {
        logonDate = val;
    }
    public String getLogonDate() {
        return logonDate;
    }
    private Integer shipTypeId;
    public void setShipTypeId(Integer val) {
        shipTypeId = val;
    }
    public Integer getShipTypeId() {
        return shipTypeId;
    }
    private String startDate;
    public void setStartDate(String val) {
        startDate = val;
    }
    public String getStartDate() {
        return startDate;
    }
    static MemberTrackingInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MemberTrackingInfo self = new MemberTrackingInfo();
        Map<String, Json> js = json.asJsonMap();
        self.baseId = ApiClientBase.optGetInteger(js.get("base_id"));
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.locationId = ApiClientBase.optGetLong(js.get("location_id"));
        self.logoffDate = ApiClientBase.optGetString(js.get("logoff_date"));
        self.logonDate = ApiClientBase.optGetString(js.get("logon_date"));
        self.shipTypeId = ApiClientBase.optGetInteger(js.get("ship_type_id"));
        self.startDate = ApiClientBase.optGetString(js.get("start_date"));
        return self;
    }
}
