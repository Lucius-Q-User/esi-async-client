package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MailboxEntry implements ApiParameterObject {
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
    private Boolean isRead;
    /**
     * is_read boolean
     */
    public void setIsRead(Boolean val) {
        isRead = val;
    }
    /**
     * is_read boolean
     */
    @JsonProperty("is_read")
    public Boolean getIsRead() {
        return isRead;
    }
    private IntArrayList labels;
    /**
     * labels array
     */
    public void setLabels(IntArrayList val) {
        labels = val;
    }
    /**
     * labels array
     */
    @JsonProperty("labels")
    public IntArrayList getLabels() {
        return labels;
    }
    private Integer mailId;
    /**
     * mail_id integer
     */
    public void setMailId(Integer val) {
        mailId = val;
    }
    /**
     * mail_id integer
     */
    @JsonProperty("mail_id")
    public Integer getMailId() {
        return mailId;
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
