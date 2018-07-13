package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class TrainedSkill implements ApiParameterObject {
    private int activeSkillLevel;
    public void setActiveSkillLevel(int val) {
        activeSkillLevel = val;
    }
    @JsonProperty("active_skill_level")
    public int getActiveSkillLevel() {
        return activeSkillLevel;
    }
    private int skillId;
    public void setSkillId(int val) {
        skillId = val;
    }
    @JsonProperty("skill_id")
    public int getSkillId() {
        return skillId;
    }
    private long skillpointsInSkill;
    public void setSkillpointsInSkill(long val) {
        skillpointsInSkill = val;
    }
    @JsonProperty("skillpoints_in_skill")
    public long getSkillpointsInSkill() {
        return skillpointsInSkill;
    }
    private int trainedSkillLevel;
    public void setTrainedSkillLevel(int val) {
        trainedSkillLevel = val;
    }
    @JsonProperty("trained_skill_level")
    public int getTrainedSkillLevel() {
        return trainedSkillLevel;
    }
}
