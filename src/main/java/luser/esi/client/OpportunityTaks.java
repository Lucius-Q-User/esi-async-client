package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class OpportunityTaks {
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private String notification;
    public void setNotification(String val) {
        notification = val;
    }
    public String getNotification() {
        return notification;
    }
    private int taskId;
    public void setTaskId(int val) {
        taskId = val;
    }
    public int getTaskId() {
        return taskId;
    }
    static OpportunityTaks fromJson(Json json) {
        if (json == null) {
            return null;
        }
        OpportunityTaks self = new OpportunityTaks();
        Map<String, Json> js = json.asJsonMap();
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.notification = ApiClientBase.optGetString(js.get("notification"));
        self.taskId = ApiClientBase.optGetInteger(js.get("task_id"));
        return self;
    }
}
