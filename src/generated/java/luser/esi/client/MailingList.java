package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MailingList {
    private int mailingListId;
    /**
     * Mailing list ID
     */
    public void setMailingListId(int val) {
        mailingListId = val;
    }
    /**
     * Mailing list ID
     */
    @JsonProperty("mailing_list_id")
    public int getMailingListId() {
        return mailingListId;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
}
