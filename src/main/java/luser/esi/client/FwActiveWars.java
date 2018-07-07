package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwActiveWars {
    private int againstId;
    public void setAgainstId(int val) {
        againstId = val;
    }
    public int getAgainstId() {
        return againstId;
    }
    private int factionId;
    public void setFactionId(int val) {
        factionId = val;
    }
    public int getFactionId() {
        return factionId;
    }
    static FwActiveWars fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwActiveWars self = new FwActiveWars();
        Map<String, Json> js = json.asJsonMap();
        self.againstId = ApiClientBase.optGetInteger(js.get("against_id"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        return self;
    }
}
