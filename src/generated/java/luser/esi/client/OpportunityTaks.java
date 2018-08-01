package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpportunityTaks {
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
