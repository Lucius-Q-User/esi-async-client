package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemCategoryInfo implements ApiParameterObject {
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
    private IntArrayList groups;
    /**
     * groups array
     */
    public void setGroups(IntArrayList val) {
        groups = val;
    }
    /**
     * groups array
     */
    @JsonProperty("groups")
    public IntArrayList getGroups() {
        return groups;
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
}
