package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MailingList {
    private int mailingListId;
    public void setMailingListId(int val) {
        mailingListId = val;
    }
    public int getMailingListId() {
        return mailingListId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    static MailingList fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MailingList self = new MailingList();
        Map<String, Json> js = json.asJsonMap();
        self.mailingListId = ApiClientBase.optGetInteger(js.get("mailing_list_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
}
