package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TrainedSkillsInfo {
    private List<TrainedSkill> skills;
    /**
     * skills array
     */
    public void setSkills(List<TrainedSkill> val) {
        skills = val;
    }
    /**
     * skills array
     */
    @JsonProperty("skills")
    public List<TrainedSkill> getSkills() {
        return skills;
    }
    private long totalSp;
    /**
     * total_sp integer
     */
    public void setTotalSp(long val) {
        totalSp = val;
    }
    /**
     * total_sp integer
     */
    @JsonProperty("total_sp")
    public long getTotalSp() {
        return totalSp;
    }
    private Integer unallocatedSp;
    /**
     * Skill points available to be assigned
     */
    public void setUnallocatedSp(Integer val) {
        unallocatedSp = val;
    }
    /**
     * Skill points available to be assigned
     */
    @JsonProperty("unallocated_sp")
    public Integer getUnallocatedSp() {
        return unallocatedSp;
    }
}
