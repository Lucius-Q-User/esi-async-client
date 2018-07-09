package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MailboxEntry {
    private Integer from;
    public void setFrom(Integer val) {
        from = val;
    }
    public Integer getFrom() {
        return from;
    }
    private Boolean isRead;
    public void setIsRead(Boolean val) {
        isRead = val;
    }
    public Boolean getIsRead() {
        return isRead;
    }
    private int[] labels;
    public void setLabels(int[] val) {
        labels = val;
    }
    public int[] getLabels() {
        return labels;
    }
    private Integer mailId;
    public void setMailId(Integer val) {
        mailId = val;
    }
    public Integer getMailId() {
        return mailId;
    }
    private List<MailRecipient> recipients;
    public void setRecipients(List<MailRecipient> val) {
        recipients = val;
    }
    public List<MailRecipient> getRecipients() {
        return recipients;
    }
    private String subject;
    public void setSubject(String val) {
        subject = val;
    }
    public String getSubject() {
        return subject;
    }
    private Instant timestamp;
    public void setTimestamp(Instant val) {
        timestamp = val;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
    static MailboxEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MailboxEntry self = new MailboxEntry();
        Map<String, Json> js = json.asJsonMap();
        self.from = ApiClientBase.optGetInteger(js.get("from"));
        self.isRead = ApiClientBase.optGetBoolean(js.get("is_read"));
        {
            List<Json> jl = js.get("labels").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.labels = rt;
        }
        self.mailId = ApiClientBase.optGetInteger(js.get("mail_id"));
        {
            List<Json> jl = js.get("recipients").asJsonList();
            List<MailRecipient> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(MailRecipient.fromJson(jl.get(i)));
            }
            self.recipients = rt;
        }
        self.subject = ApiClientBase.optGetString(js.get("subject"));
        self.timestamp = ApiClientBase.optGetInstant(js.get("timestamp"));
        return self;
    }
}
