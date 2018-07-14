package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AllianceInfo implements ApiParameterObject {
    private int creatorCorporationId;
    /**
     * ID of the corporation that created the alliance
     */
    public void setCreatorCorporationId(int val) {
        creatorCorporationId = val;
    }
    /**
     * ID of the corporation that created the alliance
     */
    @JsonProperty("creator_corporation_id")
    public int getCreatorCorporationId() {
        return creatorCorporationId;
    }
    private int creatorId;
    /**
     * ID of the character that created the alliance
     */
    public void setCreatorId(int val) {
        creatorId = val;
    }
    /**
     * ID of the character that created the alliance
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
    private Integer executorCorporationId;
    /**
     * the executor corporation ID, if this alliance is not closed
     */
    public void setExecutorCorporationId(Integer val) {
        executorCorporationId = val;
    }
    /**
     * the executor corporation ID, if this alliance is not closed
     */
    @JsonProperty("executor_corporation_id")
    public Integer getExecutorCorporationId() {
        return executorCorporationId;
    }
    private Integer factionId;
    /**
     * Faction ID this alliance is fighting for, if this alliance is enlisted in factional warfare
     */
    public void setFactionId(Integer val) {
        factionId = val;
    }
    /**
     * Faction ID this alliance is fighting for, if this alliance is enlisted in factional warfare
     */
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private String name;
    /**
     * the full name of the alliance
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * the full name of the alliance
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private String ticker;
    /**
     * the short name of the alliance
     */
    public void setTicker(String val) {
        ticker = val;
    }
    /**
     * the short name of the alliance
     */
    @JsonProperty("ticker")
    public String getTicker() {
        return ticker;
    }
}
