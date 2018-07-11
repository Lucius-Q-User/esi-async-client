package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class NewMailOpenWindow implements ApiParameterObject {
    private String body;
    public void setBody(String val) {
        body = val;
    }
    @JsonProperty("body")
    public String getBody() {
        return body;
    }
    private int[] recipients;
    public void setRecipients(int[] val) {
        recipients = val;
    }
    @JsonProperty("recipients")
    public int[] getRecipients() {
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
    private Integer toCorpOrAllianceId;
    public void setToCorpOrAllianceId(Integer val) {
        toCorpOrAllianceId = val;
    }
    @JsonProperty("to_corp_or_alliance_id")
    public Integer getToCorpOrAllianceId() {
        return toCorpOrAllianceId;
    }
    private Integer toMailingListId;
    public void setToMailingListId(Integer val) {
        toMailingListId = val;
    }
    @JsonProperty("to_mailing_list_id")
    public Integer getToMailingListId() {
        return toMailingListId;
    }
}
