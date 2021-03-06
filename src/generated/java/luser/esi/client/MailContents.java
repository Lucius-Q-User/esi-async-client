package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MailContents {
    private String body;
    /**
     * Mail's body
     */
    public void setBody(String val) {
        body = val;
    }
    /**
     * Mail's body
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }
    private Integer from;
    /**
     * From whom the mail was sent
     */
    public void setFrom(Integer val) {
        from = val;
    }
    /**
     * From whom the mail was sent
     */
    @JsonProperty("from")
    public Integer getFrom() {
        return from;
    }
    private IntArrayList labels;
    /**
     * Labels attached to the mail
     */
    public void setLabels(IntArrayList val) {
        labels = val;
    }
    /**
     * Labels attached to the mail
     */
    @JsonProperty("labels")
    public IntArrayList getLabels() {
        return labels;
    }
    private Boolean read;
    /**
     * Whether the mail is flagged as read
     */
    public void setRead(Boolean val) {
        read = val;
    }
    /**
     * Whether the mail is flagged as read
     */
    @JsonProperty("read")
    public Boolean getRead() {
        return read;
    }
    private List<MailRecipient> recipients;
    /**
     * Recipients of the mail
     */
    public void setRecipients(List<MailRecipient> val) {
        recipients = val;
    }
    /**
     * Recipients of the mail
     */
    @JsonProperty("recipients")
    public List<MailRecipient> getRecipients() {
        return recipients;
    }
    private String subject;
    /**
     * Mail subject
     */
    public void setSubject(String val) {
        subject = val;
    }
    /**
     * Mail subject
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }
    private Instant timestamp;
    /**
     * When the mail was sent
     */
    public void setTimestamp(Instant val) {
        timestamp = val;
    }
    /**
     * When the mail was sent
     */
    @JsonProperty("timestamp")
    public Instant getTimestamp() {
        return timestamp;
    }
}
