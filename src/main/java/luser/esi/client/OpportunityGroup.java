package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class OpportunityGroup {
    private int[] connectedGroups;
    public void setConnectedGroups(int[] val) {
        connectedGroups = val;
    }
    public int[] getConnectedGroups() {
        return connectedGroups;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private int groupId;
    public void setGroupId(int val) {
        groupId = val;
    }
    public int getGroupId() {
        return groupId;
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
    private int[] requiredTasks;
    public void setRequiredTasks(int[] val) {
        requiredTasks = val;
    }
    public int[] getRequiredTasks() {
        return requiredTasks;
    }
    static OpportunityGroup fromJson(Json json) {
        if (json == null) {
            return null;
        }
        OpportunityGroup self = new OpportunityGroup();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("connected_groups").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.connectedGroups = rt;
        }
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.groupId = ApiClientBase.optGetInteger(js.get("group_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.notification = ApiClientBase.optGetString(js.get("notification"));
        {
            List<Json> jl = js.get("required_tasks").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.requiredTasks = rt;
        }
        return self;
    }
}
