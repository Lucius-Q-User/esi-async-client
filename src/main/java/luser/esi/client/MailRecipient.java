package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MailRecipient extends JsonConvertible {
    private int recipientId;
    public void setRecipientId(int val) {
        recipientId = val;
    }
    public int getRecipientId() {
        return recipientId;
    }
    private RecipientTypeEnum recipientType;
    public void setRecipientType(RecipientTypeEnum val) {
        recipientType = val;
    }
    public RecipientTypeEnum getRecipientType() {
        return recipientType;
    }
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("recipient_id", Json.make(recipientId));
        object.set("recipient_type", Json.make(recipientType.stringValue));
        return object;
    }
    static MailRecipient fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MailRecipient self = new MailRecipient();
        Map<String, Json> js = json.asJsonMap();
        self.recipientId = ApiClientBase.optGetInteger(js.get("recipient_id"));
        self.recipientType = RecipientTypeEnum.fromString(ApiClientBase.optGetString(js.get("recipient_type")));
        return self;
    }
    public static enum RecipientTypeEnum {
        ALLIANCE("alliance"),
        CHARACTER("character"),
        CORPORATION("corporation"),
        MAILING_LIST("mailing_list");
        public final String stringValue;
        private RecipientTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
