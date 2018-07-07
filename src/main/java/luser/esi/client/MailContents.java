package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MailContents {
    private String body;
    public void setBody(String val) {
        body = val;
    }
    public String getBody() {
        return body;
    }
    private Integer from;
    public void setFrom(Integer val) {
        from = val;
    }
    public Integer getFrom() {
        return from;
    }
    private int[] labels;
    public void setLabels(int[] val) {
        labels = val;
    }
    public int[] getLabels() {
        return labels;
    }
    private Boolean read;
    public void setRead(Boolean val) {
        read = val;
    }
    public Boolean getRead() {
        return read;
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
    private String timestamp;
    public void setTimestamp(String val) {
        timestamp = val;
    }
    public String getTimestamp() {
        return timestamp;
    }
    static MailContents fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MailContents self = new MailContents();
        Map<String, Json> js = json.asJsonMap();
        self.body = ApiClientBase.optGetString(js.get("body"));
        self.from = ApiClientBase.optGetInteger(js.get("from"));
        {
            List<Json> jl = js.get("labels").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.labels = rt;
        }
        self.read = ApiClientBase.optGetBoolean(js.get("read"));
        {
            List<Json> jl = js.get("recipients").asJsonList();
            List<MailRecipient> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, MailRecipient.fromJson(jl.get(i)));
            }
            self.recipients = rt;
        }

        self.subject = ApiClientBase.optGetString(js.get("subject"));
        self.timestamp = ApiClientBase.optGetString(js.get("timestamp"));
        return self;
    }
}
