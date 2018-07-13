package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ResearchAgentInfo implements ApiParameterObject {
    private int agentId;
    public void setAgentId(int val) {
        agentId = val;
    }
    @JsonProperty("agent_id")
    public int getAgentId() {
        return agentId;
    }
    private float pointsPerDay;
    public void setPointsPerDay(float val) {
        pointsPerDay = val;
    }
    @JsonProperty("points_per_day")
    public float getPointsPerDay() {
        return pointsPerDay;
    }
    private float remainderPoints;
    public void setRemainderPoints(float val) {
        remainderPoints = val;
    }
    @JsonProperty("remainder_points")
    public float getRemainderPoints() {
        return remainderPoints;
    }
    private int skillTypeId;
    public void setSkillTypeId(int val) {
        skillTypeId = val;
    }
    @JsonProperty("skill_type_id")
    public int getSkillTypeId() {
        return skillTypeId;
    }
    private Instant startedAt;
    public void setStartedAt(Instant val) {
        startedAt = val;
    }
    @JsonProperty("started_at")
    public Instant getStartedAt() {
        return startedAt;
    }
}
