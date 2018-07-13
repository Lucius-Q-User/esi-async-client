package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class OpportunityGroup implements ApiParameterObject {
    private int[] connectedGroups;
    public void setConnectedGroups(int[] val) {
        connectedGroups = val;
    }
    @JsonProperty("connected_groups")
    public int[] getConnectedGroups() {
        return connectedGroups;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int groupId;
    public void setGroupId(int val) {
        groupId = val;
    }
    @JsonProperty("group_id")
    public int getGroupId() {
        return groupId;
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
    private int[] requiredTasks;
    public void setRequiredTasks(int[] val) {
        requiredTasks = val;
    }
    @JsonProperty("required_tasks")
    public int[] getRequiredTasks() {
        return requiredTasks;
    }
}