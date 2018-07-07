package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationInfo {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    public Integer getAllianceId() {
        return allianceId;
    }
    private int ceoId;
    public void setCeoId(int val) {
        ceoId = val;
    }
    public int getCeoId() {
        return ceoId;
    }
    private int creatorId;
    public void setCreatorId(int val) {
        creatorId = val;
    }
    public int getCreatorId() {
        return creatorId;
    }
    private String dateFounded;
    public void setDateFounded(String val) {
        dateFounded = val;
    }
    public String getDateFounded() {
        return dateFounded;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    private Integer homeStationId;
    public void setHomeStationId(Integer val) {
        homeStationId = val;
    }
    public Integer getHomeStationId() {
        return homeStationId;
    }
    private int memberCount;
    public void setMemberCount(int val) {
        memberCount = val;
    }
    public int getMemberCount() {
        return memberCount;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private Long shares;
    public void setShares(Long val) {
        shares = val;
    }
    public Long getShares() {
        return shares;
    }
    private float taxRate;
    public void setTaxRate(float val) {
        taxRate = val;
    }
    public float getTaxRate() {
        return taxRate;
    }
    private String ticker;
    public void setTicker(String val) {
        ticker = val;
    }
    public String getTicker() {
        return ticker;
    }
    private String url;
    public void setUrl(String val) {
        url = val;
    }
    public String getUrl() {
        return url;
    }
    static CorporationInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationInfo self = new CorporationInfo();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.ceoId = ApiClientBase.optGetInteger(js.get("ceo_id"));
        self.creatorId = ApiClientBase.optGetInteger(js.get("creator_id"));
        self.dateFounded = ApiClientBase.optGetString(js.get("date_founded"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.homeStationId = ApiClientBase.optGetInteger(js.get("home_station_id"));
        self.memberCount = ApiClientBase.optGetInteger(js.get("member_count"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.shares = ApiClientBase.optGetLong(js.get("shares"));
        self.taxRate = ApiClientBase.optGetFloat(js.get("tax_rate"));
        self.ticker = ApiClientBase.optGetString(js.get("ticker"));
        self.url = ApiClientBase.optGetString(js.get("url"));
        return self;
    }
}
