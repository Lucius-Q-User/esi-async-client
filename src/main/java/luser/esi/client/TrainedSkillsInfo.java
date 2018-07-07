package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class TrainedSkillsInfo {
    private List<TrainedSkill> skills;
    public void setSkills(List<TrainedSkill> val) {
        skills = val;
    }
    public List<TrainedSkill> getSkills() {
        return skills;
    }
    private long totalSp;
    public void setTotalSp(long val) {
        totalSp = val;
    }
    public long getTotalSp() {
        return totalSp;
    }
    private Integer unallocatedSp;
    public void setUnallocatedSp(Integer val) {
        unallocatedSp = val;
    }
    public Integer getUnallocatedSp() {
        return unallocatedSp;
    }
    static TrainedSkillsInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        TrainedSkillsInfo self = new TrainedSkillsInfo();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("skills").asJsonList();
            List<TrainedSkill> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, TrainedSkill.fromJson(jl.get(i)));
            }
            self.skills = rt;
        }

        self.totalSp = ApiClientBase.optGetLong(js.get("total_sp"));
        self.unallocatedSp = ApiClientBase.optGetInteger(js.get("unallocated_sp"));
        return self;
    }
}
