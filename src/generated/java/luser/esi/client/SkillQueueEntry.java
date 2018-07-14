package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SkillQueueEntry implements ApiParameterObject {
    private Instant finishDate;
    /**
     * finish_date string
     */
    public void setFinishDate(Instant val) {
        finishDate = val;
    }
    /**
     * finish_date string
     */
    @JsonProperty("finish_date")
    public Instant getFinishDate() {
        return finishDate;
    }
    private int finishedLevel;
    /**
     * finished_level integer
     */
    public void setFinishedLevel(int val) {
        finishedLevel = val;
    }
    /**
     * finished_level integer
     */
    @JsonProperty("finished_level")
    public int getFinishedLevel() {
        return finishedLevel;
    }
    private Integer levelEndSp;
    /**
     * level_end_sp integer
     */
    public void setLevelEndSp(Integer val) {
        levelEndSp = val;
    }
    /**
     * level_end_sp integer
     */
    @JsonProperty("level_end_sp")
    public Integer getLevelEndSp() {
        return levelEndSp;
    }
    private Integer levelStartSp;
    /**
     * Amount of SP that was in the skill when it started training it's current level. Used to calculate % of current level complete.
     */
    public void setLevelStartSp(Integer val) {
        levelStartSp = val;
    }
    /**
     * Amount of SP that was in the skill when it started training it's current level. Used to calculate % of current level complete.
     */
    @JsonProperty("level_start_sp")
    public Integer getLevelStartSp() {
        return levelStartSp;
    }
    private int queuePosition;
    /**
     * queue_position integer
     */
    public void setQueuePosition(int val) {
        queuePosition = val;
    }
    /**
     * queue_position integer
     */
    @JsonProperty("queue_position")
    public int getQueuePosition() {
        return queuePosition;
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
    private Instant startDate;
    /**
     * start_date string
     */
    public void setStartDate(Instant val) {
        startDate = val;
    }
    /**
     * start_date string
     */
    @JsonProperty("start_date")
    public Instant getStartDate() {
        return startDate;
    }
    private Integer trainingStartSp;
    /**
     * training_start_sp integer
     */
    public void setTrainingStartSp(Integer val) {
        trainingStartSp = val;
    }
    /**
     * training_start_sp integer
     */
    @JsonProperty("training_start_sp")
    public Integer getTrainingStartSp() {
        return trainingStartSp;
    }
}
