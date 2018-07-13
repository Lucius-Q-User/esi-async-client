package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationIssuedMedals implements ApiParameterObject {
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private Instant issuedAt;
    public void setIssuedAt(Instant val) {
        issuedAt = val;
    }
    @JsonProperty("issued_at")
    public Instant getIssuedAt() {
        return issuedAt;
    }
    private int issuerId;
    public void setIssuerId(int val) {
        issuerId = val;
    }
    @JsonProperty("issuer_id")
    public int getIssuerId() {
        return issuerId;
    }
    private int medalId;
    public void setMedalId(int val) {
        medalId = val;
    }
    @JsonProperty("medal_id")
    public int getMedalId() {
        return medalId;
    }
    private String reason;
    public void setReason(String val) {
        reason = val;
    }
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }
    private StatusEnum status;
    public void setStatus(StatusEnum val) {
        status = val;
    }
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }
    public static enum StatusEnum {
        PRIVATE("private"),
        PUBLIC("public");
        private final String stringValue;
        private StatusEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
