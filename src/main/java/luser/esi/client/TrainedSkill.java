package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class TrainedSkill {
    private int activeSkillLevel;
    public void setActiveSkillLevel(int val) {
        activeSkillLevel = val;
    }
    public int getActiveSkillLevel() {
        return activeSkillLevel;
    }
    private int skillId;
    public void setSkillId(int val) {
        skillId = val;
    }
    public int getSkillId() {
        return skillId;
    }
    private long skillpointsInSkill;
    public void setSkillpointsInSkill(long val) {
        skillpointsInSkill = val;
    }
    public long getSkillpointsInSkill() {
        return skillpointsInSkill;
    }
    private int trainedSkillLevel;
    public void setTrainedSkillLevel(int val) {
        trainedSkillLevel = val;
    }
    public int getTrainedSkillLevel() {
        return trainedSkillLevel;
    }
    static TrainedSkill fromJson(Json json) {
        if (json == null) {
            return null;
        }
        TrainedSkill self = new TrainedSkill();
        Map<String, Json> js = json.asJsonMap();
        self.activeSkillLevel = ApiClientBase.optGetInteger(js.get("active_skill_level"));
        self.skillId = ApiClientBase.optGetInteger(js.get("skill_id"));
        self.skillpointsInSkill = ApiClientBase.optGetLong(js.get("skillpoints_in_skill"));
        self.trainedSkillLevel = ApiClientBase.optGetInteger(js.get("trained_skill_level"));
        return self;
    }
}
