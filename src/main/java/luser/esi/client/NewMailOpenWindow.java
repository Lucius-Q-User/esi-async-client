package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class NewMailOpenWindow extends JsonConvertible {
    private String body;
    public void setBody(String val) {
        body = val;
    }
    public String getBody() {
        return body;
    }
    private int[] recipients;
    public void setRecipients(int[] val) {
        recipients = val;
    }
    public int[] getRecipients() {
        return recipients;
    }
    private String subject;
    public void setSubject(String val) {
        subject = val;
    }
    public String getSubject() {
        return subject;
    }
    private Integer toCorpOrAllianceId;
    public void setToCorpOrAllianceId(Integer val) {
        toCorpOrAllianceId = val;
    }
    public Integer getToCorpOrAllianceId() {
        return toCorpOrAllianceId;
    }
    private Integer toMailingListId;
    public void setToMailingListId(Integer val) {
        toMailingListId = val;
    }
    public Integer getToMailingListId() {
        return toMailingListId;
    }
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("body", Json.make(body));
        {
            Json arr = Json.array();
            for (int i : recipients){
                arr.add(Json.make(i));
            }
            object.set("recipients", arr);
        }
        object.set("subject", Json.make(subject));
        object.set("to_corp_or_alliance_id", Json.make(toCorpOrAllianceId));
        object.set("to_mailing_list_id", Json.make(toMailingListId));
        return object;
    }
}
