package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BookmarkInfo implements ApiParameterObject {
    private int bookmarkId;
    /**
     * bookmark_id integer
     */
    public void setBookmarkId(int val) {
        bookmarkId = val;
    }
    /**
     * bookmark_id integer
     */
    @JsonProperty("bookmark_id")
    public int getBookmarkId() {
        return bookmarkId;
    }
    private Coordinate coordinates;
    /**
     * Optional object that is returned if a bookmark was made on a planet or a random location in space.
     */
    public void setCoordinates(Coordinate val) {
        coordinates = val;
    }
    /**
     * Optional object that is returned if a bookmark was made on a planet or a random location in space.
     */
    @JsonProperty("coordinates")
    public Coordinate getCoordinates() {
        return coordinates;
    }
    private Instant created;
    /**
     * created string
     */
    public void setCreated(Instant val) {
        created = val;
    }
    /**
     * created string
     */
    @JsonProperty("created")
    public Instant getCreated() {
        return created;
    }
    private int creatorId;
    /**
     * creator_id integer
     */
    public void setCreatorId(int val) {
        creatorId = val;
    }
    /**
     * creator_id integer
     */
    @JsonProperty("creator_id")
    public int getCreatorId() {
        return creatorId;
    }
    private Integer folderId;
    /**
     * folder_id integer
     */
    public void setFolderId(Integer val) {
        folderId = val;
    }
    /**
     * folder_id integer
     */
    @JsonProperty("folder_id")
    public Integer getFolderId() {
        return folderId;
    }
    private BookmarkedItem item;
    /**
     * Optional object that is returned if a bookmark was made on a particular item.
     */
    public void setItem(BookmarkedItem val) {
        item = val;
    }
    /**
     * Optional object that is returned if a bookmark was made on a particular item.
     */
    @JsonProperty("item")
    public BookmarkedItem getItem() {
        return item;
    }
    private String label;
    /**
     * label string
     */
    public void setLabel(String val) {
        label = val;
    }
    /**
     * label string
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }
    private int locationId;
    /**
     * location_id integer
     */
    public void setLocationId(int val) {
        locationId = val;
    }
    /**
     * location_id integer
     */
    @JsonProperty("location_id")
    public int getLocationId() {
        return locationId;
    }
    private String notes;
    /**
     * notes string
     */
    public void setNotes(String val) {
        notes = val;
    }
    /**
     * notes string
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }
}
