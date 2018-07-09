package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationContact {
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
    private Boolean isWatched;
    public void setIsWatched(Boolean val) {
        isWatched = val;
    }
    public Boolean getIsWatched() {
        return isWatched;
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
    static CorporationContact fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationContact self = new CorporationContact();
        Map<String, Json> js = json.asJsonMap();
        self.contactId = ApiClientBase.optGetInteger(js.get("contact_id"));
        self.contactType = ContactTypeEnum.fromString(ApiClientBase.optGetString(js.get("contact_type")));
        self.isWatched = ApiClientBase.optGetBoolean(js.get("is_watched"));
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
