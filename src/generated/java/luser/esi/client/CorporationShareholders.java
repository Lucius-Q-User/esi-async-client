package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationShareholders implements ApiParameterObject {
    private long shareCount;
    /**
     * share_count integer
     */
    public void setShareCount(long val) {
        shareCount = val;
    }
    /**
     * share_count integer
     */
    @JsonProperty("share_count")
    public long getShareCount() {
        return shareCount;
    }
    private int shareholderId;
    /**
     * shareholder_id integer
     */
    public void setShareholderId(int val) {
        shareholderId = val;
    }
    /**
     * shareholder_id integer
     */
    @JsonProperty("shareholder_id")
    public int getShareholderId() {
        return shareholderId;
    }
    private ShareholderTypeEnum shareholderType;
    /**
     * shareholder_type string
     */
    public void setShareholderType(ShareholderTypeEnum val) {
        shareholderType = val;
    }
    /**
     * shareholder_type string
     */
    @JsonProperty("shareholder_type")
    public ShareholderTypeEnum getShareholderType() {
        return shareholderType;
    }
    public static enum ShareholderTypeEnum {
        CHARACTER("character"),
        CORPORATION("corporation");
        private final String stringValue;
        private ShareholderTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static ShareholderTypeEnum fromString(String str) {
            for (ShareholderTypeEnum self : ShareholderTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
