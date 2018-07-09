package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class KillmailRef {
    private String killmailHash;
    public void setKillmailHash(String val) {
        killmailHash = val;
    }
    public String getKillmailHash() {
        return killmailHash;
    }
    private int killmailId;
    public void setKillmailId(int val) {
        killmailId = val;
    }
    public int getKillmailId() {
        return killmailId;
    }
    static KillmailRef fromJson(Json json) {
        if (json == null) {
            return null;
        }
        KillmailRef self = new KillmailRef();
        Map<String, Json> js = json.asJsonMap();
        self.killmailHash = ApiClientBase.optGetString(js.get("killmail_hash"));
        self.killmailId = ApiClientBase.optGetInteger(js.get("killmail_id"));
        return self;
    }
}
