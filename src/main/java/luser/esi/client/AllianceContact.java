package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class AllianceContact {
    private int contactId;
    public void setContactId(int val) {
        contactId = val;
    }
    public int getContactId() {
        return contactId;
    }
    private ContactTypeEnum contactType;
    public void setContactType(ContactTypeEnum val) {
        contactType = val;
    }
    public ContactTypeEnum getContactType() {
        return contactType;
    }
    private long[] labelIds;
    public void setLabelIds(long[] val) {
        labelIds = val;
    }
    public long[] getLabelIds() {
        return labelIds;
    }
    private float standing;
    public void setStanding(float val) {
        standing = val;
    }
    public float getStanding() {
        return standing;
    }
    static AllianceContact fromJson(Json json) {
        if (json == null) {
            return null;
        }
        AllianceContact self = new AllianceContact();
        Map<String, Json> js = json.asJsonMap();
        self.contactId = ApiClientBase.optGetInteger(js.get("contact_id"));
        self.contactType = ContactTypeEnum.fromString(ApiClientBase.optGetString(js.get("contact_type")));
        {
            List<Json> jl = js.get("label_ids").asJsonList();
            long[] rt = new long[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asLong();
            }
            self.labelIds = rt;
        }
        self.standing = ApiClientBase.optGetFloat(js.get("standing"));
        return self;
    }
    public static enum ContactTypeEnum {
        CHARACTER("character"),
        CORPORATION("corporation"),
        ALLIANCE("alliance"),
        FACTION("faction");
        public final String stringValue;
        private ContactTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static ContactTypeEnum fromString(String str) {
            for (ContactTypeEnum self : ContactTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}