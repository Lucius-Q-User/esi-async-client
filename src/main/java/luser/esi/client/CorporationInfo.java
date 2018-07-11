package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationInfo implements ApiParameterObject {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private int ceoId;
    public void setCeoId(int val) {
        ceoId = val;
    }
    @JsonProperty("ceo_id")
    public int getCeoId() {
        return ceoId;
    }
    private int creatorId;
    public void setCreatorId(int val) {
        creatorId = val;
    }
    @JsonProperty("creator_id")
    public int getCreatorId() {
        return creatorId;
    }
    private Instant dateFounded;
    public void setDateFounded(Instant val) {
        dateFounded = val;
    }
    @JsonProperty("date_founded")
    public Instant getDateFounded() {
        return dateFounded;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private Integer homeStationId;
    public void setHomeStationId(Integer val) {
        homeStationId = val;
    }
    @JsonProperty("home_station_id")
    public Integer getHomeStationId() {
        return homeStationId;
    }
    private int memberCount;
    public void setMemberCount(int val) {
        memberCount = val;
    }
    @JsonProperty("member_count")
    public int getMemberCount() {
        return memberCount;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Long shares;
    public void setShares(Long val) {
        shares = val;
    }
    @JsonProperty("shares")
    public Long getShares() {
        return shares;
    }
    private float taxRate;
    public void setTaxRate(float val) {
        taxRate = val;
    }
    @JsonProperty("tax_rate")
    public float getTaxRate() {
        return taxRate;
    }
    private String ticker;
    public void setTicker(String val) {
        ticker = val;
    }
    @JsonProperty("ticker")
    public String getTicker() {
        return ticker;
    }
    private String url;
    public void setUrl(String val) {
        url = val;
    }
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }
}
