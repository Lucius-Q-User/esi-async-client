package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationShareholders {
    private long shareCount;
    public void setShareCount(long val) {
        shareCount = val;
    }
    public long getShareCount() {
        return shareCount;
    }
    private int shareholderId;
    public void setShareholderId(int val) {
        shareholderId = val;
    }
    public int getShareholderId() {
        return shareholderId;
    }
    private ShareholderTypeEnum shareholderType;
    public void setShareholderType(ShareholderTypeEnum val) {
        shareholderType = val;
    }
    public ShareholderTypeEnum getShareholderType() {
        return shareholderType;
    }
    static CorporationShareholders fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationShareholders self = new CorporationShareholders();
        Map<String, Json> js = json.asJsonMap();
        self.shareCount = ApiClientBase.optGetLong(js.get("share_count"));
        self.shareholderId = ApiClientBase.optGetInteger(js.get("shareholder_id"));
        self.shareholderType = ShareholderTypeEnum.fromString(ApiClientBase.optGetString(js.get("shareholder_type")));
        return self;
    }
    public static enum ShareholderTypeEnum {
        CHARACTER("character"),
        CORPORATION("corporation");
        public final String stringValue;
        private ShareholderTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
