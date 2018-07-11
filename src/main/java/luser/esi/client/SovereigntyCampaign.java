package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SovereigntyCampaign implements ApiParameterObject {
    private Float attackersScore;
    public void setAttackersScore(Float val) {
        attackersScore = val;
    }
    @JsonProperty("attackers_score")
    public Float getAttackersScore() {
        return attackersScore;
    }
    private int campaignId;
    public void setCampaignId(int val) {
        campaignId = val;
    }
    @JsonProperty("campaign_id")
    public int getCampaignId() {
        return campaignId;
    }
    private int constellationId;
    public void setConstellationId(int val) {
        constellationId = val;
    }
    @JsonProperty("constellation_id")
    public int getConstellationId() {
        return constellationId;
    }
    private Integer defenderId;
    public void setDefenderId(Integer val) {
        defenderId = val;
    }
    @JsonProperty("defender_id")
    public Integer getDefenderId() {
        return defenderId;
    }
    private Float defenderScore;
    public void setDefenderScore(Float val) {
        defenderScore = val;
    }
    @JsonProperty("defender_score")
    public Float getDefenderScore() {
        return defenderScore;
    }
    private EventTypeEnum eventType;
    public void setEventType(EventTypeEnum val) {
        eventType = val;
    }
    @JsonProperty("event_type")
    public EventTypeEnum getEventType() {
        return eventType;
    }
    private List<SovCampaignParticipant> participants;
    public void setParticipants(List<SovCampaignParticipant> val) {
        participants = val;
    }
    @JsonProperty("participants")
    public List<SovCampaignParticipant> getParticipants() {
        return participants;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private Instant startTime;
    public void setStartTime(Instant val) {
        startTime = val;
    }
    @JsonProperty("start_time")
    public Instant getStartTime() {
        return startTime;
    }
    private long structureId;
    public void setStructureId(long val) {
        structureId = val;
    }
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
