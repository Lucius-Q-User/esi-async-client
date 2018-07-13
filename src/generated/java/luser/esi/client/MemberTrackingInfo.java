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
    /**
     * base_id integer
     */
    public void setBaseId(Integer val) {
        baseId = val;
    }
    /**
     * base_id integer
     */
    @JsonProperty("base_id")
    public Integer getBaseId() {
        return baseId;
    }
    private int characterId;
    /**
     * character_id integer
     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * character_id integer
     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private Long locationId;
    /**
     * location_id integer
     */
    public void setLocationId(Long val) {
        locationId = val;
    }
    /**
     * location_id integer
     */
    @JsonProperty("location_id")
    public Long getLocationId() {
        return locationId;
    }
    private Instant logoffDate;
    /**
     * logoff_date string
     */
    public void setLogoffDate(Instant val) {
        logoffDate = val;
    }
    /**
     * logoff_date string
     */
    @JsonProperty("logoff_date")
    public Instant getLogoffDate() {
        return logoffDate;
    }
    private Instant logonDate;
    /**
     * logon_date string
     */
    public void setLogonDate(Instant val) {
        logonDate = val;
    }
    /**
     * logon_date string
     */
    @JsonProperty("logon_date")
    public Instant getLogonDate() {
        return logonDate;
    }
    private Integer shipTypeId;
    /**
     * ship_type_id integer
     */
    public void setShipTypeId(Integer val) {
        shipTypeId = val;
    }
    /**
     * ship_type_id integer
     */
    @JsonProperty("ship_type_id")
    public Integer getShipTypeId() {
        return shipTypeId;
    }
    private Instant startDate;
    /**
     * start_date string
     */
    public void setStartDate(Instant val) {
        startDate = val;
    }
    /**
     * start_date string
     */
    @JsonProperty("start_date")
    public Instant getStartDate() {
        return startDate;
    }
}
