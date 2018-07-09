package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class BookmarkInfo {
    private int bookmarkId;
    public void setBookmarkId(int val) {
        bookmarkId = val;
    }
    public int getBookmarkId() {
        return bookmarkId;
    }
    private Coordinate coordinates;
    public void setCoordinates(Coordinate val) {
        coordinates = val;
    }
    public Coordinate getCoordinates() {
        return coordinates;
    }
    private Instant created;
    public void setCreated(Instant val) {
        created = val;
    }
    public Instant getCreated() {
        return created;
    }
    private int creatorId;
    public void setCreatorId(int val) {
        creatorId = val;
    }
    public int getCreatorId() {
        return creatorId;
    }
    private Integer folderId;
    public void setFolderId(Integer val) {
        folderId = val;
    }
    public Integer getFolderId() {
        return folderId;
    }
    private BookmarkedItem item;
    public void setItem(BookmarkedItem val) {
        item = val;
    }
    public BookmarkedItem getItem() {
        return item;
    }
    private String label;
    public void setLabel(String val) {
        label = val;
    }
    public String getLabel() {
        return label;
    }
    private int locationId;
    public void setLocationId(int val) {
        locationId = val;
    }
    public int getLocationId() {
        return locationId;
    }
    private String notes;
    public void setNotes(String val) {
        notes = val;
    }
    public String getNotes() {
        return notes;
    }
    static BookmarkInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        BookmarkInfo self = new BookmarkInfo();
        Map<String, Json> js = json.asJsonMap();
        self.bookmarkId = ApiClientBase.optGetInteger(js.get("bookmark_id"));
        self.coordinates = Coordinate.fromJson(js.get("coordinates"));
        self.created = ApiClientBase.optGetInstant(js.get("created"));
        self.creatorId = ApiClientBase.optGetInteger(js.get("creator_id"));
        self.folderId = ApiClientBase.optGetInteger(js.get("folder_id"));
        self.item = BookmarkedItem.fromJson(js.get("item"));
        self.label = ApiClientBase.optGetString(js.get("label"));
        self.locationId = ApiClientBase.optGetInteger(js.get("location_id"));
        self.notes = ApiClientBase.optGetString(js.get("notes"));
        return self;
    }
}
