package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SkillQueueEntry {
    private String finishDate;
    public void setFinishDate(String val) {
        finishDate = val;
    }
    public String getFinishDate() {
        return finishDate;
    }
    private int finishedLevel;
    public void setFinishedLevel(int val) {
        finishedLevel = val;
    }
    public int getFinishedLevel() {
        return finishedLevel;
    }
    private Integer levelEndSp;
    public void setLevelEndSp(Integer val) {
        levelEndSp = val;
    }
    public Integer getLevelEndSp() {
        return levelEndSp;
    }
    private Integer levelStartSp;
    public void setLevelStartSp(Integer val) {
        levelStartSp = val;
    }
    public Integer getLevelStartSp() {
        return levelStartSp;
    }
    private int queuePosition;
    public void setQueuePosition(int val) {
        queuePosition = val;
    }
    public int getQueuePosition() {
        return queuePosition;
    }
    private int skillId;
    public void setSkillId(int val) {
        skillId = val;
    }
    public int getSkillId() {
        return skillId;
    }
    private String startDate;
    public void setStartDate(String val) {
        startDate = val;
    }
    public String getStartDate() {
        return startDate;
    }
    private Integer trainingStartSp;
    public void setTrainingStartSp(Integer val) {
        trainingStartSp = val;
    }
    public Integer getTrainingStartSp() {
        return trainingStartSp;
    }
    static SkillQueueEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SkillQueueEntry self = new SkillQueueEntry();
        Map<String, Json> js = json.asJsonMap();
        self.finishDate = ApiClientBase.optGetString(js.get("finish_date"));
        self.finishedLevel = ApiClientBase.optGetInteger(js.get("finished_level"));
        self.levelEndSp = ApiClientBase.optGetInteger(js.get("level_end_sp"));
        self.levelStartSp = ApiClientBase.optGetInteger(js.get("level_start_sp"));
        self.queuePosition = ApiClientBase.optGetInteger(js.get("queue_position"));
        self.skillId = ApiClientBase.optGetInteger(js.get("skill_id"));
        self.startDate = ApiClientBase.optGetString(js.get("start_date"));
        self.trainingStartSp = ApiClientBase.optGetInteger(js.get("training_start_sp"));
        return self;
    }
}