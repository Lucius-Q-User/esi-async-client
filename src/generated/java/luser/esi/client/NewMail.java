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
public class NewMail implements ApiParameterObject {
    private Long approvedCost;
    /**
     * approved_cost integer
     */
    public void setApprovedCost(Long val) {
        approvedCost = val;
    }
    /**
     * approved_cost integer
     */
    @JsonProperty("approved_cost")
    public Long getApprovedCost() {
        return approvedCost;
    }
    private String body;
    /**
     * body string
     */
    public void setBody(String val) {
        body = val;
    }
    /**
     * body string
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }
    private List<MailRecipient> recipients;
    /**
     * recipients array
     */
    public void setRecipients(List<MailRecipient> val) {
        recipients = val;
    }
    /**
     * recipients array
     */
    @JsonProperty("recipients")
    public List<MailRecipient> getRecipients() {
        return recipients;
    }
    private String subject;
    /**
     * subject string
     */
    public void setSubject(String val) {
        subject = val;
    }
    /**
     * subject string
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }
}
