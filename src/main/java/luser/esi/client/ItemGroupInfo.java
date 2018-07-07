package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ItemGroupInfo {
    private int categoryId;
    public void setCategoryId(int val) {
        categoryId = val;
    }
    public int getCategoryId() {
        return categoryId;
    }
    private int groupId;
    public void setGroupId(int val) {
        groupId = val;
    }
    public int getGroupId() {
        return groupId;
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
    private int[] types;
    public void setTypes(int[] val) {
        types = val;
    }
    public int[] getTypes() {
        return types;
    }
    static ItemGroupInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ItemGroupInfo self = new ItemGroupInfo();
        Map<String, Json> js = json.asJsonMap();
        self.categoryId = ApiClientBase.optGetInteger(js.get("category_id"));
        self.groupId = ApiClientBase.optGetInteger(js.get("group_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.published = ApiClientBase.optGetBoolean(js.get("published"));
        {
            List<Json> jl = js.get("types").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.types = rt;
        }
        return self;
    }
}
