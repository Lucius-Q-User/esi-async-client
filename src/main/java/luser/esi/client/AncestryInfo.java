package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class AncestryInfo {
    private int bloodlineId;
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    public int getBloodlineId() {
        return bloodlineId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private Integer iconId;
    public void setIconId(Integer val) {
        iconId = val;
    }
    public Integer getIconId() {
        return iconId;
    }
    private int id;
    public void setId(int val) {
        id = val;
    }
    public int getId() {
        return id;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private String shortDescription;
    public void setShortDescription(String val) {
        shortDescription = val;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    static AncestryInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        AncestryInfo self = new AncestryInfo();
        Map<String, Json> js = json.asJsonMap();
        self.bloodlineId = ApiClientBase.optGetInteger(js.get("bloodline_id"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.iconId = ApiClientBase.optGetInteger(js.get("icon_id"));
        self.id = ApiClientBase.optGetInteger(js.get("id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.shortDescription = ApiClientBase.optGetString(js.get("short_description"));
        return self;
    }
}
