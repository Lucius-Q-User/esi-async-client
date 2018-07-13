package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SkillQueueEntry implements ApiParameterObject {
    private Instant finishDate;
    public void setFinishDate(Instant val) {
        finishDate = val;
    }
    @JsonProperty("finish_date")
    public Instant getFinishDate() {
        return finishDate;
    }
    private int finishedLevel;
    public void setFinishedLevel(int val) {
        finishedLevel = val;
    }
    @JsonProperty("finished_level")
    public int getFinishedLevel() {
        return finishedLevel;
    }
    private Integer levelEndSp;
    public void setLevelEndSp(Integer val) {
        levelEndSp = val;
    }
    @JsonProperty("level_end_sp")
    public Integer getLevelEndSp() {
        return levelEndSp;
    }
    private Integer levelStartSp;
    public void setLevelStartSp(Integer val) {
        levelStartSp = val;
    }
    @JsonProperty("level_start_sp")
    public Integer getLevelStartSp() {
        return levelStartSp;
    }
    private int queuePosition;
    public void setQueuePosition(int val) {
        queuePosition = val;
    }
    @JsonProperty("queue_position")
    public int getQueuePosition() {
        return queuePosition;
    }
    private int skillId;
    public void setSkillId(int val) {
        skillId = val;
    }
    @JsonProperty("skill_id")
    public int getSkillId() {
        return skillId;
    }
    private Instant startDate;
    public void setStartDate(Instant val) {
        startDate = val;
    }
    @JsonProperty("start_date")
    public Instant getStartDate() {
        return startDate;
    }
    private Integer trainingStartSp;
    public void setTrainingStartSp(Integer val) {
        trainingStartSp = val;
    }
    @JsonProperty("training_start_sp")
    public Integer getTrainingStartSp() {
        return trainingStartSp;
    }
}
