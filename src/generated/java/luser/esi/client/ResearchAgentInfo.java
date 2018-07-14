package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResearchAgentInfo implements ApiParameterObject {
    private int agentId;
    /**
     * agent_id integer
     */
    public void setAgentId(int val) {
        agentId = val;
    }
    /**
     * agent_id integer
     */
    @JsonProperty("agent_id")
    public int getAgentId() {
        return agentId;
    }
    private float pointsPerDay;
    /**
     * points_per_day number
     */
    public void setPointsPerDay(float val) {
        pointsPerDay = val;
    }
    /**
     * points_per_day number
     */
    @JsonProperty("points_per_day")
    public float getPointsPerDay() {
        return pointsPerDay;
    }
    private float remainderPoints;
    /**
     * remainder_points number
     */
    public void setRemainderPoints(float val) {
        remainderPoints = val;
    }
    /**
     * remainder_points number
     */
    @JsonProperty("remainder_points")
    public float getRemainderPoints() {
        return remainderPoints;
    }
    private int skillTypeId;
    /**
     * skill_type_id integer
     */
    public void setSkillTypeId(int val) {
        skillTypeId = val;
    }
    /**
     * skill_type_id integer
     */
    @JsonProperty("skill_type_id")
    public int getSkillTypeId() {
        return skillTypeId;
    }
    private Instant startedAt;
    /**
     * started_at string
     */
    public void setStartedAt(Instant val) {
        startedAt = val;
    }
    /**
     * started_at string
     */
    @JsonProperty("started_at")
    public Instant getStartedAt() {
        return startedAt;
    }
}
