package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class SovereigntyCampaign implements ApiParameterObject {
    private Float attackersScore;
    /**
     * Score for all attacking parties, only present in Defense Events.

     */
    public void setAttackersScore(Float val) {
        attackersScore = val;
    }
    /**
     * Score for all attacking parties, only present in Defense Events.

     */
    @JsonProperty("attackers_score")
    public Float getAttackersScore() {
        return attackersScore;
    }
    private int campaignId;
    /**
     * Unique ID for this campaign.
     */
    public void setCampaignId(int val) {
        campaignId = val;
    }
    /**
     * Unique ID for this campaign.
     */
    @JsonProperty("campaign_id")
    public int getCampaignId() {
        return campaignId;
    }
    private int constellationId;
    /**
     * The constellation in which the campaign will take place.

     */
    public void setConstellationId(int val) {
        constellationId = val;
    }
    /**
     * The constellation in which the campaign will take place.

     */
    @JsonProperty("constellation_id")
    public int getConstellationId() {
        return constellationId;
    }
    private Integer defenderId;
    /**
     * Defending alliance, only present in Defense Events

     */
    public void setDefenderId(Integer val) {
        defenderId = val;
    }
    /**
     * Defending alliance, only present in Defense Events

     */
    @JsonProperty("defender_id")
    public Integer getDefenderId() {
        return defenderId;
    }
    private Float defenderScore;
    /**
     * Score for the defending alliance, only present in Defense Events.

     */
    public void setDefenderScore(Float val) {
        defenderScore = val;
    }
    /**
     * Score for the defending alliance, only present in Defense Events.

     */
    @JsonProperty("defender_score")
    public Float getDefenderScore() {
        return defenderScore;
    }
    private EventTypeEnum eventType;
    /**
     * Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as "Defense Events", station_freeport as "Freeport Events".

     */
    public void setEventType(EventTypeEnum val) {
        eventType = val;
    }
    /**
     * Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as "Defense Events", station_freeport as "Freeport Events".

     */
    @JsonProperty("event_type")
    public EventTypeEnum getEventType() {
        return eventType;
    }
    private List<SovCampaignParticipant> participants;
    /**
     * Alliance participating and their respective scores, only present in Freeport Events.

     */
    public void setParticipants(List<SovCampaignParticipant> val) {
        participants = val;
    }
    /**
     * Alliance participating and their respective scores, only present in Freeport Events.

     */
    @JsonProperty("participants")
    public List<SovCampaignParticipant> getParticipants() {
        return participants;
    }
    private int solarSystemId;
    /**
     * The solar system the structure is located in.

     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * The solar system the structure is located in.

     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Instant startTime;
    /**
     * Time the event is scheduled to start.

     */
    public void setStartTime(Instant val) {
        startTime = val;
    }
    /**
     * Time the event is scheduled to start.

     */
    @JsonProperty("start_time")
    public Instant getStartTime() {
        return startTime;
    }
    private long structureId;
    /**
     * The structure item ID that is related to this campaign.

     */
    public void setStructureId(long val) {
        structureId = val;
    }
    /**
     * The structure item ID that is related to this campaign.

     */
    @JsonProperty("structure_id")
    public long getStructureId() {
        return structureId;
    }
    public static enum EventTypeEnum {
        TCU_DEFENSE("tcu_defense"),
        IHUB_DEFENSE("ihub_defense"),
        STATION_DEFENSE("station_defense"),
        STATION_FREEPORT("station_freeport");
        private final String stringValue;
        private EventTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static EventTypeEnum fromString(String str) {
            for (EventTypeEnum self : EventTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
