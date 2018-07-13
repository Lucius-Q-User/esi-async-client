package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ItemCategoryInfo implements ApiParameterObject {
    private int categoryId;
    public void setCategoryId(int val) {
        categoryId = val;
    }
    @JsonProperty("category_id")
    public int getCategoryId() {
        return categoryId;
    }
    private int[] groups;
    public void setGroups(int[] val) {
        groups = val;
    }
    @JsonProperty("groups")
    public int[] getGroups() {
        return groups;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private boolean published;
    public void setPublished(boolean val) {
        published = val;
    }
    @JsonProperty("published")
    public boolean getPublished() {
        return published;
    }
}
