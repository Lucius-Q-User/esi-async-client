package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ItemCategoryInfo {
    private int categoryId;
    public void setCategoryId(int val) {
        categoryId = val;
    }
    public int getCategoryId() {
        return categoryId;
    }
    private int[] groups;
    public void setGroups(int[] val) {
        groups = val;
    }
    public int[] getGroups() {
        return groups;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private boolean published;
    public void setPublished(boolean val) {
        published = val;
    }
    public boolean getPublished() {
        return published;
    }
    static ItemCategoryInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ItemCategoryInfo self = new ItemCategoryInfo();
        Map<String, Json> js = json.asJsonMap();
        self.categoryId = ApiClientBase.optGetInteger(js.get("category_id"));
        {
            List<Json> jl = js.get("groups").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.groups = rt;
        }
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.published = ApiClientBase.optGetBoolean(js.get("published"));
        return self;
    }
}
