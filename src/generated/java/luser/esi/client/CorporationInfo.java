package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationInfo implements ApiParameterObject {
    private Integer allianceId;
    /**
     * ID of the alliance that corporation is a member of, if any
     */
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    /**
     * ID of the alliance that corporation is a member of, if any
     */
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private int ceoId;
    /**
     * ceo_id integer
     */
    public void setCeoId(int val) {
        ceoId = val;
    }
    /**
     * ceo_id integer
     */
    @JsonProperty("ceo_id")
    public int getCeoId() {
        return ceoId;
    }
    private int creatorId;
    /**
     * creator_id integer
     */
    public void setCreatorId(int val) {
        creatorId = val;
    }
    /**
     * creator_id integer
     */
    @JsonProperty("creator_id")
    public int getCreatorId() {
        return creatorId;
    }
    private Instant dateFounded;
    /**
     * date_founded string
     */
    public void setDateFounded(Instant val) {
        dateFounded = val;
    }
    /**
     * date_founded string
     */
    @JsonProperty("date_founded")
    public Instant getDateFounded() {
        return dateFounded;
    }
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private Integer factionId;
    /**
     * faction_id integer
     */
    public void setFactionId(Integer val) {
        factionId = val;
    }
    /**
     * faction_id integer
     */
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private Integer homeStationId;
    /**
     * home_station_id integer
     */
    public void setHomeStationId(Integer val) {
        homeStationId = val;
    }
    /**
     * home_station_id integer
     */
    @JsonProperty("home_station_id")
    public Integer getHomeStationId() {
        return homeStationId;
    }
    private int memberCount;
    /**
     * member_count integer
     */
    public void setMemberCount(int val) {
        memberCount = val;
    }
    /**
     * member_count integer
     */
    @JsonProperty("member_count")
    public int getMemberCount() {
        return memberCount;
    }
    private String name;
    /**
     * the full name of the corporation
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * the full name of the corporation
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Long shares;
    /**
     * shares integer
     */
    public void setShares(Long val) {
        shares = val;
    }
    /**
     * shares integer
     */
    @JsonProperty("shares")
    public Long getShares() {
        return shares;
    }
    private float taxRate;
    /**
     * tax_rate number
     */
    public void setTaxRate(float val) {
        taxRate = val;
    }
    /**
     * tax_rate number
     */
    @JsonProperty("tax_rate")
    public float getTaxRate() {
        return taxRate;
    }
    private String ticker;
    /**
     * the short name of the corporation
     */
    public void setTicker(String val) {
        ticker = val;
    }
    /**
     * the short name of the corporation
     */
    @JsonProperty("ticker")
    public String getTicker() {
        return ticker;
    }
    private String url;
    /**
     * url string
     */
    public void setUrl(String val) {
        url = val;
    }
    /**
     * url string
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }
}
