package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwCharacterLeaderboardEntry {
    private Integer amount;
    public void setAmount(Integer val) {
        amount = val;
    }
    public Integer getAmount() {
        return amount;
    }
    private Integer characterId;
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    public Integer getCharacterId() {
        return characterId;
    }
    static FwCharacterLeaderboardEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwCharacterLeaderboardEntry self = new FwCharacterLeaderboardEntry();
        Map<String, Json> js = json.asJsonMap();
        self.amount = ApiClientBase.optGetInteger(js.get("amount"));
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        return self;
    }
}
