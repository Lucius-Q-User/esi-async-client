package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class TrainedSkillsInfo implements ApiParameterObject {
    private List<TrainedSkill> skills;
    public void setSkills(List<TrainedSkill> val) {
        skills = val;
    }
    @JsonProperty("skills")
    public List<TrainedSkill> getSkills() {
        return skills;
    }
    private long totalSp;
    public void setTotalSp(long val) {
        totalSp = val;
    }
    @JsonProperty("total_sp")
    public long getTotalSp() {
        return totalSp;
    }
    private Integer unallocatedSp;
    public void setUnallocatedSp(Integer val) {
        unallocatedSp = val;
    }
    @JsonProperty("unallocated_sp")
    public Integer getUnallocatedSp() {
        return unallocatedSp;
    }
}
