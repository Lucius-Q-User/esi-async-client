package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MiningObserverInfo implements ApiParameterObject {
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private String lastUpdated;
    public void setLastUpdated(String val) {
        lastUpdated = val;
    }
    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }
    private long quantity;
    public void setQuantity(long val) {
        quantity = val;
    }
    @JsonProperty("quantity")
    public long getQuantity() {
        return quantity;
    }
    private int recordedCorporationId;
    public void setRecordedCorporationId(int val) {
        recordedCorporationId = val;
    }
    @JsonProperty("recorded_corporation_id")
    public int getRecordedCorporationId() {
        return recordedCorporationId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
