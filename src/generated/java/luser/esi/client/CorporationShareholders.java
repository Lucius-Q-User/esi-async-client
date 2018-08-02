package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class CorporationShareholders {
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
    public static enum ShareholderTypeEnum implements StringyEnum{
        CHARACTER("character"),
        CORPORATION("corporation");
        private final String stringValue;
        private ShareholderTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
