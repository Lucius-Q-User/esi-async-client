package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MailLabel {
    private MailLabelColorEnum color;
    /**
     * color string
     */
    public void setColor(MailLabelColorEnum val) {
        color = val;
    }
    /**
     * color string
     */
    @JsonProperty("color")
    public MailLabelColorEnum getColor() {
        return color;
    }
    private Integer labelId;
    /**
     * label_id integer
     */
    public void setLabelId(Integer val) {
        labelId = val;
    }
    /**
     * label_id integer
     */
    @JsonProperty("label_id")
    public Integer getLabelId() {
        return labelId;
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
    private Integer unreadCount;
    /**
     * unread_count integer
     */
    public void setUnreadCount(Integer val) {
        unreadCount = val;
    }
    /**
     * unread_count integer
     */
    @JsonProperty("unread_count")
    public Integer getUnreadCount() {
        return unreadCount;
    }
}
