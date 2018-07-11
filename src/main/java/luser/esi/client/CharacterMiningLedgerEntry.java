package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterMiningLedgerEntry implements ApiParameterObject {
    private String date;
    public void setDate(String val) {
        date = val;
    }
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    private long quantity;
    public void setQuantity(long val) {
        quantity = val;
    }
    @JsonProperty("quantity")
    public long getQuantity() {
        return quantity;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
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
