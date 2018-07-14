package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrainedSkill implements ApiParameterObject {
    private int activeSkillLevel;
    /**
     * active_skill_level integer
     */
    public void setActiveSkillLevel(int val) {
        activeSkillLevel = val;
    }
    /**
     * active_skill_level integer
     */
    @JsonProperty("active_skill_level")
    public int getActiveSkillLevel() {
        return activeSkillLevel;
    }
    private int skillId;
    /**
     * skill_id integer
     */
    public void setSkillId(int val) {
        skillId = val;
    }
    /**
     * skill_id integer
     */
    @JsonProperty("skill_id")
    public int getSkillId() {
        return skillId;
    }
    private long skillpointsInSkill;
    /**
     * skillpoints_in_skill integer
     */
    public void setSkillpointsInSkill(long val) {
        skillpointsInSkill = val;
    }
    /**
     * skillpoints_in_skill integer
     */
    @JsonProperty("skillpoints_in_skill")
    public long getSkillpointsInSkill() {
        return skillpointsInSkill;
    }
    private int trainedSkillLevel;
    /**
     * trained_skill_level integer
     */
    public void setTrainedSkillLevel(int val) {
        trainedSkillLevel = val;
    }
    /**
     * trained_skill_level integer
     */
    @JsonProperty("trained_skill_level")
    public int getTrainedSkillLevel() {
        return trainedSkillLevel;
    }
}
