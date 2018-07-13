package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ItemGroupInfo implements ApiParameterObject {
    private int categoryId;
    /**
     * category_id integer
     */
    public void setCategoryId(int val) {
        categoryId = val;
    }
    /**
     * category_id integer
     */
    @JsonProperty("category_id")
    public int getCategoryId() {
        return categoryId;
    }
    private int groupId;
    /**
     * group_id integer
     */
    public void setGroupId(int val) {
        groupId = val;
    }
    /**
     * group_id integer
     */
    @JsonProperty("group_id")
    public int getGroupId() {
        return groupId;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private boolean published;
    /**
     * published boolean
     */
    public void setPublished(boolean val) {
        published = val;
    }
    /**
     * published boolean
     */
    @JsonProperty("published")
    public boolean getPublished() {
        return published;
    }
    private int[] types;
    /**
     * types array
     */
    public void setTypes(int[] val) {
        types = val;
    }
    /**
     * types array
     */
    @JsonProperty("types")
    public int[] getTypes() {
        return types;
    }
}
