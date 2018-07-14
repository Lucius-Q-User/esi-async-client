package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsPve implements ApiParameterObject {
    private Long dungeonsCompletedAgent;
    /**
     * dungeons_completed_agent integer
     */
    public void setDungeonsCompletedAgent(Long val) {
        dungeonsCompletedAgent = val;
    }
    /**
     * dungeons_completed_agent integer
     */
    @JsonProperty("dungeons_completed_agent")
    public Long getDungeonsCompletedAgent() {
        return dungeonsCompletedAgent;
    }
    private Long dungeonsCompletedDistribution;
    /**
     * dungeons_completed_distribution integer
     */
    public void setDungeonsCompletedDistribution(Long val) {
        dungeonsCompletedDistribution = val;
    }
    /**
     * dungeons_completed_distribution integer
     */
    @JsonProperty("dungeons_completed_distribution")
    public Long getDungeonsCompletedDistribution() {
        return dungeonsCompletedDistribution;
    }
    private Long missionsSucceeded;
    /**
     * missions_succeeded integer
     */
    public void setMissionsSucceeded(Long val) {
        missionsSucceeded = val;
    }
    /**
     * missions_succeeded integer
     */
    @JsonProperty("missions_succeeded")
    public Long getMissionsSucceeded() {
        return missionsSucceeded;
    }
    private Long missionsSucceededEpicArc;
    /**
     * missions_succeeded_epic_arc integer
     */
    public void setMissionsSucceededEpicArc(Long val) {
        missionsSucceededEpicArc = val;
    }
    /**
     * missions_succeeded_epic_arc integer
     */
    @JsonProperty("missions_succeeded_epic_arc")
    public Long getMissionsSucceededEpicArc() {
        return missionsSucceededEpicArc;
    }
}
