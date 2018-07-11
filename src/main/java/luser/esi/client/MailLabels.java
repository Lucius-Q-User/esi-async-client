package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MailLabels implements ApiParameterObject {
    private List<MailLabel> labels;
    public void setLabels(List<MailLabel> val) {
        labels = val;
    }
    @JsonProperty("labels")
    public List<MailLabel> getLabels() {
        return labels;
    }
    private Integer totalUnreadCount;
    public void setTotalUnreadCount(Integer val) {
        totalUnreadCount = val;
    }
    @JsonProperty("total_unread_count")
    public Integer getTotalUnreadCount() {
        return totalUnreadCount;
    }
}
