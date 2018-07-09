package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class AllianceInfo {
    private int creatorCorporationId;
    public void setCreatorCorporationId(int val) {
        creatorCorporationId = val;
    }
    public int getCreatorCorporationId() {
        return creatorCorporationId;
    }
    private int creatorId;
    public void setCreatorId(int val) {
        creatorId = val;
    }
    public int getCreatorId() {
        return creatorId;
    }
    private Instant dateFounded;
    public void setDateFounded(Instant val) {
        dateFounded = val;
    }
    public Instant getDateFounded() {
        return dateFounded;
    }
    private Integer executorCorporationId;
    public void setExecutorCorporationId(Integer val) {
        executorCorporationId = val;
    }
    public Integer getExecutorCorporationId() {
        return executorCorporationId;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private String ticker;
    public void setTicker(String val) {
        ticker = val;
    }
    public String getTicker() {
        return ticker;
    }
    static AllianceInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        AllianceInfo self = new AllianceInfo();
        Map<String, Json> js = json.asJsonMap();
        self.creatorCorporationId = ApiClientBase.optGetInteger(js.get("creator_corporation_id"));
        self.creatorId = ApiClientBase.optGetInteger(js.get("creator_id"));
        self.dateFounded = ApiClientBase.optGetInstant(js.get("date_founded"));
        self.executorCorporationId = ApiClientBase.optGetInteger(js.get("executor_corporation_id"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.ticker = ApiClientBase.optGetString(js.get("ticker"));
        return self;
    }
}
