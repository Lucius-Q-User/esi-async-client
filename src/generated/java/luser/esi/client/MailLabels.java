package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MailLabels implements ApiParameterObject {
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
