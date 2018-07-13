package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsPve implements ApiParameterObject {
    private Long dungeonsCompletedAgent;
    public void setDungeonsCompletedAgent(Long val) {
        dungeonsCompletedAgent = val;
    }
    @JsonProperty("dungeons_completed_agent")
    public Long getDungeonsCompletedAgent() {
        return dungeonsCompletedAgent;
    }
    private Long dungeonsCompletedDistribution;
    public void setDungeonsCompletedDistribution(Long val) {
        dungeonsCompletedDistribution = val;
    }
    @JsonProperty("dungeons_completed_distribution")
    public Long getDungeonsCompletedDistribution() {
        return dungeonsCompletedDistribution;
    }
    private Long missionsSucceeded;
    public void setMissionsSucceeded(Long val) {
        missionsSucceeded = val;
    }
    @JsonProperty("missions_succeeded")
    public Long getMissionsSucceeded() {
        return missionsSucceeded;
    }
    private Long missionsSucceededEpicArc;
    public void setMissionsSucceededEpicArc(Long val) {
        missionsSucceededEpicArc = val;
    }
    @JsonProperty("missions_succeeded_epic_arc")
    public Long getMissionsSucceededEpicArc() {
        return missionsSucceededEpicArc;
    }
}
