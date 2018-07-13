package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterBookmarksFolder implements ApiParameterObject {
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
