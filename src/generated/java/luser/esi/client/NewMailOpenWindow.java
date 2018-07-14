package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class NewMailOpenWindow implements ApiParameterObject {
    private String body;
    /**
     * body string
     */
    public void setBody(String val) {
        body = val;
    }
    /**
     * body string
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }
    private IntArrayList recipients;
    /**
     * recipients array
     */
    public void setRecipients(IntArrayList val) {
        recipients = val;
    }
    /**
     * recipients array
     */
    @JsonProperty("recipients")
    public IntArrayList getRecipients() {
        return recipients;
    }
    private String subject;
    /**
     * subject string
     */
    public void setSubject(String val) {
        subject = val;
    }
    /**
     * subject string
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }
    private Integer toCorpOrAllianceId;
    /**
     * to_corp_or_alliance_id integer
     */
    public void setToCorpOrAllianceId(Integer val) {
        toCorpOrAllianceId = val;
    }
    /**
     * to_corp_or_alliance_id integer
     */
    @JsonProperty("to_corp_or_alliance_id")
    public Integer getToCorpOrAllianceId() {
        return toCorpOrAllianceId;
    }
    private Integer toMailingListId;
    /**
     * Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field
     */
    public void setToMailingListId(Integer val) {
        toMailingListId = val;
    }
    /**
     * Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field
     */
    @JsonProperty("to_mailing_list_id")
    public Integer getToMailingListId() {
        return toMailingListId;
    }
}
