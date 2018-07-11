package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MailingList implements ApiParameterObject {
    private int mailingListId;
    public void setMailingListId(int val) {
        mailingListId = val;
    }
    @JsonProperty("mailing_list_id")
    public int getMailingListId() {
        return mailingListId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
}
