package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsPve {
    private Long dungeonsCompletedAgent;
    public void setDungeonsCompletedAgent(Long val) {
        dungeonsCompletedAgent = val;
    }
    public Long getDungeonsCompletedAgent() {
        return dungeonsCompletedAgent;
    }
    private Long dungeonsCompletedDistribution;
    public void setDungeonsCompletedDistribution(Long val) {
        dungeonsCompletedDistribution = val;
    }
    public Long getDungeonsCompletedDistribution() {
        return dungeonsCompletedDistribution;
    }
    private Long missionsSucceeded;
    public void setMissionsSucceeded(Long val) {
        missionsSucceeded = val;
    }
    public Long getMissionsSucceeded() {
        return missionsSucceeded;
    }
    private Long missionsSucceededEpicArc;
    public void setMissionsSucceededEpicArc(Long val) {
        missionsSucceededEpicArc = val;
    }
    public Long getMissionsSucceededEpicArc() {
        return missionsSucceededEpicArc;
    }
    static CharacterStatsPve fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsPve self = new CharacterStatsPve();
        Map<String, Json> js = json.asJsonMap();
        self.dungeonsCompletedAgent = ApiClientBase.optGetLong(js.get("dungeons_completed_agent"));
        self.dungeonsCompletedDistribution = ApiClientBase.optGetLong(js.get("dungeons_completed_distribution"));
        self.missionsSucceeded = ApiClientBase.optGetLong(js.get("missions_succeeded"));
        self.missionsSucceededEpicArc = ApiClientBase.optGetLong(js.get("missions_succeeded_epic_arc"));
        return self;
    }
}
