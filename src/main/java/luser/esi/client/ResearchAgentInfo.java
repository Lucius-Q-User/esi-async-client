package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ResearchAgentInfo {
    private int agentId;
    public void setAgentId(int val) {
        agentId = val;
    }
    public int getAgentId() {
        return agentId;
    }
    private float pointsPerDay;
    public void setPointsPerDay(float val) {
        pointsPerDay = val;
    }
    public float getPointsPerDay() {
        return pointsPerDay;
    }
    private float remainderPoints;
    public void setRemainderPoints(float val) {
        remainderPoints = val;
    }
    public float getRemainderPoints() {
        return remainderPoints;
    }
    private int skillTypeId;
    public void setSkillTypeId(int val) {
        skillTypeId = val;
    }
    public int getSkillTypeId() {
        return skillTypeId;
    }
    private String startedAt;
    public void setStartedAt(String val) {
        startedAt = val;
    }
    public String getStartedAt() {
        return startedAt;
    }
    static ResearchAgentInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ResearchAgentInfo self = new ResearchAgentInfo();
        Map<String, Json> js = json.asJsonMap();
        self.agentId = ApiClientBase.optGetInteger(js.get("agent_id"));
        self.pointsPerDay = ApiClientBase.optGetFloat(js.get("points_per_day"));
        self.remainderPoints = ApiClientBase.optGetFloat(js.get("remainder_points"));
        self.skillTypeId = ApiClientBase.optGetInteger(js.get("skill_type_id"));
        self.startedAt = ApiClientBase.optGetString(js.get("started_at"));
        return self;
    }
}
