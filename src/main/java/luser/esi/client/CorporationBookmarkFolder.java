package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationBookmarkFolder {
    private Integer creatorId;
    public void setCreatorId(Integer val) {
        creatorId = val;
    }
    public Integer getCreatorId() {
        return creatorId;
    }
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
    static CorporationBookmarkFolder fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationBookmarkFolder self = new CorporationBookmarkFolder();
        Map<String, Json> js = json.asJsonMap();
        self.creatorId = ApiClientBase.optGetInteger(js.get("creator_id"));
        self.folderId = ApiClientBase.optGetInteger(js.get("folder_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
}
