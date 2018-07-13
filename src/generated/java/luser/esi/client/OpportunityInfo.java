package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class OpportunityInfo implements ApiParameterObject {
    private Instant completedAt;
    public void setCompletedAt(Instant val) {
        completedAt = val;
    }
    @JsonProperty("completed_at")
    public Instant getCompletedAt() {
        return completedAt;
    }
    private int taskId;
    public void setTaskId(int val) {
        taskId = val;
    }
    @JsonProperty("task_id")
    public int getTaskId() {
        return taskId;
    }
}
