package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationIssuedMedals {
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    public int getCharacterId() {
        return characterId;
    }
    private String issuedAt;
    public void setIssuedAt(String val) {
        issuedAt = val;
    }
    public String getIssuedAt() {
        return issuedAt;
    }
    private int issuerId;
    public void setIssuerId(int val) {
        issuerId = val;
    }
    public int getIssuerId() {
        return issuerId;
    }
    private int medalId;
    public void setMedalId(int val) {
        medalId = val;
    }
    public int getMedalId() {
        return medalId;
    }
    private String reason;
    public void setReason(String val) {
        reason = val;
    }
    public String getReason() {
        return reason;
    }
    private StatusEnum status;
    public void setStatus(StatusEnum val) {
        status = val;
    }
    public StatusEnum getStatus() {
        return status;
    }
    static CorporationIssuedMedals fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationIssuedMedals self = new CorporationIssuedMedals();
        Map<String, Json> js = json.asJsonMap();
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.issuedAt = ApiClientBase.optGetString(js.get("issued_at"));
        self.issuerId = ApiClientBase.optGetInteger(js.get("issuer_id"));
        self.medalId = ApiClientBase.optGetInteger(js.get("medal_id"));
        self.reason = ApiClientBase.optGetString(js.get("reason"));
        self.status = StatusEnum.fromString(ApiClientBase.optGetString(js.get("status")));
        return self;
    }
    public static enum StatusEnum {
        PRIVATE("private"),
        PUBLIC("public");
        public final String stringValue;
        private StatusEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static StatusEnum fromString(String str) {
            for (StatusEnum self : StatusEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
