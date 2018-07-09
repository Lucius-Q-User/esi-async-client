package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterBookmarksFolder {
    private int folderId;
    public void setFolderId(int val) {
        folderId = val;
    }
    public int getFolderId() {
        return folderId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    static CharacterBookmarksFolder fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterBookmarksFolder self = new CharacterBookmarksFolder();
        Map<String, Json> js = json.asJsonMap();
        self.folderId = ApiClientBase.optGetInteger(js.get("folder_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
}
