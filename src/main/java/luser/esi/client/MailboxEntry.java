package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MailboxEntry implements ApiParameterObject {
    private Integer from;
    public void setFrom(Integer val) {
        from = val;
    }
    @JsonProperty("from")
    public Integer getFrom() {
        return from;
    }
    private Boolean isRead;
    public void setIsRead(Boolean val) {
        isRead = val;
    }
    @JsonProperty("is_read")
    public Boolean getIsRead() {
        return isRead;
    }
    private int[] labels;
    public void setLabels(int[] val) {
        labels = val;
    }
    @JsonProperty("labels")
    public int[] getLabels() {
        return labels;
    }
    private Integer mailId;
    public void setMailId(Integer val) {
        mailId = val;
    }
    @JsonProperty("mail_id")
    public Integer getMailId() {
        return mailId;
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
    private Instant timestamp;
    public void setTimestamp(Instant val) {
        timestamp = val;
    }
    @JsonProperty("timestamp")
    public Instant getTimestamp() {
        return timestamp;
    }
}
