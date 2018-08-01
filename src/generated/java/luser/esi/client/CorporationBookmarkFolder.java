package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationBookmarkFolder {
    private Integer creatorId;
    /**
     * creator_id integer
     */
    public void setCreatorId(Integer val) {
        creatorId = val;
    }
    /**
     * creator_id integer
     */
    @JsonProperty("creator_id")
    public Integer getCreatorId() {
        return creatorId;
    }
    private int folderId;
    /**
     * folder_id integer
     */
    public void setFolderId(int val) {
        folderId = val;
    }
    /**
     * folder_id integer
     */
    @JsonProperty("folder_id")
    public int getFolderId() {
        return folderId;
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
}
