package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class KillmailRef implements ApiParameterObject {
    private String killmailHash;
    /**
     * A hash of this killmail
     */
    public void setKillmailHash(String val) {
        killmailHash = val;
    }
    /**
     * A hash of this killmail
     */
    @JsonProperty("killmail_hash")
    public String getKillmailHash() {
        return killmailHash;
    }
    private int killmailId;
    /**
     * ID of this killmail
     */
    public void setKillmailId(int val) {
        killmailId = val;
    }
    /**
     * ID of this killmail
     */
    @JsonProperty("killmail_id")
    public int getKillmailId() {
        return killmailId;
    }
}
