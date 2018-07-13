package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class AllianceInfo implements ApiParameterObject {
    private int creatorCorporationId;
    public void setCreatorCorporationId(int val) {
        creatorCorporationId = val;
    }
    @JsonProperty("creator_corporation_id")
    public int getCreatorCorporationId() {
        return creatorCorporationId;
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
    private Integer executorCorporationId;
    public void setExecutorCorporationId(Integer val) {
        executorCorporationId = val;
    }
    @JsonProperty("executor_corporation_id")
    public Integer getExecutorCorporationId() {
        return executorCorporationId;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private String ticker;
    public void setTicker(String val) {
        ticker = val;
    }
    @JsonProperty("ticker")
    public String getTicker() {
        return ticker;
    }
}
