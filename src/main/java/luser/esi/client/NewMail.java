package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class NewMail extends JsonConvertible {
    private Long approvedCost;
    public void setApprovedCost(Long val) {
        approvedCost = val;
    }
    public Long getApprovedCost() {
        return approvedCost;
    }
    private String body;
    public void setBody(String val) {
        body = val;
    }
    public String getBody() {
        return body;
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
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("approved_cost", Json.make(approvedCost));
        object.set("body", Json.make(body));
        {
            Json arr = Json.array();
            for (JsonConvertible i : recipients){
                arr.add(i.toJson());
            }
            object.set("recipients", arr);
        }
        object.set("subject", Json.make(subject));
        return object;
    }
}
