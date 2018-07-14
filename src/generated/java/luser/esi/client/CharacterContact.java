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
public class CharacterContact implements ApiParameterObject {
    private int contactId;
    /**
     * contact_id integer
     */
    public void setContactId(int val) {
        contactId = val;
    }
    /**
     * contact_id integer
     */
    @JsonProperty("contact_id")
    public int getContactId() {
        return contactId;
    }
    private ContactTypeEnum contactType;
    /**
     * contact_type string
     */
    public void setContactType(ContactTypeEnum val) {
        contactType = val;
    }
    /**
     * contact_type string
     */
    @JsonProperty("contact_type")
    public ContactTypeEnum getContactType() {
        return contactType;
    }
    private Boolean isBlocked;
    /**
     * Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false
     */
    public void setIsBlocked(Boolean val) {
        isBlocked = val;
    }
    /**
     * Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false
     */
    @JsonProperty("is_blocked")
    public Boolean getIsBlocked() {
        return isBlocked;
    }
    private Boolean isWatched;
    /**
     * Whether this contact is being watched
     */
    public void setIsWatched(Boolean val) {
        isWatched = val;
    }
    /**
     * Whether this contact is being watched
     */
    @JsonProperty("is_watched")
    public Boolean getIsWatched() {
        return isWatched;
    }
    private LongArrayList labelIds;
    /**
     * label_ids array
     */
    public void setLabelIds(LongArrayList val) {
        labelIds = val;
    }
    /**
     * label_ids array
     */
    @JsonProperty("label_ids")
    public LongArrayList getLabelIds() {
        return labelIds;
    }
    private float standing;
    /**
     * Standing of the contact
     */
    public void setStanding(float val) {
        standing = val;
    }
    /**
     * Standing of the contact
     */
    @JsonProperty("standing")
    public float getStanding() {
        return standing;
    }
    public static enum ContactTypeEnum {
        CHARACTER("character"),
        CORPORATION("corporation"),
        ALLIANCE("alliance"),
        FACTION("faction");
        private final String stringValue;
        private ContactTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
