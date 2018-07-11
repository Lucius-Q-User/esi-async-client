package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ResolvedItemLocation implements ApiParameterObject {
    private long itemId;
    public void setItemId(long val) {
        itemId = val;
    }
    @JsonProperty("item_id")
    public long getItemId() {
        return itemId;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
}
