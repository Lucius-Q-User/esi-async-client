package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class BookmarkInfo implements ApiParameterObject {
    private int bookmarkId;
    public void setBookmarkId(int val) {
        bookmarkId = val;
    }
    @JsonProperty("bookmark_id")
    public int getBookmarkId() {
        return bookmarkId;
    }
    private Coordinate coordinates;
    public void setCoordinates(Coordinate val) {
        coordinates = val;
    }
    @JsonProperty("coordinates")
    public Coordinate getCoordinates() {
        return coordinates;
    }
    private Instant created;
    public void setCreated(Instant val) {
        created = val;
    }
    @JsonProperty("created")
    public Instant getCreated() {
        return created;
    }
    private int creatorId;
    public void setCreatorId(int val) {
        creatorId = val;
    }
    @JsonProperty("creator_id")
    public int getCreatorId() {
        return creatorId;
    }
    private Integer folderId;
    public void setFolderId(Integer val) {
        folderId = val;
    }
    @JsonProperty("folder_id")
    public Integer getFolderId() {
        return folderId;
    }
    private BookmarkedItem item;
    public void setItem(BookmarkedItem val) {
        item = val;
    }
    @JsonProperty("item")
    public BookmarkedItem getItem() {
        return item;
    }
    private String label;
    public void setLabel(String val) {
        label = val;
    }
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }
    private int locationId;
    public void setLocationId(int val) {
        locationId = val;
    }
    @JsonProperty("location_id")
    public int getLocationId() {
        return locationId;
    }
    private String notes;
    public void setNotes(String val) {
        notes = val;
    }
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }
}
