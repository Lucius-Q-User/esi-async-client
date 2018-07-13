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
    public void setKillmailHash(String val) {
        killmailHash = val;
    }
    @JsonProperty("killmail_hash")
    public String getKillmailHash() {
        return killmailHash;
    }
    private int killmailId;
    public void setKillmailId(int val) {
        killmailId = val;
    }
    @JsonProperty("killmail_id")
    public int getKillmailId() {
        return killmailId;
    }
}
