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
public class MiningObserverInfo implements ApiParameterObject {
    private int characterId;
    /**
     * The character that did the mining

     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * The character that did the mining

     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private String lastUpdated;
    /**
     * last_updated string
     */
    public void setLastUpdated(String val) {
        lastUpdated = val;
    }
    /**
     * last_updated string
     */
    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }
    private long quantity;
    /**
     * quantity integer
     */
    public void setQuantity(long val) {
        quantity = val;
    }
    /**
     * quantity integer
     */
    @JsonProperty("quantity")
    public long getQuantity() {
        return quantity;
    }
    private int recordedCorporationId;
    /**
     * The corporation id of the character at the time data was recorded.

     */
    public void setRecordedCorporationId(int val) {
        recordedCorporationId = val;
    }
    /**
     * The corporation id of the character at the time data was recorded.

     */
    @JsonProperty("recorded_corporation_id")
    public int getRecordedCorporationId() {
        return recordedCorporationId;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
