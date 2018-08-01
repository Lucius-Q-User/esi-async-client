package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MailLabels {
    private List<MailLabel> labels;
    /**
     * labels array
     */
    public void setLabels(List<MailLabel> val) {
        labels = val;
    }
    /**
     * labels array
     */
    @JsonProperty("labels")
    public List<MailLabel> getLabels() {
        return labels;
    }
    private Integer totalUnreadCount;
    /**
     * total_unread_count integer
     */
    public void setTotalUnreadCount(Integer val) {
        totalUnreadCount = val;
    }
    /**
     * total_unread_count integer
     */
    @JsonProperty("total_unread_count")
    public Integer getTotalUnreadCount() {
        return totalUnreadCount;
    }
}
