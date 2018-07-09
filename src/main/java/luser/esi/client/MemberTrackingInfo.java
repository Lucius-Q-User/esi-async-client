package luser.esi.client;

import java.time.Instant;
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
    private Instant logoffDate;
    public void setLogoffDate(Instant val) {
        logoffDate = val;
    }
    public Instant getLogoffDate() {
        return logoffDate;
    }
    private Instant logonDate;
    public void setLogonDate(Instant val) {
        logonDate = val;
    }
    public Instant getLogonDate() {
        return logonDate;
    }
    private Integer shipTypeId;
    public void setShipTypeId(Integer val) {
        shipTypeId = val;
    }
    public Integer getShipTypeId() {
        return shipTypeId;
    }
    private Instant startDate;
    public void setStartDate(Instant val) {
        startDate = val;
    }
    public Instant getStartDate() {
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
        self.logoffDate = ApiClientBase.optGetInstant(js.get("logoff_date"));
        self.logonDate = ApiClientBase.optGetInstant(js.get("logon_date"));
        self.shipTypeId = ApiClientBase.optGetInteger(js.get("ship_type_id"));
        self.startDate = ApiClientBase.optGetInstant(js.get("start_date"));
        return self;
    }
}
