package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class NewMail implements ApiParameterObject {
    private Long approvedCost;
    public void setApprovedCost(Long val) {
        approvedCost = val;
    }
    @JsonProperty("approved_cost")
    public Long getApprovedCost() {
        return approvedCost;
    }
    private String body;
    public void setBody(String val) {
        body = val;
    }
    @JsonProperty("body")
    public String getBody() {
        return body;
    }
    private List<MailRecipient> recipients;
    public void setRecipients(List<MailRecipient> val) {
        recipients = val;
    }
    @JsonProperty("recipients")
    public List<MailRecipient> getRecipients() {
        return recipients;
    }
    private String subject;
    public void setSubject(String val) {
        subject = val;
    }
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }
}
