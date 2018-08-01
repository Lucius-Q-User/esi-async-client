package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OpportunityInfo {
    private Instant completedAt;
    /**
     * completed_at string
     */
    public void setCompletedAt(Instant val) {
        completedAt = val;
    }
    /**
     * completed_at string
     */
    @JsonProperty("completed_at")
    public Instant getCompletedAt() {
        return completedAt;
    }
    private int taskId;
    /**
     * task_id integer
     */
    public void setTaskId(int val) {
        taskId = val;
    }
    /**
     * task_id integer
     */
    @JsonProperty("task_id")
    public int getTaskId() {
        return taskId;
    }
}
