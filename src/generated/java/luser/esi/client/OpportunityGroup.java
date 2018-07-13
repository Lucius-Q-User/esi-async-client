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
    /**
     * The groups that are connected to this group on the opportunities map
     */
    public void setConnectedGroups(int[] val) {
        connectedGroups = val;
    }
    /**
     * The groups that are connected to this group on the opportunities map
     */
    @JsonProperty("connected_groups")
    public int[] getConnectedGroups() {
        return connectedGroups;
    }
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private int groupId;
    /**
     * group_id integer
     */
    public void setGroupId(int val) {
        groupId = val;
    }
    /**
     * group_id integer
     */
    @JsonProperty("group_id")
    public int getGroupId() {
        return groupId;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private String notification;
    /**
     * notification string
     */
    public void setNotification(String val) {
        notification = val;
    }
    /**
     * notification string
     */
    @JsonProperty("notification")
    public String getNotification() {
        return notification;
    }
    private int[] requiredTasks;
    /**
     * Tasks need to complete for this group
     */
    public void setRequiredTasks(int[] val) {
        requiredTasks = val;
    }
    /**
     * Tasks need to complete for this group
     */
    @JsonProperty("required_tasks")
    public int[] getRequiredTasks() {
        return requiredTasks;
    }
}
