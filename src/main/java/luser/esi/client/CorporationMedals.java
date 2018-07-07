package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationMedals {
    private String createdAt;
    public void setCreatedAt(String val) {
        createdAt = val;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    private int creatorId;
    public void setCreatorId(int val) {
        creatorId = val;
    }
    public int getCreatorId() {
        return creatorId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private int medalId;
    public void setMedalId(int val) {
        medalId = val;
    }
    public int getMedalId() {
        return medalId;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    public String getTitle() {
        return title;
    }
    static CorporationMedals fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationMedals self = new CorporationMedals();
        Map<String, Json> js = json.asJsonMap();
        self.createdAt = ApiClientBase.optGetString(js.get("created_at"));
        self.creatorId = ApiClientBase.optGetInteger(js.get("creator_id"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.medalId = ApiClientBase.optGetInteger(js.get("medal_id"));
        self.title = ApiClientBase.optGetString(js.get("title"));
        return self;
    }
}
