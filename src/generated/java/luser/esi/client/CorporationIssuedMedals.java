package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationIssuedMedals {
    private int characterId;
    /**
     * ID of the character who was rewarded this medal
     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * ID of the character who was rewarded this medal
     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private Instant issuedAt;
    /**
     * issued_at string
     */
    public void setIssuedAt(Instant val) {
        issuedAt = val;
    }
    /**
     * issued_at string
     */
    @JsonProperty("issued_at")
    public Instant getIssuedAt() {
        return issuedAt;
    }
    private int issuerId;
    /**
     * ID of the character who issued the medal
     */
    public void setIssuerId(int val) {
        issuerId = val;
    }
    /**
     * ID of the character who issued the medal
     */
    @JsonProperty("issuer_id")
    public int getIssuerId() {
        return issuerId;
    }
    private int medalId;
    /**
     * medal_id integer
     */
    public void setMedalId(int val) {
        medalId = val;
    }
    /**
     * medal_id integer
     */
    @JsonProperty("medal_id")
    public int getMedalId() {
        return medalId;
    }
    private String reason;
    /**
     * reason string
     */
    public void setReason(String val) {
        reason = val;
    }
    /**
     * reason string
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }
    private MedalStatusEnum status;
    /**
     * status string
     */
    public void setStatus(MedalStatusEnum val) {
        status = val;
    }
    /**
     * status string
     */
    @JsonProperty("status")
    public MedalStatusEnum getStatus() {
        return status;
    }
}
