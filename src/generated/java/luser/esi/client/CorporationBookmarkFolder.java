package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationBookmarkFolder implements ApiParameterObject {
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
