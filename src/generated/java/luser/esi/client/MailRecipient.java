package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MailRecipient implements ApiParameterObject {
    private int recipientId;
    public void setRecipientId(int val) {
        recipientId = val;
    }
    @JsonProperty("recipient_id")
    public int getRecipientId() {
        return recipientId;
    }
    private RecipientTypeEnum recipientType;
    public void setRecipientType(RecipientTypeEnum val) {
        recipientType = val;
    }
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
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static RecipientTypeEnum fromString(String str) {
            for (RecipientTypeEnum self : RecipientTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}