package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationMemberTitle {
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    public int getCharacterId() {
        return characterId;
    }
    private int[] titles;
    public void setTitles(int[] val) {
        titles = val;
    }
    public int[] getTitles() {
        return titles;
    }
    static CorporationMemberTitle fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationMemberTitle self = new CorporationMemberTitle();
        Map<String, Json> js = json.asJsonMap();
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        {
            List<Json> jl = js.get("titles").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.titles = rt;
        }
        return self;
    }
}
