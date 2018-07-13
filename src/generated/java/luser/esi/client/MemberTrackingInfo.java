package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MemberTrackingInfo implements ApiParameterObject {
    private Integer baseId;
    public void setBaseId(Integer val) {
        baseId = val;
    }
    @JsonProperty("base_id")
    public Integer getBaseId() {
        return baseId;
    }
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private Long locationId;
    public void setLocationId(Long val) {
        locationId = val;
    }
    @JsonProperty("location_id")
    public Long getLocationId() {
        return locationId;
    }
    private Instant logoffDate;
    public void setLogoffDate(Instant val) {
        logoffDate = val;
    }
    @JsonProperty("logoff_date")
    public Instant getLogoffDate() {
        return logoffDate;
    }
    private Instant logonDate;
    public void setLogonDate(Instant val) {
        logonDate = val;
    }
    @JsonProperty("logon_date")
    public Instant getLogonDate() {
        return logonDate;
    }
    private Integer shipTypeId;
    public void setShipTypeId(Integer val) {
        shipTypeId = val;
    }
    @JsonProperty("ship_type_id")
    public Integer getShipTypeId() {
        return shipTypeId;
    }
    private Instant startDate;
    public void setStartDate(Instant val) {
        startDate = val;
    }
    @JsonProperty("start_date")
    public Instant getStartDate() {
        return startDate;
    }
}
