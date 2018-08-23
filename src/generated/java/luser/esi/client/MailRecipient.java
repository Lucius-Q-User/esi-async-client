package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MailRecipient {
    private int recipientId;
    /**
     * recipient_id integer
     */
    public void setRecipientId(int val) {
        recipientId = val;
    }
    /**
     * recipient_id integer
     */
    @JsonProperty("recipient_id")
    public int getRecipientId() {
        return recipientId;
    }
    private RecipientTypeEnum recipientType;
    /**
     * recipient_type string
     */
    public void setRecipientType(RecipientTypeEnum val) {
        recipientType = val;
    }
    /**
     * recipient_type string
     */
    @JsonProperty("recipient_type")
    public RecipientTypeEnum getRecipientType() {
        return recipientType;
    }
    public static enum RecipientTypeEnum {
        ALLIANCE("alliance"),
        CHARACTER("character"),
        CORPORATION("corporation"),
        MAILING_LIST("mailing_list");
        private final String stringValue;
        private RecipientTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        public String toString() {
            return stringValue;
        }
    }
}
