package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class OpportunityTaks implements ApiParameterObject {
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private String notification;
    public void setNotification(String val) {
        notification = val;
    }
    @JsonProperty("notification")
    public String getNotification() {
        return notification;
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
