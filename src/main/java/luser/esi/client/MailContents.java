package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MailContents implements ApiParameterObject {
    private String body;
    public void setBody(String val) {
        body = val;
    }
    @JsonProperty("body")
    public String getBody() {
        return body;
    }
    private Integer from;
    public void setFrom(Integer val) {
        from = val;
    }
    @JsonProperty("from")
    public Integer getFrom() {
        return from;
    }
    private int[] labels;
    public void setLabels(int[] val) {
        labels = val;
    }
    @JsonProperty("labels")
    public int[] getLabels() {
        return labels;
    }
    private Boolean read;
    public void setRead(Boolean val) {
        read = val;
    }
    @JsonProperty("read")
    public Boolean getRead() {
        return read;
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
