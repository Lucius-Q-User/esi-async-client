package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SovereigntyCampaign {
    private Float attackersScore;
    public void setAttackersScore(Float val) {
        attackersScore = val;
    }
    public Float getAttackersScore() {
        return attackersScore;
    }
    private int campaignId;
    public void setCampaignId(int val) {
        campaignId = val;
    }
    public int getCampaignId() {
        return campaignId;
    }
    private int constellationId;
    public void setConstellationId(int val) {
        constellationId = val;
    }
    public int getConstellationId() {
        return constellationId;
    }
    private Integer defenderId;
    public void setDefenderId(Integer val) {
        defenderId = val;
    }
    public Integer getDefenderId() {
        return defenderId;
    }
    private Float defenderScore;
    public void setDefenderScore(Float val) {
        defenderScore = val;
    }
    public Float getDefenderScore() {
        return defenderScore;
    }
    private EventTypeEnum eventType;
    public void setEventType(EventTypeEnum val) {
        eventType = val;
    }
    public EventTypeEnum getEventType() {
        return eventType;
    }
    private List<SovCampaignParticipant> participants;
    public void setParticipants(List<SovCampaignParticipant> val) {
        participants = val;
    }
    public List<SovCampaignParticipant> getParticipants() {
        return participants;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private String startTime;
    public void setStartTime(String val) {
        startTime = val;
    }
    public String getStartTime() {
        return startTime;
    }
    private long structureId;
    public void setStructureId(long val) {
        structureId = val;
    }
    public long getStructureId() {
        return structureId;
    }
    static SovereigntyCampaign fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SovereigntyCampaign self = new SovereigntyCampaign();
        Map<String, Json> js = json.asJsonMap();
        self.attackersScore = ApiClientBase.optGetFloat(js.get("attackers_score"));
        self.campaignId = ApiClientBase.optGetInteger(js.get("campaign_id"));
        self.constellationId = ApiClientBase.optGetInteger(js.get("constellation_id"));
        self.defenderId = ApiClientBase.optGetInteger(js.get("defender_id"));
        self.defenderScore = ApiClientBase.optGetFloat(js.get("defender_score"));
        self.eventType = EventTypeEnum.fromString(ApiClientBase.optGetString(js.get("event_type")));
        {
            List<Json> jl = js.get("participants").asJsonList();
            List<SovCampaignParticipant> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, SovCampaignParticipant.fromJson(jl.get(i)));
            }
            self.participants = rt;
        }

        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.startTime = ApiClientBase.optGetString(js.get("start_time"));
        self.structureId = ApiClientBase.optGetLong(js.get("structure_id"));
        return self;
    }
    public static enum EventTypeEnum {
        TCU_DEFENSE("tcu_defense"),
        IHUB_DEFENSE("ihub_defense"),
        STATION_DEFENSE("station_defense"),
        STATION_FREEPORT("station_freeport");
        public final String stringValue;
        private EventTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
