package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class OpportunityInfo {
    private Instant completedAt;
    public void setCompletedAt(Instant val) {
        completedAt = val;
    }
    public Instant getCompletedAt() {
        return completedAt;
    }
    private int taskId;
    public void setTaskId(int val) {
        taskId = val;
    }
    public int getTaskId() {
        return taskId;
    }
    static OpportunityInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        OpportunityInfo self = new OpportunityInfo();
        Map<String, Json> js = json.asJsonMap();
        self.completedAt = ApiClientBase.optGetInstant(js.get("completed_at"));
        self.taskId = ApiClientBase.optGetInteger(js.get("task_id"));
        return self;
    }
}
