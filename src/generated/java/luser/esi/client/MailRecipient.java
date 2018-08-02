package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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
    public static enum RecipientTypeEnum implements StringyEnum{
        ALLIANCE("alliance"),
        CHARACTER("character"),
        CORPORATION("corporation"),
        MAILING_LIST("mailing_list");
        private final String stringValue;
        private RecipientTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
